package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class CoinChangeByMinimumCoinsDP extends CoinChangeByMinimumCoins {
    @Override
    int getResult(int[] coins, int changeRequired) {
        int[][] coinsUsed = new int[coins.length + 1][changeRequired + 1];
        coinsUsed[0][0] = 0;
        for (int i = 1; i <= changeRequired; i++) {
            coinsUsed[0][i] = -1;
        }

        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= changeRequired; j++) {
                final int usedCoinsByNotSelecting = coinsUsed[i - 1][j];
                final int usedCoinsBySelecting = j - coins[i - 1] >= 0 && coinsUsed[i][j - coins[i - 1]] != -1 ? 1 + coinsUsed[i][j - coins[i - 1]] : -1;

                if (usedCoinsByNotSelecting != -1 && usedCoinsBySelecting != -1) {
                    coinsUsed[i][j] = Math.min(usedCoinsByNotSelecting, usedCoinsBySelecting);
                } else if (usedCoinsByNotSelecting == -1) {
                    coinsUsed[i][j] = usedCoinsBySelecting;
                } else {
                    coinsUsed[i][j] = usedCoinsByNotSelecting;
                }
            }
        }
        return coinsUsed[coins.length][changeRequired];
    }
}
