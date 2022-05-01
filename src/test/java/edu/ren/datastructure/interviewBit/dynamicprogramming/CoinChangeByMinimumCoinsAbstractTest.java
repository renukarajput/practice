package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public abstract class CoinChangeByMinimumCoinsAbstractTest {
    CoinChangeByMinimumCoins coinChangeByMinimumCoins = getCoinChangeByMinimumCoins();

    protected abstract CoinChangeByMinimumCoins getCoinChangeByMinimumCoins();

    @Test
    public void minCoins() {
        int[] coins = {1, 3, 5, 6, 7};
        assertThat(coinChangeByMinimumCoins.getResult(coins, 27), is(4));
    }


    @Test
    public void minCoins1() {
        int[] coins = {2, 5, 10, 1};
        assertThat(coinChangeByMinimumCoins.getResult(coins, 27), is(4));
    }

    @Test
    public void minCoins_1() {
        int[] coins = {1, 2, 3};
        assertThat(coinChangeByMinimumCoins.getResult(coins, 6), is(2));
    }

    @Test
    public void minCoins_01() {
        int[] coins = {1, 2, 3};
        assertThat(coinChangeByMinimumCoins.getResult(coins, 5), is(2));
    }

    @Test
    public void minCoins_2() {
        int[] coins = {2, 4, 6, 9};
        assertThat(coinChangeByMinimumCoins.getResult(coins, 19), is(3));
    }

  @Test
    public void minCoins_02() {
        int[] coins = {2, 4, 6, 9};
        assertThat(coinChangeByMinimumCoins.getResult(coins, 10), is(2));
    }

    @Test
    public void minCoins_3() {
        int[] coins = {2, 4, 6, 9};
        assertThat(coinChangeByMinimumCoins.getResult(coins, 1), is(-1));
    }
}