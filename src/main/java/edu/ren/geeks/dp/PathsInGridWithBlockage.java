package edu.ren.geeks.dp;

public class PathsInGridWithBlockage {

    int noOfPathsToReachDestination(int[][] pathMatrix) {

        int row = pathMatrix.length;
        int column = pathMatrix[0].length;
        int[][] dp = new int[row][column];
        for (int i = 0; i < row; i++) {
            if (pathMatrix[i][0] == 1) {
                break;
            }
            dp[i][0] = 1    ;
        }


        for (int j = 0; j < column; j++) {
            if (pathMatrix[j][0] == 1) {
                break;
            }
            dp[0][j] = 1;
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                if (pathMatrix[i][j] == 1) {
                    dp[i][j] = 0;
                    continue;
                }
                dp[i][j] = Math.min(dp[i - 1][j] , dp[i][j - 1]);
            }
        }

        return dp[row - 1][column - 1];
    }
}
