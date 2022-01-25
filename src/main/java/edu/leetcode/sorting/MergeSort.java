package edu.leetcode.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeSort {
    public int[] sortArray(int[] nums) {
        int[] copyNums = Arrays.copyOf(nums, nums.length);
        sortArray(copyNums, 0, nums.length - 1);
        return copyNums;
    }

    void sortArray(int[] nums, int start, int end) {
        int mid = start + (end - start) / 2;
        sortArray(nums, start, mid);
        sortArray(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }
  //1 4 7 2 6 8
//  i     j
  //1 2 7 4 6 8
//    i   j
     void merge(int[] nums, int start, int mid, int end) {
        int i = start, j = mid + 1;
        while (i < mid && j < end) {
            if (nums[i] < nums[j]) {
                i++;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

            }
        }
    }
}
