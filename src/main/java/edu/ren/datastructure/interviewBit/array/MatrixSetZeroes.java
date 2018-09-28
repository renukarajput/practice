package edu.ren.datastructure.interviewBit.array;

public class MatrixSetZeroes {
    void set(int[][] matrix) {
        boolean zeroInFirstRow = false;
        boolean zeroInFirstColumn = false;
        for (int val : matrix[0]) {
            if (val == 0) {
                zeroInFirstRow = true;
                break;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                zeroInFirstColumn = true;
                break;
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                setColumn(matrix, i,1,0);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                setRow(matrix, i,1,0);
            }
        }

        if(zeroInFirstRow){
            setRow(matrix,0,0,0);
        }

        if(zeroInFirstColumn){
            setColumn(matrix,0,0,0);
        }
    }

    private void setRow(int[][] matrix, int rowNum, int fromCol,int val) {
        for (int i = fromCol; i < matrix[0].length; i++) {
            matrix[rowNum][i] = val;
        }
    }

    private void setColumn(int[][] matrix, int colNum,int fromRow, int val) {
        for (int i = fromRow; i < matrix.length; i++) {
            matrix[i][colNum] = val;
        }
    }
}
