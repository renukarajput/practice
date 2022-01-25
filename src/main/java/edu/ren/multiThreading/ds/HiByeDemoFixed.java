package edu.ren.multiThreading.ds;

import edu.ren.multiThreading.HiByeDemo;

/**
 * Created by rrn3194 on 10/1/18.
 */
public class HiByeDemoFixed {

    int count = 0;
    volatile boolean flag = true;

    final Object lock = new Object();

    private int MAX_COUNT = Integer.MAX_VALUE;
    Runnable r1 = () -> {
        while (count < MAX_COUNT) {
            synchronized (lock) {
                if (flag == true) {
                    count++;
                    System.out.println(Thread.currentThread().getName() + " Hiii" + count + " " + flag);
                    flag = false;
                    lock.notify();
                } else {
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
        while (count < MAX_COUNT) {

            synchronized (lock) {
                if (flag == false) {
                    count++;
                    System.out.println(Thread.currentThread().getName() + " Bye" + count + " " + flag);
                    flag = true;
                    lock.notify();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        new HiByeDemoFixed().threadCreation();
    }

    private void threadCreation() throws InterruptedException {
        Thread t2 = new Thread(r2, "two");
        Thread t1 = new Thread(r1, "one");
        //Thread t3 = new Thread(r,"three");
        t1.start();
        t2.start();
        //t3.start();
    }
}

