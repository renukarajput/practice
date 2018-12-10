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

    public int[] getPairOfMaxProductFromOptimzed(int[] input) {
        int length = 2;
        int[] pair = new int[length];
        int max, smax, min, smin;
        if (input[0] > input[1]) {
            max = input[0];
            smax = input[1];
        } else {
            max = input[1];
            smax = input[0];
        }
        min = smax;
        smin = max;
        for (int i = 2; i < input.length; i++) {
            if (max < input[i]) {
                smax = max;
                max = input[i];
            } else {
                if (smax < input[i]) {
                    smax = input[i];
                }
            }

            if (min > input[i]) {
                smin = min;
                min = input[i];
            } else {
                if (smin > input[i]) {
                    smin = input[i];
                }
            }
        }
        int maxProduct = max * smax;
        int minProduct = min * smin;
        if (maxProduct > minProduct){
            pair[0] = smax;
            pair[1] = max;
        } else {
            pair[0] = smin;
            pair[1] = min;
        }
        return pair;
    }
}
