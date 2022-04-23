package com.leetcode;


public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
        System.out.println(maxSubArray(new int[]{1}));
        System.out.println(maxSubArray(new int[]{5,4,-1,7,8}));
        System.out.println(maxSubArray(new int[]{1,-1,1,-1,1,4}));
        System.out.println(maxSubArray(new int[]{}));
        System.out.println(maxSubArray(new int[]{-1,-2,-3}));
    }

    public static int maxSubArray(int[] arr) {
        int sum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = currentSum + arr[i];
            sum = Math.max(sum, currentSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return sum;
    }
}
