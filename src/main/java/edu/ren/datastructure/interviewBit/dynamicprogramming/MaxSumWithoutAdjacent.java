package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.Arrays;
import java.util.List;

public class MaxSumWithoutAdjacent {
    int maxSum(Integer[] first, Integer[] second) {
        return maxSum(Arrays.asList(first), Arrays.asList(second));
    }

   private int maxSum(List<Integer> first, List<Integer> second) {
        final int length = first.size();
        int[] result = new int[length + 1];
        result[0] = 0;
        result[1] = Math.max(first.get(0), second.get(0));
        for (int i = 2; i <= length; i++) {
            final int sumByIncludingIth = Math.max(first.get(i-1), second.get(i-1)) + result[i - 2];
            final int sumByExcludingIth = result[i - 1];
            result[i] = Math.max(sumByIncludingIth, sumByExcludingIth);
        }
        return result[length];
    }
}
