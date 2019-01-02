package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.List;

public class UniquePathsInGridIterative extends UniquePathsInGrid {
    @Override
    protected int get(List<List<Integer>> grid, int row, int col) {
        int[][] waysMatrix = new int[row + 1][col + 1];
        if (grid.get(0).get(0) == 0) {
            waysMatrix[0][0] = 1;
        }
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                int ways = 0;
                if (j > 0 && grid.get(i).get(j - 1) == 0) {
                    ways += waysMatrix[i][j - 1];
                }
                if (i > 0 && grid.get(i - 1).get(j) == 0) {
                    ways += waysMatrix[i - 1][j];
                }
                waysMatrix[i][j] += ways;
            }
        }
        return waysMatrix[row][col];
    }
}
