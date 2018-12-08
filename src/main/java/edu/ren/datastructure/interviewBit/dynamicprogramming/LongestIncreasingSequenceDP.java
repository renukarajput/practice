package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestIncreasingSequenceDP extends LongestIncreasingSequence {

    @Override
    int getLengthOfLIS(int[] arr) {
        int[] lis = getLISMatrix(arr);
        int max=1;
        for (int i = 0; i < lis.length; i++) {
            max=Math.max(max,lis[i]);
        }
        return max;
    }
    public int lis(final List<Integer> arr) {
        int[] lis = new int[arr.size()];
        lis[0] = 1;
        for (int i = 1; i < arr.size(); i++) {
            int maxLen = 1;
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxLen = Math.max(maxLen,1 + lis[j]);
                }
            }
            lis[i]=maxLen;
        }
        return lis[lis.length - 1];
    }

    List<Integer> lis(int[] arr) {
        List<Integer> lis = new ArrayList<>();
        int[] lisMatrix = getLISMatrix(arr);

        for (int i = lisMatrix.length - 1; i > 0; i--) {
            if (lisMatrix[i] > lisMatrix[i - 1]) {
                lis.add(arr[i]);
            }
        }
        if (arr[0] < lis.get(0)) {
            lis.add(arr[0]);
        }
        Collections.reverse(lis);
        return lis;
    }

    private int[] getLISMatrix(int[] arr) {
        int[] lis = new int[arr.length];
        lis[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            int maxLen = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    maxLen = Math.max(maxLen,1 + lis[j]);
                }
            }
            lis[i]=maxLen;
        }
        return lis;
    }

}
