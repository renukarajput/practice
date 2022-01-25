package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.*;

public class StockBuySellKtimes {

    int getMaxProfit(Integer[] prices, int k) {
        return getMaxProfit(Arrays.asList(prices), k);
    }

    int getMaxProfit(List<Integer> prices, int k) {
        if (k == 0) {
            return 0;
        }

        int lastMin = 0;
        int diff;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k);
        for (int i = 1; i < prices.size(); i++) {
            if (prices.get(i) < prices.get(i - 1)) {
                diff = prices.get(i - 1) - prices.get(lastMin);
                addTopKDifferences(k, diff, priorityQueue);
                lastMin = i;
            } else if (i == prices.size() - 1) {
                diff = Math.max(0, prices.get(i) - prices.get(lastMin));
                addTopKDifferences(k, diff, priorityQueue);
            }
        }
        int sum = priorityQueue.stream().mapToInt(i -> i).sum();
        return sum;
    }

    private void addTopKDifferences(int maxSize, int currentDiff, PriorityQueue<Integer> priorityQueue) {
        if (priorityQueue.size() < maxSize) {
            priorityQueue.add(currentDiff);
        } else if (currentDiff > priorityQueue.peek()) {
            priorityQueue.remove();
            priorityQueue.add(currentDiff);
        }
    }
}
