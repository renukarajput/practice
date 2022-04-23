package com.leetcode;


import org.junit.Assert;
import org.junit.Test;

public class MinCostClimbStairsTest {
    MinCostClimbStairs obj = new MinCostClimbStairs();

    @Test
    public void input_1() {
        final int[] cost = {10, 15, 20};
        Assert.assertEquals(15, obj.minCostClimbingStairs(cost));
    }

    @Test
    public void input_2() {
        final int[] cost = {10, 15};
        Assert.assertEquals(10, obj.minCostClimbingStairs(cost));
    }

    @Test
    public void input_3() {
        final int[] cost = {15, 10};
        Assert.assertEquals(10, obj.minCostClimbingStairs(cost));
    }

    @Test
    public void input_4() {
        final int[] cost = {10, 5, 20, 1, 100};
        Assert.assertEquals(6, obj.minCostClimbingStairs(cost));
    }

    @Test
    public void input_5() {
        final int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        Assert.assertEquals(6, obj.minCostClimbingStairs(cost));
    }
    @Test
    public void input_6() {
        final int[] cost = {16, 19, 10, 12, 18};
        Assert.assertEquals(31, obj.minCostClimbingStairs(cost));
    }   @Test
    public void input_7() {
        final int[] cost = {2, 5, 3, 1, 7, 3, 4};
        Assert.assertEquals(9, obj.minCostClimbingStairs(cost));
    }
}