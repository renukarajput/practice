package edu.leetcode.search;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/
public class RangeSearch {

    public int[] searchRange(int[] nums, int target) {
        return searchRange(nums, target, 0, nums.length - 1);
    }

    int[] searchRange(int[] nums, int target, int low, int high) {
        int[] result = {-1, -1};
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                int lower = searchRange(nums, target, low, mid - 1, true);
                int higher = searchRange(nums, target, mid + 1, high, false);
                result[0] = lower == -1? mid : lower;
                result[1] = higher == -1? mid : higher;
                break;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    int searchRange(int[] nums, int target, int low, int high, boolean lower) {

        if (high < low)
            return -1;
        if (low <= high && nums[low] != target && nums[high] != target)
            return -1;

        int mid = low + (high - low) / 2;
        if (nums[mid] == target) {
            int result;
            if (lower)
                result = searchRange(nums, target, low, mid - 1, lower);
            else
                result = searchRange(nums, target, mid + 1, high, false);

            if (result == -1)
                return mid;
            return result;
        } else if (nums[mid] > target) {
            return searchRange(nums, target, low, mid - 1, lower);
        }
        return searchRange(nums, target, mid + 1, high, lower);

    }
}