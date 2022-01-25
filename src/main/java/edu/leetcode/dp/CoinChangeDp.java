package edu.leetcode.dp;

public class CoinChangeDp extends CoinChange {
    @Override
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length + 1][amount + 1];

        for (int i = 0; i < coins.length; i++) {
            dp[i][0] = 0;
        }
        dp[0][0]=0;
        for (int i = 1; i <= amount; i++) {
            dp[0][i] = -1;
        }
        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                int inc = j >= coins[i - 1] && dp[i][j - coins[i - 1]] >= 0 ? 1 + dp[i][j - coins[i - 1]] : -1;
                int exc = dp[i - 1][j];
                if (inc >= 0 && exc >= 0) {
                    dp[i][j] = Math.min(inc, exc);
                }
               else if (inc >= 0)
                    dp[i][j] = inc;
                else
                    dp[i][j] = exc;
            }
        }
        return dp[coins.length][amount];

    }

}
