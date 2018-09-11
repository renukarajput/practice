package edu.ren.datastructure.matrix;


public class RotateMatrix {

    public int[][] getClockwiseRotatedMatrix(int input[][]) {
        final int inputRowSize = input.length;
        final int inputColSize = input[0].length;
        int lastColumnOfResult = inputRowSize - 1;

        int[][] result = new int[inputColSize][inputRowSize];
        for (int rowIndex = 0; rowIndex < inputRowSize; rowIndex++) {
            for (int colIndex = 0; colIndex < inputColSize; colIndex++) {
                result[colIndex][lastColumnOfResult] = input[rowIndex][colIndex];
            }
            lastColumnOfResult--;
        }
        return result;
    }

}
