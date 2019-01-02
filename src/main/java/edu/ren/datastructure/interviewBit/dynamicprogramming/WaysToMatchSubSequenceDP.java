package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class WaysToMatchSubSequenceDP extends WaysToMatchSubSequence {
    @Override
    int get(char[] word, char[] pattern) {
        int[][] resultMatrix = new int[word.length + 1][pattern.length + 1];

        for (int i = 0; i <= word.length; i++) {
            resultMatrix[i][0] = 1;
        }

        for (int i = 1; i <= pattern.length; i++) {
            resultMatrix[0][i] = 0;
        }

        for (int i = 1; i <= word.length; i++) {
            for (int j = 1; j <= pattern.length; j++) {
                if (word[i - 1] == pattern[j - 1]) {
                    resultMatrix[i][j] = resultMatrix[i - 1][j - 1]+resultMatrix[i-1][j];
                }else {
                    resultMatrix[i][j]=resultMatrix[i-1][j];
                }
            }

        }
        return resultMatrix[word.length][pattern.length];
    }
}
