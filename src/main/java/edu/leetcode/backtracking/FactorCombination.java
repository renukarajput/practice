package edu.leetcode.backtracking;

import java.util.*;

public class FactorCombination {

    public List<List<Integer>> getFactors(int n) {
        List<List<Integer>> factors = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        getFactors(n, 2,temp, factors);
        return factors;
    }

    void getFactors(int n, int start,List<Integer> currentFactors, List<List<Integer>> factors) {
        if (n == 1) {
            return ;
        }
        if(!currentFactors.isEmpty()) {
            currentFactors.add(n);
            factors.add(new ArrayList<>(currentFactors));
            currentFactors.remove(currentFactors.size() - 1);
        }
        for (int i = start; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                currentFactors.add(i);
                getFactors(n / i, i,currentFactors, factors);
                currentFactors.remove(currentFactors.size() - 1);
            }
        }
    }
}
