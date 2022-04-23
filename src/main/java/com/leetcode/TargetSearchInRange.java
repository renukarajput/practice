package com.leetcode;

import java.util.Arrays;

public class TargetSearchInRange {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        searchRange(arr, 8);
        searchRange(arr, 6);
        searchRange(new int[]{}, 0);
        int[] arr1 = {5,6, 7, 7, 8, 8, 10,11,10,11};
        searchRange(arr1, 11);
        searchRange(new int[]{1}, 1);
    }

    public static int[] searchRange(int[] arr, int target) {
        int[] result = {-1, -1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) continue;
            if (result[0] == -1) result[0] = i;
            result[1] = i;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
