package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class RepeatingSubSequenceDP extends RepeatingSubSequence2 {
    @Override
    boolean isRepeating(char[] str) {
        int[][] result = new int[str.length + 1][str.length + 1];

        for (int i = 0; i <= str.length; i++)
            for (int j = 0; j <= str.length; j++) {
                result[i][j] = 0;
            }

        for (int i = 1; i <= str.length; i++) {
            for (int j = 1; j <=str.length ; j++) {

            if (i != j && str[i - 1] == str[j - 1]) {
                result[i][j] = 1 + result[i - 1][j - 1];
            } else {
                result[i][j] = Math.max(result[i][j - 1], result[i - 1][j]);
            }
        }
    }
        return result[str.length ][str.length ] > 1;
    }
}
