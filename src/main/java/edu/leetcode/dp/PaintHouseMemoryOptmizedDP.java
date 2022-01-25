package edu.leetcode.dp;

import java.util.Arrays;

public class PaintHouseMemoryOptmizedDP extends PaintHouses {

    public int minCost(int[][] costs) {
        if (costs.length == 0)
            return 0;
        int[][] minCosts = new int[2][costs[0].length];

        int last = 0;
        for (int i = 0; i < costs.length; i++) {
            for (int j = 0; j < costs[0].length; j++) {
                last = i % 2;
                //System.out.println("j= "+j+ "--> "+idx(j + 1)+"-->"+idx(j + 2) +"    "+"--> "+idx(j-1)+"--> "+idx(j+1));
                int costTillNow = (i == 0) ? 0 : Math.min(minCosts[(i - 1) % 2][idx(j + 1)], minCosts[(i - 1) % 2][idx(j + 2)]);
                minCosts[last][j] = costs[i][j] + costTillNow;

            }
        }
        return Math.min(minCosts[last][0], Math.min(minCosts[last][1], minCosts[last][2]));
    }

    int idx(int index) {
        return Math.abs(index % 3);
    }

}


