package edu.leetcode.dp;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MaxSubArraySumWithOneChangeTest {

    @Test
    public void maxSumAfterOperation() {
        int[] nums = {2, -1, -4, -3};
        assertThat(new MaxSubArraySumWithOneChange().maxSumAfterOperation(nums), is(17));
    }

    @Test
    public void maxSumAfterOperation_01() {
        int[] nums = {1,-1,1,1,-1,-1,1};
        assertThat(new MaxSubArraySumWithOneChange().maxSumAfterOperation(nums), is(4));
    }
}