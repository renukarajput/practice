package edu.leetcode.dp;


public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        return coinChange(coins, coins.length - 1, amount);
    }

    public int coinChange(int[] coins, int index, int amount) {
        if (amount == 0)
            return 0;
        if (amount < 0 || index < 0)
            return -1;

        int inc = 1 + coinChange(coins, index, amount - coins[index]);
        int exc = coinChange(coins, index - 1, amount);
        if (inc > 0 && exc > 0)
            return Math.min(inc, exc);
        if (inc > 0)
            return inc;
        return exc;
    }
}
