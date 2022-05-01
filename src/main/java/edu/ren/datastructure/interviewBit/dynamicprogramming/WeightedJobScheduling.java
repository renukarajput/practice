package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WeightedJobScheduling {

    int getMaxProfit(List<int[]> jobs) {
        Comparator<int[]> jobComparator = Comparator.comparingInt(x -> x[1]);
        Collections.sort(jobs, jobComparator);
        int max = 0;
        int[] profitCache = new int[jobs.size()];
        int nonConflictingIndex=0;
        for (int i = 0; i < jobs.size(); i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (isNonConflicting(jobs, i, j)) {
                    nonConflictingIndex = j;
                    break;
                }
            }
            int profit = profitCache[nonConflictingIndex] + jobs.get(i)[2];
            max = Math.max(max, profit);
            profitCache[i]=max;
        }
        return max;
    }

    private boolean isNonConflicting(List<int[]> jobs, int i, int j) {
        return jobs.get(i)[0] >= jobs.get(j)[1];
    }
}
