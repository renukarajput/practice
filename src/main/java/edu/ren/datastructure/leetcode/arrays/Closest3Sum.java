package edu.ren.datastructure.leetcode.arrays;

import java.util.Arrays;

public class Closest3Sum {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i + 1; j < nums.length-1; j++) {
                int numToSearch=target-(nums[i]+nums[j]);
                int res = binarySearchClosest(nums, numToSearch, j + 1, nums.length - 1);
                if (Math.abs(nums[i] + nums[j] + nums[res] - target) < Math.abs(sum - target)) {
                    sum = nums[i] + nums[j] + nums[res];
                }
            }
        }
        return sum;
    }

    int binarySearchClosest(int[] nums, int target, int start, int end) {
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            int next;
            if (nums[mid] > target) {
                end = mid - 1;
                next = end;
            } else {
                start = mid + 1;
                next = start;
            }
            if (start <= end && Math.abs(nums[mid] - target) < Math.abs(nums[next]-target)) {
                return mid;

            }

        }
        return mid;
    }
}
