package edu.ren.datastructure.interviewBit.array;

import java.util.List;

public class MaximumSumContiguousSubArray {


    int[] maximumContiguousSum(List<Integer> arr) {

        int sum = 0, maxSum = Integer.MIN_VALUE;
        int startOfSubArray = -1, startOfMaxSubArray = -1, endOfSubArray = -1, endOfMaxSubArray = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (sum > 0) { // sum till i-1 is positive ,continue with same interval
                sum += arr.get(i);
                endOfSubArray++;
            } else {
                sum = arr.get(i);   //else max sum interval is a new one starting here
                startOfSubArray = i;
                endOfSubArray = i;
            }

            if (compare(sum, startOfSubArray, endOfSubArray, maxSum, startOfMaxSubArray, endOfMaxSubArray)) {
                maxSum = sum;
                startOfMaxSubArray = startOfSubArray;
                endOfMaxSubArray = endOfSubArray;

            }
        }
        return new int[]{startOfMaxSubArray, endOfMaxSubArray, maxSum};
    }

    boolean compare(long sum, int startOfSubArray, int endOfSubArray, long maxSum, int startOfMaxSubArray, int endOfMaxSubArray) {
        int result = Long.compare(sum, maxSum);
        if (result == 0) {
            result = Integer.compare(endOfSubArray - startOfSubArray, endOfMaxSubArray - startOfMaxSubArray);
        }
        if (result == 0) {
            result = Integer.compare(startOfMaxSubArray, startOfSubArray);
        }
        return result > 0;
    }
}

