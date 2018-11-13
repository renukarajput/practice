package edu.ren.datastructure.interviewBit.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Combinations {
    ArrayList<ArrayList<Integer>> combination(int n, int k) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        combination(n, k, result, new ArrayList<>(), new HashSet<>());
        return result;
    }

    private void combination(int n, int k, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> current, Set<Integer> used) {
        if (0 == k) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!used.contains(i) && (current.isEmpty() || i > current.get(current.size() - 1))) {
                current.add(i);
                used.add(i);
                combination(n, k - 1, result, current, used);
                used.remove(current.get(current.size() - 1));
                current.remove(current.size() - 1);

            }
        }
    }

}
