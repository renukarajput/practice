package edu.ren.multiThreading;

/**
 * Created by rrn3194 on 9/28/18.
  This is "missed notification problem due to use of wait notify and
 lack of proper synchronization

 r1--is thread running r1
 If r1 finished it's "if block and sends the notification" and r2 has not yet
 called wait ,then the notification is missed by r2,then it will take the lock and go in waiting state
 even when r1 has set flag as false(so that if block of r2 execute) ,now loop in r1 continues and executes else block
 then it also goes in waiting state.
 */


public class HiByeDemo {
    int count = 0;
    volatile boolean flag = true;

    final Object lock = new Object();

    private int MAX_COUNT=Integer.MAX_VALUE;
    Runnable r1 = () -> {
        while (count < MAX_COUNT) {
            if (flag == true) {
                count++;
                System.out.println(Thread.currentThread().getName()+" Hiii ----- "+count+" "+flag);
                flag = false;
                synchronized (lock) {
                    lock.notify();
                }
            } else {
                synchronized (lock) {
                    try {
                        System.out.println(Thread.currentThread().getName()+" waiting");
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        e.printStackTrace();
                    }
                }
            }
        }
    };

    Runnable r2 = () -> {
        while (count < MAX_COUNT) {
            if (flag == false) {
                count++;
                System.out.println(Thread.currentThread().getName()+ " Bye ---- "+count+" "+flag);
                flag = true;
                synchronized (lock) {
                    lock.notify();
                }
            } else {
                synchronized (lock) {
                    try {
                        System.out.println(Thread.currentThread().getName()+" waiting");
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        e.printStackTrace();
                    }
                }
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        new HiByeDemo().threadCreation();
    }

    private void threadCreation() throws InterruptedException {
        Thread t2 = new Thread(r2, "two");
        Thread t1 = new Thread(r1, "one");
        t1.start();
        t2.start();
    }
}


