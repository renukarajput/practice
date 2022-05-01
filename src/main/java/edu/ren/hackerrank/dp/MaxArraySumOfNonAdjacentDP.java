package edu.ren.hackerrank.dp;

public class MaxArraySumOfNonAdjacentDP extends MaxArraySumOfNonAdjacent {
    @Override
    int getMax(int[] arr) {
        int[] maxSum = new int[arr.length];
        if(arr.length==1){
            return arr[0];
        }
        maxSum[0] = arr[0];
        maxSum[1] = arr[1];
        for (int i = 2; i < arr.length; i++) {
            int sum = Math.max(maxSum[i - 2] + arr[i], maxSum[i - 1]);
            maxSum[i] = Math.max(sum, arr[i]);
        }
        return maxSum[maxSum.length - 1];
    }
}
