package com.leetcode.blind75.array;

/*
https://leetcode.com/problems/search-in-rotated-sorted-array/
 4,5,6,7,0,1,2 -> target=0, o/p = 4
 4,5,6,7,0,1,2 -> target=3, o/p = -1
 10 14 16 17 18 5 7 -> target=14, o/p = 1
*/
public class SearchInRotatedArray {

    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // check in 1st half of array - start to mid
            if (nums[start] <= nums[mid]) { // 4 5 6 1 2 -- 5, 1, 3
                if (target >= nums[start] && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // check in 2nd half of array - mid to end
                if (target >= nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
