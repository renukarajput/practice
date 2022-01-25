package edu.leetcode.dp;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/factor-combinations/

public class AllFactors {
    List<List<Integer>> allFactors = new ArrayList<>();

    public List<List<Integer>> getFactors(int n) {
        getFactors(n, new ArrayList<>(), 2);
        return allFactors;
    }

    public void getFactors(int n, List<Integer> current, int start) {
        if (n <= 1) {
            if (current.size() > 1) {
                allFactors.add(new ArrayList<>(current));
            }
            return;
        }

        for (int divisor = start; divisor <= n; divisor++) {
            if (n % divisor == 0){
                current.add(divisor);
                getFactors(n / divisor, current, divisor);
                current.remove(current.size() - 1);
            }
        }
    }
}
