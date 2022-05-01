package edu.leetcode.dp;

public class MinimumRoundingError {
    public String minimizeError(String[] prices, int target) {
        double minError = minimizeError(prices, target, 0, 0.0);
        return minError == -1 ? "-1" : Double.toString(minError);
    }

    double minimizeError(String[] prices, double target, int startIndex, double totalError) {
        if (totalError < 0)
            return -1;
        if (target == 0)
            return totalError;
        if (target < 0 || startIndex == prices.length)
            return -1;

        Double price = Double.valueOf(prices[startIndex]);
        double errorInCeil = Math.ceil(price) - price;
        double errorInFloor = price - Math.floor(price);
        double min1 = minimizeError(prices, target - Math.ceil(price), startIndex + 1, totalError + errorInCeil);
        double min2 = minimizeError(prices, target - Math.floor(price), startIndex + 1, totalError + errorInFloor);
        //double min3 = minimizeError(prices, target - price, startIndex + 1, totalError);
        double result = -1;
        if (min1 != -1) {
            if (result == -1)
                result = min1;
            else
                result = Math.min(result, min1);
        }
        if (min2 != -1) {
            if (result == -1)
                result = min2;
            else
                result = Math.min(result, min2);
        }
        /*if (min3!=-1){
            result=Math.min(result,min3);
        }*/
        return result;
    }
}
