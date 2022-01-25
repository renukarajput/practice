package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class CoinChangeWaysRecursive {

    int getWays(int[] coins, int amount) {
        return getWays(coins, amount,coins.length - 1);
    }

    int getWays(int[] coins, int amount, int index) {
        if (index < 0) {
            return amount == 0 ? 1 : 0;
        }
        if(amount==0){
            return 1;
        }
        if(amount<0){
            return 0;
        }
        int waysWithoutSelecting = getWays(coins, amount, index - 1);
        int waysWithSelecting = getWays(coins, amount - coins[index], index);
        return waysWithoutSelecting + waysWithSelecting;
    }
}
