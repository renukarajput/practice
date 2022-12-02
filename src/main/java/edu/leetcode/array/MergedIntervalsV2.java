package edu.leetcode.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
//https://leetcode.com/problems/merge-intervals/
public class MergedIntervalsV2 extends MergeIntervals {
    @Override
    public int[][] merge(int[][] intervals) {
//        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        LinkedList<int[]> result = new LinkedList<>();
        for (int[] interval : intervals) {
            // if the list of result intervals is empty or if the current interval does not overlap with the previous, add it.
            if (result.isEmpty() || result.getLast()[1] < interval[0]) {
                result.add(interval);
            } else { // otherwise, there is overlap, so we merge the current and previous intervals.
                result.getLast()[1] = Math.max(result.getLast()[1], interval[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}

