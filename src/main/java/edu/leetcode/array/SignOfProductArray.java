package edu.leetcode.array;


import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/sign-of-the-product-of-an-array/
public class SignOfProductArray {
    public int arraySign(int[] nums) {
        int countOfNegative = 0;
        int countOfZero = 0;
        for(int i =0; i< nums.length;i++) {
           if (nums[i] < 0) {
               countOfNegative++;
           } else if(nums[i]==0) {
               countOfZero++;
           }
        }
        if (countOfZero >= 1){
            return 0;
        } else {
            return countOfNegative % 2 != 0 ? -1: 1;
        }
    }
}
