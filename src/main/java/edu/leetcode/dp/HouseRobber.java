package edu.leetcode.dp;

//https://leetcode.com/problems/house-robber/
public class HouseRobber {

    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] robbedSum = new int[nums.length];
        robbedSum[0] = nums[0];
        robbedSum[1] = Math.max(nums[0], nums[1]);
        int max = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            robbedSum[i] = Math.max(robbedSum[i - 1], robbedSum[i - 2] + nums[i]);
            max = Math.max(max, robbedSum[i]);
        }
        return max;

    }

    public int robHouse(int[] nums) {
        return rob(nums, nums.length-1);
    }

    public int rob(int[] nums, int i) {
        if (i < 0) {
            return 0;
        }
        return Math.max(nums[i] + rob(nums, i-2), rob(nums, i-1));
    }
}