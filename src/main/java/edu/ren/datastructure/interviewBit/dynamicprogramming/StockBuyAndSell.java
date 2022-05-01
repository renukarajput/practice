package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.Arrays;
import java.util.List;

public class StockBuyAndSell {
    int maxProfit(Integer[] prices) {
        return maxProfit(Arrays.asList(prices));
    }
    int maxProfit(List<Integer> prices) {
        int result = 0; //at most 1 transaction
        for (int i = 0; i < prices.size(); i++) {
            for (int j = i ; j < prices.size(); j++) {
                result = Math.max(prices.get(j) - prices.get(i), result);
            }
        }
        return result;
    }
}
