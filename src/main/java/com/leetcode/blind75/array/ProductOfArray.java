package com.leetcode.blind75.array;

import java.util.Arrays;

/* https://leetcode.com/problems/product-of-array-except-self/
Input nums = [1,2,3,4] exclude self while calcualting product
Output: [24,12,8,6]
I/P : -1,1,0,-3,3 -> O/P : 0,0,9,0,0

*/
public class ProductOfArray {//1 2 3 -> 6 3 2

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n]; // 1 2 6
        int[] right = new int[n];// 6 6 3
        int product = 1;
        for (int i = 0; i < n; i++) {
            left[i] = product * nums[i];
            product = left[i];
        }
        product = 1;
        for (int i = n - 1; i >= 0; i--) {
            right[i] = product * nums[i];
            product = right[i];
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < n; i++) {
            int l = i == 0 ? 1 : left[i - 1];
            int r = i == n - 1 ? 1 : right[i + 1];
            res[i] = l * r;
        }
        return res;
    }

    public int[] productExceptSelfElm(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++)
            res[i] = 1;

        int left = 1;
        for (int i = 0; i < len; i++) {
            res[i] = res[i] * left;
            left = left * nums[i];
        }
        System.out.println("left to right = "+Arrays.toString(res));
        int right = 1;
        for (int i = len -1; i >= 0; i--) {
            res[i] = res[i] * right;
            right = right * nums[i];
        }
        System.out.println("right to left = "+Arrays.toString(res));
        return res;
    }
}

class ProductOfArrayOptimised extends ProductOfArray {
    @Override
    public int[] productExceptSelf(int[] nums) {
        int[] productArr = new int[nums.length];
        productArr[0] = 1;
        int product = 1;
        for (int i = 1; i < nums.length; i++) {
            product *= nums[i - 1];
            productArr[i] = product;
        }
        System.out.println("before "+Arrays.toString(productArr));
        product = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            product *= nums[i + 1];
            productArr[i] *= product;
        }
        System.out.println("after "+Arrays.toString(productArr));

        return productArr;
    }
}