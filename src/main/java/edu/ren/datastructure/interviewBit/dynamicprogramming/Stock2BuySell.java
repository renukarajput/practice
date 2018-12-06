package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.Arrays;
import java.util.List;

public class Stock2BuySell {
    int maxProfit(Integer[] prices) {
        return maxProfit(Arrays.asList(prices));
    }

    int maxProfit(List<Integer> prices) {
        int indexOfLastSell = -1;
        int maxProfit = 0;
        int maxProfitTillMin = 0;
        int currentMinPriceIndex = 0;

        for (int i = 1; i < prices.size(); i++) {
            int currentProfit = prices.get(i) - prices.get(currentMinPriceIndex);
            if (currentProfit > 0 && currentMinPriceIndex > indexOfLastSell) {
                maxProfit += currentProfit;
                indexOfLastSell = i;
               // System.out.print("bought on day " + currentMinPriceIndex + " " + prices.get(currentMinPriceIndex));
                //System.out.println("sold on day " + i + " " + prices.get(i));
            }
            if (currentProfit + maxProfitTillMin > maxProfit) {
                maxProfit = currentProfit + maxProfitTillMin;
                indexOfLastSell = i;
               // System.out.print("bought on day " + currentMinPriceIndex + " " + prices.get(currentMinPriceIndex));
                //System.out.println("sold on day " + i + " " + prices.get(i));
            }
            if (prices.get(i) < prices.get(currentMinPriceIndex)) {
                currentMinPriceIndex = i;
                maxProfitTillMin = Math.max(maxProfitTillMin, maxProfit);
            }
        }

        return maxProfit;
    }

}
