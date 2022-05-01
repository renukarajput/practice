package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class StockBuySellKtimesTest {
    StockBuySellKtimes stockBuySellKtimes = new StockBuySellKtimes();

    @Test
    public void maxProfit() {
        Integer[] arr = {100, 180, 260, 310, 40, 535, 695};
        assertThat(stockBuySellKtimes.getMaxProfit(arr, 1), is(655));
    }

    @Test
    public void maxProfit_1() {
        Integer[] arr = {100, 180, 260, 310, 40, 535, 695};
        assertThat(stockBuySellKtimes.getMaxProfit(arr, 2), is(865));
    }

    @Test
    public void maxProfit_2() {
        Integer[] arr = {100, 180, 260, 310, 40, 535, 695};
        assertThat(stockBuySellKtimes.getMaxProfit(arr, 4), is(865));
    }

    @Test
    public void maxProfit_3() {
        Integer[] arr = {50,100,150,90,120,170,100,120,140,100,130,150,180,100};
        assertThat(stockBuySellKtimes.getMaxProfit(arr, 4), is(300));
    }
    @Test
    public void maxProfit_4() {
        Integer[] arr = {50,100,150,90,120,170,100,120,140,100,130,150,180,100};
        System.out.println(Arrays.toString(arr));
        //100 + (170-90) + (140-100)+(180-100) //4 transactions 100 80 40 80
        assertThat(stockBuySellKtimes.getMaxProfit(arr, 3), is(260));
    }

    @Test
    public void maxProfit_5() {
        Integer[] arr = {50,100,150,90,120,170,100,120,140,100,130,150,180,100};
        assertThat(stockBuySellKtimes.getMaxProfit(arr, 2), is(180));
    }

    @Test
    public void maxProfit_6() {
        Integer[] arr = {50,100,150,90,120,170,100,120,140,100,130,150,180,100};
        assertThat(stockBuySellKtimes.getMaxProfit(arr, 1), is(100));
    }

    @Test
    public void maxProfit_7() {
        Integer[] arr = {50,100,150,90,120,170,100,120,140,100,130,150,180,100};
        assertThat(stockBuySellKtimes.getMaxProfit(arr, 0), is(0));
    }

    @Test
    public void maxProfit_8() {
        Integer[] arr = {10, 22, 5, 75, 65, 80};
        assertThat(stockBuySellKtimes.getMaxProfit(arr, 2), is(87));
    }

    @Test
    public void maxProfit_9() {
        Integer[] arr = {12, 14, 17, 10, 14, 13, 12, 15};
        assertThat(stockBuySellKtimes.getMaxProfit(arr, 3), is(12));
    }

    @Test
    public void maxProfit_10() {
        Integer[] arr = {100, 30, 15, 10, 8, 25, 80};
        assertThat(stockBuySellKtimes.getMaxProfit(arr, 3), is(72));
    }
}