package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public abstract class StockBuyAndSellAbstractTest {

    StockBuyAndSell stockBuyAndSell = getStockBuyAndSell();

    protected abstract StockBuyAndSell getStockBuyAndSell();

    @Test
    public void maxProfit() {
        Integer[] prices = {1, 2};
        assertThat(stockBuyAndSell.maxProfit(prices), is(1));
    }

    @Test
    public void maxProfit_1() {
        Integer[] prices = {10, 5, 15, 1, 9};
        assertThat(stockBuyAndSell.maxProfit(prices), is(10));
    }

   @Test
    public void maxProfit_2() {
        Integer[] prices = {10, 5, 15, 1, 9,3,15,14,17};
        assertThat(stockBuyAndSell.maxProfit(prices), is(16));
    }
}