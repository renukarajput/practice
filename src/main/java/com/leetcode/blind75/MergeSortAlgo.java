package com.leetcode.blind75;

import java.util.Arrays;

public class MergeSortAlgo {
        public int[] sortArray(int[] nums) {

            if (nums.length <= 1) {
                return nums;
            }
            int mid = nums.length / 2;
            int[] left = sortArray(Arrays.copyOfRange(nums, 0, mid));
            int[] right = sortArray(Arrays.copyOfRange(nums, mid, nums.length));
            return merge(left, right);
        }

        int[] merge(int[] left, int[] right) {
            int n = left.length;
            int m = right.length;
            int[] res = new int[n + m];
            int i = 0;
            int j = 0;
            int k = 0;
            while (i < n && j < m) {
                if (left[i] < right[j]) {
                    res[k] = left[i];
                    i++;
                }else {
                    res[k] = right[j];
                    j++;
                }
                k++;
            }
            while (i < n) {
                res[k++] = left[i++];
            }
            while (j < m) {
                res[k ++] = right[j++];
            }
            return res;
        }
    }
