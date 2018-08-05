package edu.ren.multiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class CyclicBarrierT {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        Solver solver = new Solver(matrix);
        new Thread(solver).start();
    }
}

class Solver implements Runnable {
    final int N;
    final int[][] data;
    final CyclicBarrier barrier;
    boolean done = false;
    AtomicInteger atomicCount=new AtomicInteger(0);

    @Override
    public void run() {
        System.out.println("run method of solver --");
    }

    class Worker implements Runnable {
        int myRow;

        Worker(int row) {
            myRow = row;
        }

        public void run() {
            System.out.println("starting thread for row "+myRow);
            while (atomicCount.get()<6) {
                processRow(myRow);
                atomicCount.getAndIncrement();
                try {
                    System.out.println("waiting at barrier -thread for row "+myRow);
                    barrier.await();
                } catch (InterruptedException ex) {
                    return;
                } catch (BrokenBarrierException ex) {
                    return;
                }
                System.out.println(myRow+ " thread count = "+ atomicCount);

            }
            System.out.println("Thread "+myRow+" done count = "+ atomicCount);
        }
    }

    public Solver(int[][] matrix) {
        data = matrix;
        N = matrix.length;
        Runnable barrierAction = () -> mergeRows(N);
        barrier = new CyclicBarrier(N, barrierAction);

        List<Thread> threads = new ArrayList<Thread>(N);
        for (int i = 0; i < N; i++) {
            Thread thread = new Thread(new Worker(i));
            threads.add(thread);
            thread.start();
        }
        System.out.println("thread list size = "+ threads.size());
        // wait until done
        for (Thread thread : threads)
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    private void mergeRows(int N) {
        System.out.println("merge row - "+ N);
    }

    private void processRow(int myRow) {
        System.out.println("Row : "+ myRow);
    }
}