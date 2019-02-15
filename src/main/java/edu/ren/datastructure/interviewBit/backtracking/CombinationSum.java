package edu.ren.datastructure.interviewBit.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    List<List<Integer>> get(Integer[] candidates, int targetSum) {
        return get(Arrays.asList(candidates), targetSum);
    }

    private List<List<Integer>> get(List<Integer> candidates, int targetSum) {
        List<List<Integer>> allCombinationsToSum = new ArrayList<>();
        get(candidates, targetSum, 0, new ArrayList<>(), allCombinationsToSum);
        return allCombinationsToSum;
    }

    private void get(List<Integer> candidates, int targetSum, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == candidates.size()) {
            return;
        }
        if (targetSum < 0) {
            return;
        }
        if (targetSum == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(candidates.get(index));
        get(candidates, targetSum - candidates.get(index), index, current, result);
        current.remove(current.size() - 1);

        get(candidates, targetSum, index + 1, current, result);

    }
}
