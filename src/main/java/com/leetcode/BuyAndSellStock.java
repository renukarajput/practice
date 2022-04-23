package com.leetcode;

public class BuyAndSellStock {

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                profit = Math.max(prices[j] - prices[i], profit);
            }
        }
        return profit;
    }
//7,1,5,3,6,4
    public int maxProfitOptimized(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min){
                min = prices[i];
            }
            profit = Math.max(prices[i] - min, profit);
        }
        return profit;
    }
}
