package edu.ren.multiThreading;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rrn3194 on 3/26/18.
 */
public class WaitNotifyDemo {
    int index = 0;
    int count = 0;
    volatile boolean flag = true;
    List<Integer> list = Arrays.asList(new Integer[] {1,2,3,4,5,6});
    final Object lock = new Object();

    Runnable r1 = () -> {

        while (index < list.size()) {
            if (flag == true) {
                list.set(index, list.get(index)+5);
                System.out.println(" Thread :" + Thread.currentThread().getName() + " " + count);
                count++;
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
                    }}}}};

    Runnable r2 = () -> {

        while (index < list.size()) {
            if (flag == false) {
                list.set(index, list.get(index) * 2);
                index++;
                System.out.println(" Thread :" + Thread.currentThread().getName() + " " + count);
                count++;
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
                    }}}}};

    public static void main(String[] args) throws InterruptedException {
        new WaitNotifyDemo().threadCreation();
    }

    private void threadCreation() throws InterruptedException {
        Thread t1 = new Thread(r1, "one");
        Thread t2 = new Thread(r2, "two");
        //Thread t3 = new Thread(r,"three");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("list == "+list);
        //t3.start();
    }
}
