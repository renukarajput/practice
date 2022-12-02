package com.leetcode.blind75.array;

public class MaxSubarray {
    public int maximumContiguousSum(Integer[] arr) {
        int sum = Integer.MIN_VALUE, currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            sum = Math.max(sum, currentSum);
        }
        return sum;
    }

    public int maximumContiguousProduct(int[] arr) { // -2 -3
        int maxProduct = Integer.MIN_VALUE, currMaxProduct = 1, currMinProduct = 1;
        for (int i = 0; i < arr.length; i++) {

            maxProduct = Math.max(maxProduct, Math.max(arr[i] * currMinProduct, arr[i] * currMaxProduct));
//            if (arr[i] <= 0) {
//                currMaxProduct = Math.max(arr[i], arr[i] * currMinProduct);
//                currMinProduct = Math.min(arr[i], arr[i] * currMaxProduct);
//
//            } else {
//                currMaxProduct = Math.max(arr[i], arr[i] * currMaxProduct);
//                currMinProduct = Math.min(arr[i], arr[i] * currMinProduct);
//            }
        }
        System.out.println(maxProduct);
        return maxProduct;
    }
}
