package edu.ren.multiThreading;

import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

/**
 * Created by rrn3194 on 10/1/18.
 */
public class LockMutualExclusionDemo {

    int count = 0;
    volatile boolean flag = true;

    final ReentrantLock lock = new ReentrantLock();

    private int MAX_COUNT = Integer.MAX_VALUE;
    Runnable r1 = () -> {
        while (count < MAX_COUNT) {
            try {
                lock.lock();
                if (flag == true) {
                    count++;
                    sleep(500);
                    System.out.println(Thread.currentThread().getName() + " Hiii" + count + " " + flag);
                    flag = false;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    };

    Runnable r2 = () -> {
        while (count < MAX_COUNT) {
            try {
                lock.lock();
                if (flag == false) {
                    count++;
                    sleep(500);
                    System.out.println(Thread.currentThread().getName() + " Bye" + count + " " + flag);
                    flag = true;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        System.out.println("running - ");
                Thread.sleep(5000);
        new LockMutualExclusionDemo().threadCreation();
    }

    private void threadCreation() throws InterruptedException {
        Thread t2 = new Thread(r2, "two");
        Thread t1 = new Thread(r1, "one");
        t1.start();
        t2.start();
    }
}

