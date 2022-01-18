package edu.leetcode.strings;

public class ValidKPalindrome {

    public boolean isValidPalindrome(String s, int k) {
        int[][] dp = new int[s.length()][s.length()];
        for (int j = 0; j < s.length(); j++) {
            for (int i = j; i >= 0; i--) {
                if (i == j) {
                    dp[i][j] = 0;
                } else {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = dp[i + 1][j - 1];
                    } else {
                        dp[i][j] = Math.min(dp[i + 1][j] + 1, Math.min(dp[i][j - 1] + 1, dp[i + 1][j - 1] + 2));
                    }
                }
            }
        }
        return dp[0][s.length() - 1] <= k;
    }

}