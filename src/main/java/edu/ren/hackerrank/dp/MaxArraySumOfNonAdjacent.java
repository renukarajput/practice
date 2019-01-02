package edu.ren.hackerrank.dp;

public class MaxArraySumOfNonAdjacent {
    int getMax(int[] arr) {
        return getMax(arr, arr.length - 1);
    }

    private int getMax(int[] arr, int start) {
        if(start==0){
            return arr[0];
        }
        if(start==1){
            return Math.max(arr[0],arr[1]);
        }
        int maxWithGapTwo = getMax(arr, start - 2);
        int maxWithGapOne = getMax(arr, start - 1);
        int maxSumTillHere = maxWithGapTwo + arr[start];
        maxSumTillHere = Math.max(maxSumTillHere, arr[start]);
        return Math.max(maxSumTillHere, maxWithGapOne);
    }
}
