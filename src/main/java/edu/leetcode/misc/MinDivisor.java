package edu.leetcode.misc;

import java.util.Arrays;

public class MinDivisor {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high =Arrays.stream(nums).max().getAsInt();
        Arrays.stream(nums).sum();

        while (low <= high) {
            int mid = (low + high) / 2, sum = 0;
            for (int num : nums)
                sum += (num+mid-1)/ mid; //round to ceiling int of num/mid

            if (sum > threshold)
                low = mid + 1;
            else
                high = mid-1;
        }
        return low;
    }
}
