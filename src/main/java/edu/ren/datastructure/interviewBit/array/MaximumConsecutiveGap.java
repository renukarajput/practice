package edu.ren.datastructure.interviewBit.array;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumConsecutiveGap {

    int get(ArrayList<Integer> arr) {
        if (arr.size() == 1) {
            return 0;
        }
        int[] maxArr = new int[arr.size()];
        int[] minArr = new int[arr.size()];
        boolean[] isValueInBucket = new boolean[arr.size()];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : arr) {
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        int gap = (max - min) / (arr.size() - 1);
        for (int num : arr) {
            int bucket = 0;
            if (gap != 0) {
                bucket = ((num - min) / gap);
            }
            if (bucket >= arr.size()) {
                bucket = arr.size() - 1;
            }
            if (isValueInBucket[bucket]) {
                maxArr[bucket] = Math.max(maxArr[bucket], num);
                minArr[bucket] = Math.min(minArr[bucket], num);
            } else {
                maxArr[bucket] = num;
                minArr[bucket] = num;
                isValueInBucket[bucket] = true;

            }
        }
        int diff = maxArr[0] - minArr[0];
        int maxDiff = diff;
        for (int i = 1; i < arr.size(); i++) {
            if (!isValueInBucket[i]) {
                continue;
            }
            int j = i - 1;
            while (!isValueInBucket[j] && j >0) {
                j--;
            }

            int currentDiff = minArr[i] - maxArr[j];
            maxDiff = Math.max(currentDiff, maxDiff);
        }
        int lastDiff = maxArr[arr.size() - 1] - minArr[arr.size() - 1];
        return Math.max(maxDiff, lastDiff);
    }
}
