package edu.ren.multiThreading.queue;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by rrn3194 on 6/2/18.
 */
public class BlockingQueueDemo {

    BlockingQueue<Integer> blockingQueue;

    @Before
    public void setup() {
        blockingQueue = new ArrayBlockingQueue<Integer>(5);
    }

    @Test
    public void add() {
        System.out.println("capacity before : "+ blockingQueue.remainingCapacity());
        for (int i = 0; i < 5; i++) {
            blockingQueue.add(i);
        }
        System.out.println("capacity after : "+ blockingQueue.remainingCapacity());
        try {
            blockingQueue.add(5);
            fail("exception expected");
        } catch (IllegalStateException e) {

        }
    }

    @Test
    public void offerWithTimeOut() {
        boolean offerResult = true;
        for (int i = 0; i < 5; i++) {
            blockingQueue.add(i);
        }
        try {
            offerResult = blockingQueue.offer(6, 10, TimeUnit.SECONDS);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertThat(blockingQueue.size(), is(5));
        assertThat(offerResult, is(false));
    }

    @Test
    public void offer() {
        for (int i = 0; i < 5; i++) {
            assertTrue(blockingQueue.offer(i));
        }
        assertFalse(blockingQueue.offer(6));
    }

    @Test
    public void put() {
        long start = 0;
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("******************" + i);
                blockingQueue.put(i);
            }
            Thread t = new Thread(() -> {
                try {
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                blockingQueue.remove();
            });
            start = System.currentTimeMillis();
            t.start();
            blockingQueue.put(6);
        } catch (InterruptedException e) {
            System.out.println("---");
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        assertThat(blockingQueue.size(), is(5));
        long elapsed = end - start;
        assertTrue(elapsed >= 15000);
    }

}
