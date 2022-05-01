package edu.leetcode.dp;

public class PaintHouseKpaints {
    public int minCostII(int[][] costs) {
        if (costs.length == 0)
            return 0;
        int[][] minCosts = new int[2][costs[0].length];

        int last = 0;
        int indexOfMinInRow = -1;
        int indexOfSecondMinInRow = -1;
        int minInRow = Integer.MAX_VALUE;
        int secondMinInRow = Integer.MAX_VALUE;
        for (int i = 0; i < costs.length; i++) {
            for (int j = 0; j < costs[0].length; j++) {
                last = i % 2;
                //System.out.println("j= "+j+ "--> "+idx(j + 1)+"-->"+idx(j + 2) +"    "+"--> "+idx(j-1)+"--> "+idx(j+1));
              //use min in previous row if not same color ,otherwise second min -both can't be same since j is color index
                int costTillNow = (i == 0) ? 0 : (indexOfMinInRow != j) ? minCosts[(i - 1) % 2][indexOfMinInRow] : minCosts[(i - 1) % 2][indexOfSecondMinInRow];
                minCosts[last][j] = costs[i][j] + costTillNow;
                if (minInRow > costs[i][j]) {
                    indexOfSecondMinInRow = indexOfMinInRow;
                    secondMinInRow = minInRow;
                    indexOfMinInRow = j;
                    minInRow = costs[i][j];
                } else if (secondMinInRow > costs[i][j]) {
                    indexOfSecondMinInRow = j;
                    secondMinInRow = costs[i][j];
                }
            }
        }
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < costs[0].length; i++) {
            minCost = Math.min(minCost, minCosts[last][i]);
        }
        return minCost;
    }

}
