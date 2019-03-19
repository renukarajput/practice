package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.HashSet;
import java.util.Set;

public class CountNumberOfBinaryTree {
    Set<Integer> visited = new HashSet<>();

    int get(int n) {
        if (n <= 0) {
            return 1;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (visited.contains(i)) {
                continue;
            }
            visited.add(i);
            int left = get(n);
            int right = get(n);
            sum += 2 * left * right;
            visited.remove(i);
        }

        return sum == 0 ? 1 : sum;
    }
}
