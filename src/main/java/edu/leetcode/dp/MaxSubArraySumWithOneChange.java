package edu.leetcode.dp;

import java.util.Arrays;

public class MaxSubArraySumWithOneChange {

    public int maxSumAfterOperation(int[] nums) {
        //max subarray sum ending at i-1 +nums[i]^2+ max subarray sum starting at i+1
        int[] maxSumsFromIndex = new int[nums.length];
        int[] maxSumstillIndex = new int[nums.length];
        Arrays.fill(maxSumstillIndex, Integer.MIN_VALUE);
        for (int i = 0; i < nums.length; i++) {
            int sum = 0, maxSum = nums[i];
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
                maxSumstillIndex[j] = Math.max(sum, maxSumstillIndex[j]);
            }
            maxSumsFromIndex[i] = maxSum;
        }
        int maxSubArraySum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int prevSum = i > 0 ? (maxSumstillIndex[i - 1] > 0 ? maxSumstillIndex[i - 1] : 0):0;
            int aheadSum = i < nums.length - 1 ? (maxSumsFromIndex[i + 1] > 0 ? maxSumsFromIndex[i + 1] : 0):0;

            int sum = nums[i] * nums[i] + prevSum + aheadSum;
            maxSubArraySum = Math.max(sum, maxSubArraySum);
        }
        return maxSubArraySum;
    }
}
