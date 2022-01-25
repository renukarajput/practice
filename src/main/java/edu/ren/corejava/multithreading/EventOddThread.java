package edu.ren.corejava.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Thread.sleep;

public class EventOddThread {

    AtomicInteger num = new AtomicInteger(1);
    volatile boolean flag = false;

    public static void main(String[] args) {
        new EventOddThread().generate();
    }

    void generate() {
        Runnable oddR = () -> {
            while (num.get() < 300) {
                if (!flag) {
                        printElement(num);
                        flag = true;
                }
            }
        };

        Runnable evenR = () -> {
            while (num.get() < 300) {
                if (flag) {
                        printElement(num);
                        flag = false;
                }
            }
        };

        new Thread(evenR, "even-thread").start();
        new Thread(oddR, "odd-thread").start();
    }

    private void printElement(AtomicInteger e) {
        System.out.println(Thread.currentThread().getName() + " " + e.getAndIncrement());
        try {
            sleep(500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
