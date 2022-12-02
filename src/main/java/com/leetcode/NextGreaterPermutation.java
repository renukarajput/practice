package com.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/next-permutation/
public class NextGreaterPermutation {

    // 1,5,8,4,7,6,5,3,1
    // 5, 4, 1, 2, 3
    public void nextPermutation(int[] nums) {
        int i = nums.length - 1;
        while(i > 0 && nums[i-1] > nums[i] ) {
            i--;
        }
        i--;
        if(i >= 0) {
            int j = nums.length-1;
            while(nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1);
    }

    public void nextPermutation1(int[] arr) { //1,5,8,4,7,6,5,3,1
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = arr.length - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            swap(arr, i, j);
        }
        reverse(arr, i + 1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void duplicateZeros(int[] arr) {
        int temp = -1;
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                temp = arr[j + 1];
                j = i + 1;
                arr[j++] = arr[j];

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}



