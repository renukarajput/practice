package edu.leetcode.dp;

import java.util.HashSet;
import java.util.Set;

public class MaxMultiplicationScore {
    Set<Integer> visited = new HashSet<>();

    public int maximumScore(int[] nums, int[] multipliers) {
        int r = 0;
        int start = 0, end = nums.length - 1;
        for (int i = 0; i < multipliers.length; i++) {
            int a = maximumScore(nums, multipliers, nums[start]);
            int b = maximumScore(nums, multipliers, nums[end]);
            if (b > a) {
                end--;
                r += b;
            } else {
                r += a;
            }
        }
        return r;
    }

    public int maximumScore(int[] nums, int[] multipliers, int t) {
        int r = 0;
        for (int i = 0; i < multipliers.length; i++) {
            if (!visited.contains(i)) {
                visited.add(i);
                int p = multipliers[i] * nums[t];
                r = Math.max(r, p + maximumScore(nums, multipliers));
                visited.remove(i);

            }
        }
        return r;
    }

}
