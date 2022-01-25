package edu.leetcode.dp;

public class MaxSubArraySumWithOneChange_a1 {
    public int maxSumAfterOperation(int[] nums) {
        if (nums.length == 0) return 0;

        int maxSubArray = nums[0] * nums[0];
        int sumWithOutSquare = 0;
        int prevSumWithSquare = 0;

        for (int i = 0; i < nums.length; i++) {

            // process first, before we change sumWithOutSquare
            // like plain sum subarray + nums[i]**2
            int newSumWithSquare = sumWithOutSquare;
            if (newSumWithSquare > 0) {
                newSumWithSquare += nums[i] * nums[i];
            } else {
                newSumWithSquare = nums[i] * nums[i];
            }

            // sumWithOutSquare - old plain maxSubArray
            // calculate every time
            // for calculate newSumWithSquare on the next step
            if (sumWithOutSquare > 0) {
                sumWithOutSquare += nums[i];
            } else {
                sumWithOutSquare = nums[i];
            }

            // square was somewhere in past, just add nums[i]
            if (prevSumWithSquare > 0) {
                prevSumWithSquare += nums[i];
            } else {
                prevSumWithSquare = nums[i];
            }

            if (newSumWithSquare > prevSumWithSquare) {
                // if sum with square this nums[i] is better than
                // result from previos
                prevSumWithSquare = newSumWithSquare;
            }

            if (maxSubArray < prevSumWithSquare) {
                maxSubArray = prevSumWithSquare;
            }
        }

        return maxSubArray;
    }

    public int maxSumAfterOperation_2(int[] A) {
        int max1 = A[0];      // max sum ending at i without using operation
        int max2 = A[0]*A[0]; // max sum ending at i using 1 operation
        int res = Math.max(max1, max2);

        for (int i = 1; i < A.length; i++) {

            max2 = Math.max(max2+A[i], Math.max(max1 + A[i]*A[i], A[i]*A[i]));
            max1 = Math.max(max1+A[i], A[i]);
            res = Math.max(res, Math.max(max1, max2));
        }

        return res;
    }


}

