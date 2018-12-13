package edu.ren.datastructure.interviewBit.array;


public class MaximumDifference {
/*
    public int[] getPairOfMaxDiff(int[] input) {
        int length = 2;
        int[] pair = new int[length];
        int maxDiff = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < i; j++) {
                int diff = input[i] - input[j];
                if (maxDiff < diff) {
                    maxDiff = diff;
                    pair[0] = input[i];
                    pair[1] = input[j];
                }
            }
        }
        return pair;
    }*/

    public int getPairOfMaxDiff(int[] input) {
        int diff = 0;
        int maxDiff = input[1] - input[0];
        int currMin = input[0];

        for (int i = 1; i < input.length; i++) {
            diff = input[i] - currMin;
            if (diff > maxDiff) {
                maxDiff = diff;
            }
            if (currMin > input[i]) {
                currMin = input[i];
            }
        }
        return maxDiff;
    }
}
