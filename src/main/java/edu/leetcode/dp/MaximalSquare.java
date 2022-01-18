package edu.leetcode.dp;

public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        int[][]dp = new int[row][col];
        int max = 0;
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(matrix[i][j]=='1') {
                    dp[i][j] = 1;
                    max = 1;
                }
            }
        }

        for(int i=1; i<row; i++) {
            for(int j=1; j<col; j++) {
                if(matrix[i][j]=='1') {
                    dp[i][j] = Math.min(Math.min(dp[i-1][j-1], dp[i-1][j]), dp[i][j-1])+1;
                    max = Math.max(dp[i][j], max);
                }
            }
        }
        return  max * max;
    }

    public int maximalSquare0(char[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            dp[i][0] = matrix[i][0];
        }
        for (int j = 0; j < matrix[0].length; j++) {
            dp[0][j] = matrix[0][j];
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1 + max; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                    max = Math.max(max, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }

        }
        return max;
    }
}
