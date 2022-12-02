package com.leetcode.blind75;

public class UniquePathToReachEndOfGrid {
    public int numberOfUniquePaths(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        return numberOfUniquePaths(m, n - 1) + numberOfUniquePaths(m - 1, n);
    }
}


class UniquePathToReachEndOfGridTopDown extends UniquePathToReachEndOfGrid {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        return numberOfUniquePaths(m, n - 1, dp) + numberOfUniquePaths(m - 1, n, dp);
    }

    public int numberOfUniquePaths(int m, int n, int[][] dp) {
        if (m == 1 || n == 1) {
            return 1;
        }
        if(dp[m][n] != 0) {
            return dp[m][n];
        }
        dp[m][n] = numberOfUniquePaths(m, n - 1,dp) + numberOfUniquePaths(m - 1, n,dp);
        return dp[m][n];
    }

}
class UniquePathToReachEndOfGridBottomUp {

    public int numberOfUniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            dp[i][1]=1;
        }
        for (int i = 1; i <= n; i++) {
            dp[1][i]=1;
        }
        for (int i = 2; i <= m; i++) {
            for (int j = 2; j <= n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m][n];
    }
}
