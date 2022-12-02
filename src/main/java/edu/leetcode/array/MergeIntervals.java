package edu.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
//2-3 4-5 6-7 4-10
        Arrays.sort(intervals, Comparator.comparingInt((int[] x) -> x[1]).thenComparingInt(x -> x[0]));
        List<int[]> result = new ArrayList<>();
        int[] prevPair = intervals[0];
        result.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] currentPair = intervals[i];

            if (prevPair[1] >= currentPair[0]) {  //end >=next start
                int minStart = prevPair[0];
                int j = result.size() - 1;
                while (j >= 0 && !result.isEmpty() && result.get(j)[1] >= currentPair[0]) {
                    int[] removed = result.remove(result.size() - 1);
                    minStart = Math.min(minStart, removed[0]);
                    j--;
                }

                prevPair = new int[]{Math.min(minStart, currentPair[0]), currentPair[1]};
                result.add(prevPair);
            } else {
                result.add(currentPair);
                prevPair = currentPair;
            }

        }

        int[][] ret = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            ret[i] = result.get(i);
        }
        return ret;
    }

}
