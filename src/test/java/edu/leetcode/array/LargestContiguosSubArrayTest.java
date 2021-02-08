package edu.leetcode.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LargestContiguosSubArrayTest {

    @Test
    public void largestSubarray() {
        int[] nums={1,4,5,2,3};
        int k=4;
        int[] res= new LargestContiguosSubArray().largestSubarray(nums,k);
        System.out.println(Arrays.toString(res));
    }

    @Test
    public void largestSubarray_1() {
        int[] nums={5};
        int k=1;
        int[] res=new LargestContiguosSubArray().largestSubarray(nums,k);
        System.out.println(Arrays.toString(res));
    }

    @Test
    public void largestSubarray_2() {
        int[] nums={5,9};
        int k=1;
        int[] res=new LargestContiguosSubArray().largestSubarray(nums,k);
        System.out.println(Arrays.toString(res));
    }
}