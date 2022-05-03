package com.leetcode.blind75.array;

import java.util.Arrays;
// https://leetcode.com/problems/range-sum-query-immutable/
public class NumsArray {
    int[] prefixSum;

    public NumsArray(int[] nums) {
        prefixSum = nums;
    }

    public int sumRange(int left, int right) { // this approach gives time limit exceeded
        int n = prefixSum.length;
        int[] res = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) { // 1 2 3 4
            res[i] = sum + prefixSum[i]; // 1 3 6 10
            sum += prefixSum[i];
        }
        System.out.println(Arrays.toString(res));
        int l = left == 0 ? 0 : res[left - 1];
        int r = res[right];
        return r - l;
    }
}

// https://leetcode.com/problems/range-sum-query-immutable/
class RangeSum {
    private int[] table;

    public RangeSum(int[] nums) {
        int sum = 0;
        table = new int[nums.length + 1]; // initialise result arr with len+1 to avoid IndexOutOfBound
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            table[i + 1] = sum;
        }
    }

    public int getSumForGivenIndex(int left, int right) {
        return table[right + 1] - table[left];
    }
}
