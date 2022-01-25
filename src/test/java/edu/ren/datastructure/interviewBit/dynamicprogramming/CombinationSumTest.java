package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class CombinationSumTest {

    @Test
    public void combinationSum4() {
        CombinationSum combinationSum = new CombinationSum();
        int[] nums={1,2,3};
       int res= combinationSum.combinationSum4(nums,4);
        System.out.println(res);
    }
}