package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.Arrays;

public class WaysToMatchSubSequence {
    int get(String str, String pattern) {
        return get(str.toCharArray(), pattern.toCharArray());
    }

    int get(char[] word, char[] pattern) {
        int[][] matrix = new int[word.length + 1][pattern.length + 1];
        for (int[] row : matrix) {
            Arrays.fill(row, -1);
        }
        return get(word, pattern, 0, 0,0);
    }

    int get(char[] word, char[] pattern, int wordIndex, int patternIndex, int matchCount) {

        if (matchCount==pattern.length) {
            return 1;
        }

        if (patternIndex > pattern.length - 1 || wordIndex > word.length - 1) {
            return 0;
        }

        int total = 0;
        for (int i = wordIndex; i < word.length; i++) {
                if (word[i] == pattern[patternIndex]) {
                    total += get(word, pattern, i + 1, patternIndex+ 1, matchCount+1);
                    total += get(word, pattern, i+1, patternIndex, matchCount);

            }
        }
        return total;
    }
}
