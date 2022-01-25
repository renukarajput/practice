package edu.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class AllKCombinationOfNtargetSum {
    private List<List<Integer>> allCombinations;

    public List<List<Integer>> combinationSum3(int k, int n) {
        allCombinations = new ArrayList<>();
        combinationSum3Util(k, n, 1, new ArrayList<>());
        return allCombinations;
    }

    private void combinationSum3Util(int remainingElements, int targetSum, int startDigit, List<Integer> current) {
        //System.out.println(current);
        if (targetSum == 0 && remainingElements == 0) {
            allCombinations.add(new ArrayList<>(current));
            return;
        }
        if(remainingElements==0)
            return;
        /*if (targetSum < 0 || remainingElements <= 0) {
            return;
        }*/
        for (int digit = startDigit; digit < 10; digit++) {
            if (digit <= targetSum) {
                current.add(digit);
                combinationSum3Util(remainingElements - 1, targetSum - digit, digit + 1, current);
                current.remove(current.size() - 1);
            }
        }
    }
}
