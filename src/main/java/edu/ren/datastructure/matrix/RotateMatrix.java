package edu.ren.datastructure.matrix;


public class RotateMatrix {

    public int[][] getClockwiseRotatedMatrix(int input[][]) {
        final int inputRowSize = input.length;
        final int inputColSize = input[0].length;


        int[][] result = new int[inputColSize][inputRowSize];
        int col = inputRowSize - 1;
        int row = 0;

        while (col >= 0) {
            for (int i = 0; i <= inputColSize - 1; i++) {
                result[i][col] = input[row][i];
            }
            row++;
            col--;
        }
        return result;
    }
}
