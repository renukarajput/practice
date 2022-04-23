package com.leetcode;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BuyAndSellStockTest {
    BuyAndSellStock obj = new BuyAndSellStock();

    @Test
    public void input_0() {
        assertThat(obj.maxProfit(new int[]{7, 1, 5, 3, 6, 4}), is(5));
    }

    @Test
    public void input_1() {
        assertThat(obj.maxProfit(new int[]{7, 6, 4, 3, 1}), is(0));
    }

    @Test
    public void input_2() {
        assertThat(obj.maxProfitOptimized(new int[]{7, 1, 5, 3, 6, 4}), is(5));
    }

    @Test
    public void input_3() {
        assertThat(obj.maxProfitOptimized(new int[]{7, 6, 4, 3, 1}), is(0));
    }
}