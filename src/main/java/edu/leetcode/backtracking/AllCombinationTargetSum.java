package edu.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class AllCombinationTargetSum {

    private List<List<Integer>> allCombinations;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        allCombinations = new ArrayList();
        combinationSumUtil(candidates, new ArrayList<>(), 0, target);
        return allCombinations;
    }

    private void combinationSumUtil(int[] candidates, List<Integer> current, int startIndex, int target) {
        if (target == 0) {
            allCombinations.add(new ArrayList(current));
            return;
        }
        if (startIndex >= candidates.length) {
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                current.add(candidates[i]);
                combinationSumUtil(candidates, current, i, target - candidates[i]);
                current.remove(current.size() - 1);
            }
        }
    }
}
