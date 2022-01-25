package edu.leetcode.misc;

import java.util.Arrays;

//https://leetcode.com/problems/minimized-maximum-of-products-distributed-to-any-store/
public class MinimisedMaximum {
    public int minimizedMaximum(int n, int[] quantities) {
        int low = 1, high = Arrays.stream(quantities).max().getAsInt();
        while (low <= high) {
            int kToEach = low + (high - low) / 2;
            int distributedStores = 0;
            for (int quantity : quantities) {
                distributedStores += (quantity + kToEach - 1) / kToEach;
            }
            if (n < distributedStores) {
                low = kToEach + 1;
            } else {
                high = kToEach - 1;
            }
        }
        return low;
    }

}
