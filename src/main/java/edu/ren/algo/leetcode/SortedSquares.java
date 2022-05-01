package edu.ren.algo.leetcode;

public class SortedSquares {
    // -4,-1,0,3,10
    public int[] getSquaresInSortedOrder(int[] input) {
        int[] result = new int[input.length];
        int m = 0, n = input.length - 1;
        for (int i = input.length - 1; i >= 0; i--) {
            int first = input[m] * input[m];
            int second = input[n] * input[n];
            if (first > second) {
                result[i] = first;
                m++;
            } else {
                result[i] = second;
                n--;
            }
        }
        return result;
    }
}
