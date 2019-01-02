package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class EditDistanceDP extends EditDistance {

    @Override
    protected int getDistance(char[] first, int lengthOne, char[] second, int lengthTwo) {
        int[][] editDistance = new int[lengthOne + 1][lengthTwo + 1];
        for (int i = 0; i < editDistance.length; i++) {
            for (int j = 0; j < editDistance[0].length; j++) {
                if (i == 0) {
                    editDistance[i][j] = j;
                    continue;
                }
                if (j == 0) {
                    editDistance[i][j] = i;
                    continue;
                }

                if (first[i - 1] == second[j - 1]) {
                    editDistance[i][j] = editDistance[i - 1][j - 1];
                } else {
                    int edit1 = editDistance[i][j - 1];
                    int edit2 = editDistance[i - 1][j];
                    int edit3 = editDistance[i - 1][j - 1];
                    int min = Math.min(edit1, edit2);
                    min = Math.min(min, edit3);
                    editDistance[i][j] = 1 + min;
                }
            }
        }
        return editDistance[editDistance.length-1][editDistance[0].length-1];
    }
}
