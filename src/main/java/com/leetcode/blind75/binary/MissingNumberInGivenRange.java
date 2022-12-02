package com.leetcode.blind75.binary;

import java.util.Arrays;

// https://leetcode.com/problems/missing-number/
public class MissingNumberInGivenRange {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = Arrays.stream(nums).reduce(0, (a, b) -> a + b);
        System.out.println("e -: " + expectedSum + " a-: " + actualSum);
        return expectedSum - actualSum;
    }

/*    public int missingNumber(int[] nums) {
        int expectedSum = 0;
        for (int i = 0; i <= nums.length; i++) {
            expectedSum += i;
        }
        int actualSum = Arrays.stream(nums).reduce(0, (a, b) -> a + b);
        System.out.println("e -: " + expectedSum + " a-: " + actualSum);
        return expectedSum - actualSum;
    }*/
}
