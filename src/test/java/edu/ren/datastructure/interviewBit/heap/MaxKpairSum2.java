package edu.ren.datastructure.interviewBit.heap;

import java.util.*;

public class MaxKpairSum2 extends MaxKpairSum {
    @Override
    List<Integer> maxSum(ArrayList<Integer> a, ArrayList<Integer> b) {
        Collections.sort(a, Comparator.reverseOrder());
        Collections.sort(b, Comparator.reverseOrder());
        int k = a.size();
        final PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int aIndex = 0, bIndex = 0;
        while (aIndex < k-1 && bIndex < k-1) {
            int currentSum = a.get(aIndex) + b.get(bIndex);
            int currentSum1 = a.get(aIndex) + b.get(bIndex+1);
            int currentSum2 = a.get(aIndex+1) + b.get(bIndex);
            addToQueue(priorityQueue,k,currentSum);
            addToQueue(priorityQueue,k,currentSum1);
            addToQueue(priorityQueue,k,currentSum2);
            aIndex++;
            bIndex++;

        }
        int currentSum = a.get(aIndex) + b.get(bIndex);
        addToQueue(priorityQueue,k,currentSum);

        return getSortedArrayList(priorityQueue);

    }
}
