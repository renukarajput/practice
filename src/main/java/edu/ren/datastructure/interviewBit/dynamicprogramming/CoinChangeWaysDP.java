package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class CoinChangeWaysDP extends CoinChangeWaysRecursive {
    @Override
    int getWays(int[] coins, int amount) {
        int[][] result = new int[coins.length + 1][amount + 1];
        for (int i = 0; i <= coins.length; i++) {
            result[i][0] = 1;
        }
        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                int byUsing = j - coins[i-1] >= 0 ? result[i][j - coins[i-1]] : 0;
                result[i][j] = result[i - 1][j] + byUsing;
            }
        }
        return result[coins.length][amount];
    }
}
