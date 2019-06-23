package edu.ren.geeks.dp;

public class PathsInGrid {
    //1
    //2  %2
    //3 %2
    static int noOfPathsToReachDestination(int row, int col) {

        int[][] dp = new int[2][col];
        for (int i = 0; i < 2; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < col; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if(dp[i][j] == 0){
                    return 0;
                }
                dp[i % 2][j] = dp[(i - 1) % 2][j] + dp[i % 2][j - 1];
            }
        }
        System.out.println(dp[(row - 1) % 2][col - 1]);
        return dp[(row - 1) % 2][col - 1];
    }

    public static void main(String[] args) {
        PathsInGrid.noOfPathsToReachDestination(4, 4);
        PathsInGrid.noOfPathsToReachDestination(3, 3);
        PathsInGrid.noOfPathsToReachDestination(2, 2);
        PathsInGrid.noOfPathsToReachDestination(7, 3);
        System.out.println("-- "+ PathsInGrid.numberOfPaths(7, 3));
    }

    public static int numberOfPaths(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }

        return numberOfPaths(row - 1, col) + numberOfPaths(row, col - 1);

    }
}
