package edu.ren.datastructure.interviewBit.binarysearch;

import java.util.List;

public class AllocateBooksToMinimiseMax {

    int maxAllocation(List<Integer> arr, int k) {
        if(k>arr.size()){
            return -1;
        }
        int sum = arr.stream().mapToInt(x -> x.intValue()).sum();
        int sumPerPartition = sum / k;
        System.out.println("sum "+sum+" sumPer "+sumPerPartition);
        int max = Integer.MIN_VALUE;
        int current = 0;
        for (int i = 0; i < arr.size() ; i++) {
            Integer currentNum = arr.get(i);
            System.out.print(currentNum+"  ");
            int currentDiff = sumPerPartition - current;
            int diffByAllocation = sumPerPartition - (current + currentNum);
            if (Math.abs(diffByAllocation) <= Math.abs(currentDiff)) {
                current = current + currentNum;
            } else {
                System.out.println();
                current = currentNum;
            }
            max = Math.max(max, current);
        }
        return max;
    }
}
