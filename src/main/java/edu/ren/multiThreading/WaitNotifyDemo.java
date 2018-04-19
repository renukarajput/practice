package edu.ren.multiThreading;

/**
 * Created by rrn3194 on 3/26/18.
 */
public class WaitNotifyDemo {
    int count = 0;
    volatile boolean flag = false;

    final Object lock = new Object();

    Runnable r1 = () -> {

        while (count < 10) {
            if (flag == true) {
                count++;
                System.out.println(" Thread :" + Thread.currentThread().getName() + " " + count);
                flag = false;
                synchronized (lock) {
                    lock.notify();
                }
            } else {
                synchronized (lock) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    };

    Runnable r2 = () -> {

        while (count < 10) {
            if (flag == false) {
                count++;
                System.out.println(" Thread :" + Thread.currentThread().getName() + " " + count);
                flag = true;
                synchronized (lock) {
                    lock.notify();
                }
            } else {
                synchronized (lock) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    };

    public static void main(String[] args) {
        new WaitNotifyDemo().threadCreation();
    }

    private void threadCreation() {
        Thread t1 = new Thread(r1, "one");
        Thread t2 = new Thread(r2, "two");
        //Thread t3 = new Thread(r,"three");
        t1.start();
        t2.start();
        //t3.start();
    }
}
