package edu.leetcode.backtracking;

import java.util.*;

public class  AllOnceCombinationTargetSum {
    private Set<List<Integer>> allCombinations;

    public List<List<Integer>> combinationSum2_(int[] candidates, int target) {
        allCombinations = new HashSet<>();
        Arrays.sort(candidates);
        combinationSumUtil(candidates, new ArrayList<>(), 0, target);
        return new ArrayList<>(allCombinations);
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
            if (candidates[i] <= target && (current.isEmpty() || candidates[i] >= current.get(current.size() - 1))) {
                current.add(candidates[i]);
                combinationSumUtil(candidates, current, i + 1, target - candidates[i]);
                current.remove(current.size() - 1);
            }
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        LinkedList<Integer> path = new LinkedList<Integer>();

        Arrays.sort(candidates);
        recursion(candidates, 0, target, result, path);

        return result;
    }

    private void recursion(int[] candidate, int index, int remain, List<List<Integer>> result, LinkedList<Integer> path) {
        if(remain == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        int lastPop = -1;
        for(int i = index ; i < candidate.length && remain >= candidate[i] ; i ++) {
           /* if(path.isEmpty() && i - 1 >= 0 && candidate[i] == candidate[i-1]) {
                continue;
            }*/

            if(lastPop == candidate[i]) {
                continue;
            }

            path.add(candidate[i]);
            recursion(candidate, i+1, remain - candidate[i], result, path);
            lastPop = path.removeLast();
        }
    }
}
