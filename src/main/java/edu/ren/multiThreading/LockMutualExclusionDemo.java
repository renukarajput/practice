package edu.ren.multiThreading;

import java.util.concurrent.locks.ReentrantLock;

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
                    System.out.println(Thread.currentThread().getName() + " Hiii" + count + " " + flag);
                    flag = false;
                }
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
                    System.out.println(Thread.currentThread().getName() + " Bye" + count + " " + flag);
                    flag = true;
                }
            } finally {
                lock.unlock();
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        new LockMutualExclusionDemo().threadCreation();
    }

    private void threadCreation() throws InterruptedException {
        Thread t2 = new Thread(r2, "two");
        Thread t1 = new Thread(r1, "one");
        t1.start();
        t2.start();
    }
}

