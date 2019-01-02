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

    public int[][] getClockwiseRotatedMatrixInPlace(int input[][]) {
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

    int[][] rotate(int[][] a) {
        int N = a.length;
        for(int i = 0; i < N/2; i++) {
            for(int j = 0; j < (N+1)/2; j++) {
                int temp = a[i][j];
                a[i][j] = a[N-1-j][i];
                a[N-1-j][i] = a[N-1-i][N-1-j];
                a[N-1-i][N-1-j] = a[j][N-1-i];
                a[j][N-1-i] = temp;
            }
        }
        return a;
    }
}
