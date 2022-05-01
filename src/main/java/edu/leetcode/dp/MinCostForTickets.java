package edu.leetcode.dp;

public class MinCostForTickets {
    int[] validity = {1, 7, 30};

    public int mincostTickets(int[] days, int[] costs) {

        return mincostTickets(days, costs, 0);


    }

    int mincostTickets(int[] days, int[] costs, int startIndex) {
        // System.out.println("  ===> " + validTill);

        if (days.length  <= startIndex)
            return 0;

        int costSum = Integer.MAX_VALUE;
        for (int j = 0; j < costs.length; j++) {
            int i;
            for (i = startIndex; i < days.length && days[i] < days[startIndex] + validity[j]; i++) {


            }
            int sum = mincostTickets(days, costs, i) + costs[j];

            costSum = Math.min(sum, costSum);
        }

        return costSum;
    }
}
