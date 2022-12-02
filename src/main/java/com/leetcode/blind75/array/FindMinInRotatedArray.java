package com.leetcode.blind75.array;

import java.util.Arrays;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class FindMinInRotatedArray {

    public int findMin(int[] nums) {
        System.out.println(Arrays.stream(nums).min().getAsInt());
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if (nums[mid] >= nums[start] && nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return nums[start];
    }
}
