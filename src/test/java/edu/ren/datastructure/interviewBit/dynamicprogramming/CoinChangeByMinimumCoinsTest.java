package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CoinChangeByMinimumCoinsTest {
    CoinChangeByMinimumCoins coinChangeByMinimumCoins = new CoinChangeByMinimumCoins();

    @Test
    public void minCoins() {
        int[] coins = {1, 3, 5, 6, 7};
        assertThat(coinChangeByMinimumCoins.getResult(coins, 11), is(2));
    }

    @Test
    public void minCoins_1() {
        int[] coins = {1, 2, 3};
        assertThat(coinChangeByMinimumCoins.getResult(coins, 6), is(2));
    }

    @Test
    public void minCoins_2() {
        int[] coins = {2, 4, 6, 9};
        assertThat(coinChangeByMinimumCoins.getResult(coins, 19), is(3));
    }

    @Test
    public void minCoins_3() {
        int[] coins = {2, 4, 6, 9};
        assertThat(coinChangeByMinimumCoins.getResult(coins, 1), is(-1));
    }
}