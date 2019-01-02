package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class Regex2Match {
    boolean isMatch(String word, String pattern) {
        return isMatch(word.toCharArray(), pattern.toCharArray());
    }

    boolean isMatch(char[] word, char[] pattern) {
        return isMatch(word, 0, pattern, 0);
    }

    private boolean isMatch(char[] word, int i, char[] pattern, int j) {
        if (i == word.length && j == pattern.length) {
            return true;
        }

        if (i == word.length && j < pattern.length) {
            if (pattern[j] == '*') {
                return isMatch(word, i, pattern, j + 1);

            }
            if (j < pattern.length - 1 && pattern[j + 1] == '*') {
                return isMatch(word, i, pattern, j + 2);
            }
        }

        if (i == word.length || j == pattern.length) {
            return false;
        }


        boolean isMatch = word[i] == pattern[j] || pattern[j] == '.';


        if (j < pattern.length - 1 && pattern[j + 1] == '*') {
            return isMatch(word, i, pattern, j + 2) || isMatch && isMatch(word, i + 1, pattern, j);
        } else {
            return isMatch && isMatch(word, i + 1, pattern, j + 1);
        }

    }

}

