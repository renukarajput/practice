package edu.ren.datastructure.codility.dynamicprogramming;

public class NumberSolitaire {

    int maxSum(int[] arr) {
        final int diceSize = 6;
       long[] maxSumCache = new long[arr.length];
        maxSumCache[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            long maxSum = arr[i];
            for (int j = i - 1; j >= i - diceSize && j >= 0; j--) {
                if (maxSumCache[j]+arr[i] > maxSum) {
                    maxSum =maxSumCache[j]+arr[i];
                }
            }
            maxSumCache[i]=maxSum;
        }
        return (int)maxSumCache[arr.length-1];
    }
}
