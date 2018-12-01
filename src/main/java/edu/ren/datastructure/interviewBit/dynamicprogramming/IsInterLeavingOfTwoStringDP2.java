package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class IsInterLeavingOfTwoStringDP2 extends IsInterLeavingOfTwoStringDP {
    @Override
    protected boolean matches(char[] one, char[] two, char[] pattern) {
        boolean result[][] = new boolean[one.length + 1][two.length + 1];
        //int idx1 = 0, idx2 = 0;

        for (int i = 1; i <= one.length; i++) {
            if (one[i - 1] == pattern[i - 1]) {
                result[i][0] = true;
            } else {
                break;
            }
        }

        for (int i = 1; i <= two.length; i++) {
            if (two[i - 1] == pattern[i - 1]) {
                result[0][i] = true;
            } else {
                break;
            }
        }

        for (int i = 1; i <= one.length; i++) {
            for (int j = 1; j <= two.length; j++) {
                int idx = i + j - 1;
                result[i][j] = (one[i - 1] == pattern[idx] && result[i - 1][j]) || (two[j - 1] == pattern[idx] && result[i][j - 1]);
            }
        }
        return result[one.length][two.length];
    }
}
