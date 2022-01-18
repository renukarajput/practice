package edu.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class AllKCombinationOfN {
    List<List<Integer>> allCombination;

    public List<List<Integer>> combine(int n, int k) {
        allCombination = new ArrayList<>();
        combineUtil(1, n, k, new ArrayList<>());
        return allCombination;
    }


    private void combineUtil(int start, int numberElements, int combinationSize, List<Integer> current) {
        if (current.size() == combinationSize) {
            allCombination.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i <= numberElements; i++) {
            if(!current.isEmpty() && i<=current.get(current.size()-1)){
                continue;
            }
            current.add(i);
            combineUtil(start + 1, numberElements, combinationSize, current);
            current.remove(current.size() - 1);
        }
    }
}
