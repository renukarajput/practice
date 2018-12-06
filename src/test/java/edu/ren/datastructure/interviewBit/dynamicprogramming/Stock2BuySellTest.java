package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Stock2BuySellTest {

    Stock2BuySell stock2BuySell=new Stock2BuySell();

    @Test
    public void maxProfit() {
        Integer[] arr={100, 180, 260, 310, 40, 535, 695};
        assertThat(stock2BuySell.maxProfit(arr),is(865));
    }

    @Test
    public void maxProfit_0() {
        Integer[] arr={1,2,3};
        assertThat(stock2BuySell.maxProfit(arr),is(2));
    }
}