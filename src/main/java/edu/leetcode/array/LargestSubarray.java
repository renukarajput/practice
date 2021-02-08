package edu.leetcode.array;

import java.util.Arrays;

public class LargestSubarray {
    public int[] largestSubarray(int[] nums, int k) {
        int largestNum=Integer.MIN_VALUE;
        int startIndexOfMaxSubArray=0;
        for (int i = 0; i <=nums.length-k ; i++) {
            if(nums[i]>largestNum){
                largestNum=nums[i];
                startIndexOfMaxSubArray=i;
            }else if(nums[i]==largestNum){
                for (int first=startIndexOfMaxSubArray,second=i,itr=0;itr<k;itr++){
                    if(nums[first+k]==nums[second+k])
                        continue;
                    if(nums[first+k]>nums[second+k]){
                        break;
                    }else {
                        startIndexOfMaxSubArray=i;
                    }
                }
            }
        }
       return Arrays.copyOfRange(nums,startIndexOfMaxSubArray,startIndexOfMaxSubArray+k);
    }
}
