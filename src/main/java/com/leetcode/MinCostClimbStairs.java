package com.leetcode;

public class MinCostClimbStairs {
// 1 -2- 3- 4
    public int minCostClimbingStairs(int[] cost) {
        final int length = cost.length;
        if (length < 2) return Math.min(cost[0], cost[1]);
        return minCostClimbingStairs(cost, length);
    }

    private int minCostClimbingStairs(int[] cost, int n) {
        if (n < 2) return 0;
        int stepOne = cost[n-1] + minCostClimbingStairs(cost, n - 1);
        int stepTwo = cost[n-2] + minCostClimbingStairs(cost, n - 2);
        return Math.min(stepOne, stepTwo);
    }

    public static int minCostClimbingStairsDP(int[] cost) {
        int[] minCost = new int[cost.length + 1];
        for (int i = 2; i < minCost.length; i++) { // <=cost.length
            int stepOne = minCost[i - 1] + cost[i - 1];
            int stepTwo = minCost[i - 2] + cost[i - 2];
            minCost[i] = Math.min(stepOne, stepTwo);
        }
        return minCost[minCost.length - 1];
    }
}
