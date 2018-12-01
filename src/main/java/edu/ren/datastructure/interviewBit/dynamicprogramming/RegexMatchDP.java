package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class RegexMatchDP extends RegexMatch2 {
    @Override
    boolean isMatch(char[] word, char[] pattern) {
        boolean[][] result = new boolean[word.length + 1][pattern.length + 1];

        if (pattern[0] == word[0] || (pattern[0] == '?') || pattern[0] == '*') {

           // result[0][0] = true;
            result[0][1] = true;
        }

        for (int i = 0; i <pattern.length ; i++) {
            if ('*'== pattern[i]) {
                result[0][i] = true;
            } else {
                break;
            }
        }




        for (int i = 1; i <= word.length; i++) {
            for (int j = 1; j <= pattern.length; j++) {
                if (pattern[j - 1] == '*') {
                    result[i][j] = result[i][j - 1] || result[i - 1][j];
                } else if (word[i - 1] == pattern[j - 1] || pattern[j - 1] == '?') {
                    result[i][j] = result[i - 1][j - 1];
                }
            }
        }
        return result[word.length][pattern.length];
    }
}
