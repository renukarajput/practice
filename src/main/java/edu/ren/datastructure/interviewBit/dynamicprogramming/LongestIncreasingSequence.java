package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class LongestIncreasingSequence {
    int getLengthOfLIS(int[] arr) {
        return getLengthOfLISRecurisvely(arr, arr.length - 1);
    }

    private int getLengthOfLISRecurisvely(int[] arr, int index) {
        if (index == 0) {
            return 1;
        }
        int  maxLen = 1;
        for (int i = index - 1; i >= 0; i--) {
            if(arr[index]>arr[i]) {
            int lengthOfLIS = getLengthOfLISRecurisvely(arr, i);
            maxLen = Math.max(1 + lengthOfLIS,maxLen);
            }
        }

        return maxLen;

    }
}
