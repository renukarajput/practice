package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class LongestCommonSubSequence {

    String lcsOf(String one, String two) {
        return lcsOf(one.toCharArray(),two.toCharArray());
    }

   private String lcsOf(char[] one, char[] two) {
        StringBuilder lcs = new StringBuilder();
        int[][] matrix = lcsMatrix(one, two);
       getLCSFromMatrix(one, two, lcs, matrix);
        return lcs.toString();
    }

    private void getLCSFromMatrix(char[] one, char[] two, StringBuilder lcs, int[][] matrix) {
        int row = matrix.length-1;
        int col = matrix[0].length-1;
        while (row > 0 && col > 0)
            if (one[row-1] == two[col-1]) {
                lcs.append(one[row-1]);
                row--;
                col--;
            } else {
                if (matrix[row - 1][col] > matrix[row][col - 1]) {
                    row--;
                } else {
                    col--;
                }
            }
        lcs.reverse();
    }


    private int[][] lcsMatrix(char[] first, char[] second) {
        int m = first.length;
        int n = second.length;
        int[][] lcs = new int[m + 1][n + 1];
        for (int i = 0; i < first.length; i++) {
            lcs[m][0] = 0;
        }
        for (int i = 0; i < second.length; i++) {
            lcs[0][n] = 0;
        }
        int indexOne = 0,indexTwo;
        while (indexOne <first.length) {
            indexTwo=0;
            while (indexTwo < second.length) {
                if (first[indexOne] == second[indexTwo]) {
                    lcs[indexOne + 1][indexTwo + 1] = lcs[indexOne][indexTwo] + 1;

                } else {
                    if (lcs[indexOne + 1][indexTwo] > lcs[indexOne][indexTwo + 1]) {
                        lcs[indexOne + 1][indexTwo + 1] = lcs[indexOne + 1][indexTwo];
                    } else {
                        lcs[indexOne + 1][indexTwo + 1] = lcs[indexOne][indexTwo + 1];
                    }
                }
                indexTwo++;
            }
            indexOne++;
        }
        return lcs;
    }
}
