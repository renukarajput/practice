package edu.ren.hackerrank.stock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class StockStatisticImpl implements StockStatistic {
    Map<String, Double> map = new HashMap();
    Map<String, AtomicInteger> symbolCountMap = new HashMap();

    @Override
    public void push(String symbol, Double price) {
        map.putIfAbsent(symbol, 0.0);
        symbolCountMap.putIfAbsent(symbol, new AtomicInteger(0));
        AtomicInteger existingCount = symbolCountMap.get(symbol);

        synchronized (existingCount) {
            map.put(symbol, map.get(symbol) + price);
            int newCount = existingCount.incrementAndGet();
            symbolCountMap.put(symbol, new AtomicInteger(newCount));
        }
//        if (map.containsKey(symbol)) {
//            map.put(symbol, map.get(symbol) + price);
//            symbolCountMap.put(symbol, symbolCountMap.get(symbol) + 1);
//        } else {
//            map.put(symbol, price);
//            symbolCountMap.put(symbol, 1);
//        }
    }

    @Override
    public int getTickCount(String symbol) {
        if (symbolCountMap.containsKey(symbol)) {
            return symbolCountMap.get(symbol).get();
        }
        return 0;
    }

    @Override
    public double getAveragePrice(String symbol) {
        int tickCount = getTickCount(symbol);
        Double avgPrice = map.get(symbol);
        return avgPrice / tickCount;
    }
}
