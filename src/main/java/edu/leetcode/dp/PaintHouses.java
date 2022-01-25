package edu.leetcode.dp;

import java.util.HashMap;
import java.util.Map;

public class PaintHouses {
    public int minCost(int[][] costs) {
        cache.clear();
        return minCost(costs, 0, -1);
    }
Map<Integer,Integer> cache=new HashMap<>();
    private int minCost(int[][] costs, int startHouseIndex, int lastUsedPaint) {
        if (startHouseIndex >= costs.length)
            return 0;

        int key = startHouseIndex * 10 + lastUsedPaint;
        if(cache.containsKey(key))
            return cache.get(key);
        //System.out.println("mincost("+startHouseIndex+" ,"+lastUsedPaint+")");


        int minCost = Integer.MAX_VALUE;
        for (int houseNumber = startHouseIndex; houseNumber < costs.length; houseNumber++) {
            for (int paint = 0; paint < costs[0].length; paint++) {
                if (lastUsedPaint == paint) continue;
                int cost = costs[houseNumber][paint] + minCost(costs, startHouseIndex + 1, paint);
                minCost = Math.min(cost, minCost);
            }
        }
        cache.put(key,minCost);
        return minCost;
    }
}
