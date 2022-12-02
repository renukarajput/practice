package edu.ren.datastructure.queue;

import java.util.LinkedList;

//https://leetcode.com/problems/moving-average-from-data-stream/
public class MovingAverage {
    private int windowSize;
    double sum;
    private LinkedList<Integer> queue;

    public MovingAverage(int size) {
        queue = new LinkedList();
        windowSize = size;
    }

    public double next1(int val) {
        queue.add(val);
        if (queue.size() > windowSize) {
            queue.removeFirst();
        }
        sum = 0.0;
        for (int i = 0; i < queue.size(); i++) {
             sum += val;
        }
        return sum / queue.size();
    }

    public double next(int val) {
        if (queue.size() == windowSize) {
            sum -= queue.remove();
        }
        sum += val;
        queue.add(val);
        return sum / queue.size();
    }
}
