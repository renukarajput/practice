package edu.ren.datastructure.interviewBit.array;


public class MaximumProduct {
    // 1, 4, 3, 6, 7, 0
    public int[] getPairOfMaxProductFrom(int[] input) {
        int length = 2;
        int[] pair = new int[length];
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                int product = input[i] * input[j];
                if (product > maxProduct) {
                    maxProduct = product;
                    pair[0] = input[i];
                    pair[1] = input[j];
                }
            }
        }
        return pair;
    }
}
