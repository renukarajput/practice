package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.Arrays;
import java.util.List;

public class MinJumpGameArray {

    int minJumps(Integer[] arr) {
        return minJumps(Arrays.asList(arr));
    }
    int minJumps(List<Integer> arr) {
        int[] minJumps = new int[arr.size()];
        minJumps[arr.size() - 1] = 0;

        for (int index = arr.size() - 2; index >= 0; index--) {
            int numAtIndex = arr.get(index);
            int maxJumps = Math.min(index + numAtIndex, arr.size() - 1);
            int minNumberOfJumps = -1;
            for (int jumpIndex = index + 1; jumpIndex <= maxJumps; jumpIndex++) {
                if (minJumps[jumpIndex] != -1) {
                    int min = 1 + minJumps[jumpIndex];
                    if (minNumberOfJumps == -1) {
                        minNumberOfJumps = min;
                    } else {
                        minNumberOfJumps = Math.min(min, minNumberOfJumps);
                    }
                }
            }
            minJumps[index]=minNumberOfJumps;
        }
        return minJumps[0];
    }
}
