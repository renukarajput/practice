package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.Arrays;
import java.util.List;

public class MinJumGameArrayOptimised extends MinJumpGameArray {
    @Override
    int minJumps(Integer[] arr) {
        return minJumps(Arrays.asList(arr));
    }

    int minJumps(List<Integer> arr) {
        int[] minJumps = new int[arr.size()];
        for (int index = 0; index <= arr.size() - 1; ) {
            int numAtIndex = arr.get(index);
            int prevIndex = index;
            int maxJumps = Math.min(index + numAtIndex, arr.size() - 1);
            for (int jumpIndex = maxJumps; jumpIndex >= index + 1; jumpIndex--) {
                int min = 1 + minJumps[jumpIndex];
                minJumps[jumpIndex + index] = min;
                index = index + jumpIndex;


            }
            if (prevIndex == index) {
                return -1;
            }
        }
        return minJumps[arr.size() - 1];
    }
}
