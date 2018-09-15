package edu.ren.datastructure.interviewBit.array;

public class MaximumSumContiguousSubArray {
    int[] maximumContiguousSum(int[] arr) {

        int sum = 0, maxSum = Integer.MIN_VALUE;
        int startOfSubArray = -1, startOfMaxSubArray = -1, endOfSubArray = -1, endOfMaxSubArray = -1;
        for (int i = 0; i < arr.length; i++) {
            if (sum > 0) { // sum till i-1 is positive ,continue with same interval
                sum += arr[i];
                endOfSubArray++;
            } else {
                sum = arr[i];   //else max sum interval is a new one starting here
                startOfSubArray = i;
                endOfSubArray = i;
            }
            if (sum > maxSum) {
                maxSum = sum;
                startOfMaxSubArray = startOfSubArray;
                endOfMaxSubArray = endOfSubArray;

            }
        }
        return new int[]{startOfMaxSubArray, endOfMaxSubArray, maxSum};
    }
}

