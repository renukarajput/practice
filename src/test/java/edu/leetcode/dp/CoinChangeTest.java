package edu.leetcode.dp;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CoinChangeTest {
    CoinChange coinChange = new CoinChangeDp();

    @Test
    public void change() {
        assertThat(coinChange.coinChange(new int[]{1}, 2), is(2));
    }

    @Test
    public void changeLargerAmount() {
        assertThat(coinChange.coinChange(new int[]{2}, 3), is(-1));
    }

    @Test
    public void minCoins1() {
        int[] coins = {2, 5, 10, 1};
        assertThat(coinChange.coinChange(coins, 27), is(4));
    }
}