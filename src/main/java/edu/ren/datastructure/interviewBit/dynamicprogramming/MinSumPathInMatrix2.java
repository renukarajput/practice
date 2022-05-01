package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.Arrays;
import java.util.List;

public class MinSumPathInMatrix2 extends MinSumPathInMatrix {
    @Override
    public int minSumPath(List<List<Integer>> grid) {
        int row = grid.size() - 1;
        int col = grid.get(0).size() - 1;

        int[][] sumMatrix = new int[row + 1][col + 1];
        for (int[] matrixRow : sumMatrix) {
            Arrays.fill(matrixRow, Integer.MAX_VALUE);
        }
        sumMatrix[0][0]=grid.get(0).get(0);

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                if (i == 0 && j == 0)
                    continue;

                if(j>0) {
                    int sum = sumMatrix[i][j-1] + grid.get(i).get(j);
                    sumMatrix[i][j]=Math.min(sumMatrix[i][j],sum);
                }

                if(i>0) {
                    int sum = sumMatrix[i-1][j] + grid.get(i).get(j);
                    sumMatrix[i][j]=Math.min(sumMatrix[i][j],sum);
                }
            }
        }
        return sumMatrix[row][col];
    }
}
