package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class Regex2MatchDP extends Regex2Match {
    /*    boolean isMatch(String word, String pattern) {
            boolean[][] dp = new boolean[word.length() + 1][pattern.length() + 1];
            dp[word.length()][pattern.length()] = true;

            for (int i = word.length(); i >= 0; i--){
                for (int j = pattern.length() - 1; j >= 0; j--){
                    boolean isMatch = (i < word.length() &&
                            (pattern.charAt(j) == word.charAt(i) ||
                                    pattern.charAt(j) == '.'));
                    if (j + 1 < pattern.length() && pattern.charAt(j+1) == '*'){
                        dp[i][j] = dp[i][j+2] || isMatch && dp[i+1][j];
                    } else {
                        dp[i][j] = isMatch && dp[i+1][j+1];
                    }
                }
            }
            return dp[0][0];
        }*/
    @Override
    boolean isMatch(char[] word, char[] pattern) {
        boolean[][] result = new boolean[word.length + 1][pattern.length + 1];
        result[0][0] = true;
        for (int i = 0; i < pattern.length; i++) {
            if (pattern[i] == '*' || (i < pattern.length-1 && pattern[i + 1] == '*')) {
                result[0][i+1]=true;
            }
        }



        for (int i = 1; i <= word.length; i++) {
            for (int j = 1; j <= pattern.length; j++) {
                boolean isMatchingSoFar = (word[i - 1] == pattern[j - 1])|| pattern[j - 1] == '.';
                if (isMatchingSoFar && result[i - 1][j - 1]) {
                    result[i][j] = true;
                } else if (j < pattern.length && pattern[j] == '*') {
                    result[i][j] = (isMatchingSoFar && result[i-1][j]) || (j > 1 && result[i][j - 2]);
                }
            }
        }
        return result[word.length][pattern.length];
    }
}
