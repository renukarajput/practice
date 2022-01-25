package edu.ren.multiThreading;

/**
 * Created by rrn3194 on 9/28/18.
 */
public class VolatileMutualExclusionDemo {
    int count = 0;
    volatile boolean flag = true;

    private int MAX_COUNT=Integer.MAX_VALUE;
    Runnable r1 = () -> {
        while (count < MAX_COUNT) {
            if (flag == true) {
                count++;
                String threadName = Thread.currentThread().getName();
                System.out.println(threadName + " Hiii "+count);
                flag = false;
            }
        }

    };

    Runnable r2 = () -> {
        while (count < MAX_COUNT) {
            if (flag == false) {
                count++;
                System.out.println(Thread.currentThread().getName()+ "Bye "+count);
                flag = true;
            }
        }

    };

    public static void main(String[] args) {
        new VolatileMutualExclusionDemo().threadCreation();
    }

    private void threadCreation() {
        Thread t1 = new Thread(r1, "one");
        Thread t2 = new Thread(r2, "two");
        t2.start();
        t1.start();
    }
}
