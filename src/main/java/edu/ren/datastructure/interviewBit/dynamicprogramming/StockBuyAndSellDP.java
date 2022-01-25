package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.List;

public class StockBuyAndSellDP extends StockBuyAndSell {

    @Override
    int maxProfit(List<Integer> prices) {
        int result = 0;
        int minPriceSoFar = Integer.MAX_VALUE;
        for (int i = 0; i < prices.size(); i++) {
            minPriceSoFar = Math.min(minPriceSoFar, prices.get(i));
            result = Math.max(result, prices.get(i) - minPriceSoFar);
        }
        return result;
    }
}
