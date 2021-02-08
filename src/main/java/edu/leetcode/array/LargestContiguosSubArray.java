package edu.leetcode.array;

import java.util.Arrays;
/*
https://leetcode.com/problems/largest-subarray-length-k/submissions/
if input has only digits
 */
public class LargestContiguosSubArray {
    public static void main(String[] args) {
        int[] nums={1,4,5,2,3};
        int k=4;
        int[] res=new LargestContiguosSubArray().largestSubarray(nums,k);
        System.out.println(Arrays.toString(res));
    }

    public int[] largestSubarray(int[] nums, int k) {
        int currentMax=0;
        int maxNum=0;
        int maxRangeStart=0,maxRangeEnd=k-1;
        int start=1;
        while (start+k-1<=nums.length) {
            for (int i = start; i <start+k; i++) {
                currentMax = currentMax * 10 + nums[i - 1];

            }
            if (maxNum < currentMax) {
                maxNum = currentMax;
                maxRangeStart = start-1;
                maxRangeEnd = maxRangeStart+k-1;

            }
            currentMax = 0;
            start++;
        }
        int[] result=new int[k];
        for(int j=0,i=maxRangeStart;i<=maxRangeEnd;i++,j++)
            result[j]=nums[i];

        return result;
    }
}