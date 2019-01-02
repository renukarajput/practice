package edu.ren.datastructure.interviewBit.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class MaxKpairSum {
    List<Integer> maxSum(ArrayList<Integer> a, ArrayList<Integer> b) {
        final PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int k = a.size();
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                sum = a.get(i) + b.get(j);
                addToQueue(priorityQueue, k, sum);
            }
        }
        return getSortedArrayList(priorityQueue);
    }

    protected List<Integer> getSortedArrayList(PriorityQueue<Integer> priorityQueue) {
        ArrayList<Integer> collected = priorityQueue.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(ArrayList::new));
        return collected;
    }

    protected void addToQueue(PriorityQueue<Integer> priorityQueue, int k, int sum) {
        Integer currentMin = Integer.MIN_VALUE;
        if (!priorityQueue.isEmpty()) {
            currentMin = priorityQueue.peek();
        }
        if (currentMin > sum && priorityQueue.size()==k) {
            //ignore
        } else {
            if (priorityQueue.size() == k) {
                priorityQueue.remove();
            }
            priorityQueue.add(sum);
        }
    }
}
