package edu.leetcode.dp;

import javax.swing.text.MutableAttributeSet;
import java.util.Arrays;

public class PaintHousesDP extends PaintHouses {
    public int minCost(int[][] costs) {
        if(costs.length==0)
            return 0;
        int[][] minCosts = new int[costs.length][costs[0].length];
        for (int i = 0; i <costs.length ; i++) {
            Arrays.fill(minCosts[i],Integer.MAX_VALUE);
        }
        for (int i = 0; i < costs.length; i++) {
            for (int j = 0; j < costs[0].length; j++) {
                //System.out.println("j= "+j+ "--> "+idx(j + 1)+"-->"+idx(j + 2) +"    "+"--> "+idx(j-1)+"--> "+idx(j+1));
                int costTillNow = (i == 0) ? 0 : Math.min(minCosts[i - 1][idx(j + 1)], minCosts[i - 1][idx(j + 2)]);
                minCosts[i][j] = Math.min(minCosts[i][j], costs[i][j] + costTillNow);
            }
        }
        return Math.min(minCosts[minCosts.length - 1][0], Math.min(minCosts[minCosts.length - 1][1], minCosts[minCosts.length - 1][2]));
    }

    int idx(int index) {
        return Math.abs(index % 3);
    }

}
