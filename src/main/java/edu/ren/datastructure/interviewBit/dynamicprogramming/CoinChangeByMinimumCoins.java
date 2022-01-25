package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class CoinChangeByMinimumCoins {

    int getResult(int[] coins, int changeRequired) {
        return getResult(coins, changeRequired, coins.length - 1, 0);
    }

    int getResult(int[] coins, int changeRequired, int index, int coinsUsed) {
        if (index < 0) {
            return changeRequired == 0 ? coinsUsed : -1;
        }
        if (changeRequired == 0) {
            return coinsUsed;
        }
        if (changeRequired < 0) {
            return -1;
        }
        int resultBySelecting = getResult(coins, changeRequired - coins[index], index, coinsUsed + 1);
        int resultWithoutSelecting = getResult(coins, changeRequired, index - 1, coinsUsed);
        if (resultBySelecting == -1 && resultWithoutSelecting == -1) {
            return -1;
        }
        if (resultBySelecting == -1) {
            return resultWithoutSelecting;
        }
        if (resultWithoutSelecting == -1) {
            return resultBySelecting;
        }
        return Math.min(resultBySelecting, resultWithoutSelecting);

    }
}
