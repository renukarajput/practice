package edu.leetcode.misc;

import java.util.Arrays;

public class MinimisedMaximumDistrib extends MinimisedMaximum{
     public int minimizedMaximum(int n, int[] quantities) {
        int sum = Arrays.stream(quantities).sum();
        final int limit = (sum + n - 1) / n;
        int slots = n - quantities.length;
        Arrays.sort(quantities);
        int i = quantities.length - 1;
        while (slots > 0 && i >= 0) {
            if (quantities[i] > limit) {
                int QuantitySlots = (quantities[i]+limit-1) / limit;
                int extras=QuantitySlots-1;
                if (extras <= 0) {
                    i--;
                    continue;
                }
                slots -= extras;
                quantities[i] = quantities[i] - limit * extras;
            } else {
                i--;
            }
        }
        return Math.max(Arrays.stream(quantities).max().getAsInt(), limit);
    }
}
