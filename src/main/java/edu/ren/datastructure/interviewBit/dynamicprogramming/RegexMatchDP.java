package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class RegexMatchDP extends RegexMatchWithRetrial {
    @Override
    boolean isMatch(char[] word, char[] pattern) {
        boolean[][] result = new boolean[word.length + 1][pattern.length + 1];

         result[0][0] = true;

        for (int i = 1; i <=pattern.length ; i++) {
            if ('*'== pattern[i-1]) {
                result[0][i] = true;
            } else {
                break;
            }
        }




        for (int i = 1; i <= word.length; i++) {
            for (int j = 1; j <= pattern.length; j++) {
                if (pattern[j - 1] == '*') {
                    result[i][j] = result[i][j - 1] || result[i - 1][j];
                } else if (word[i - 1] == pattern[j - 1] || (pattern[j - 1] == '?')) {
                    result[i][j] = result[i - 1][j - 1];
                }
            }
        }
        return result[word.length][pattern.length];
    }
}
