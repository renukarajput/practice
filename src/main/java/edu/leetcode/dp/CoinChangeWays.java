package edu.leetcode.dp;

public class CoinChangeWays {

    public int change(int amount, int[] coins) {
        int[][]dp=new int[coins.length+1][amount+1];
        for(int i=0;i<=coins.length;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<=coins.length;i++){
            for(int j=1;j<=amount;j++){
                int c=j-coins[i-1]>=0?dp[i][j-coins[i-1]]:0;
                dp[i][j]=dp[i-1][j]+c;
            }
        }
        return dp[coins.length][amount];
    }

    public int _change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int x = coin; x < amount + 1; ++x) {
                dp[x] += dp[x - coin];
            }
        }
        return dp[amount];
    }
}
