package edu.ren.datastructure.interviewBit.array;

import java.util.ArrayList;

public class MatrixSetZeroes {

        void set(ArrayList<ArrayList<Integer>> matrix) {
        boolean zeroInFirstRow = false;
        boolean zeroInFirstColumn = false;
        for (int val : matrix.get(0)) {
            if (val == 0) {
                zeroInFirstRow = true;
                break;
            }
        }
        for (int i = 0; i < matrix.size(); i++) {
            if (matrix.get(i).get(0) == 0) {
                zeroInFirstColumn = true;
                break;
            }
        }

        for (int i = 1; i < matrix.size(); i++) {
            for (int j = 1; j < matrix.get(0).size(); j++) {
                if (matrix.get(i).get(j) == 0) {
                    matrix.get(0).set(j, 0);
                    matrix.get(i).set(0, 0);
                }
            }
        }

        for (int i = 1; i < matrix.get(0).size(); i++) {
            if (matrix.get(0).get(i) == 0) {
                setColumn(matrix, i,1,0);
            }
        }

        for (int i = 1; i < matrix.size(); i++) {
            if (matrix.get(i).get(0) == 0) {
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

    private void setRow(ArrayList<ArrayList<Integer>> matrix, int rowNum, int fromCol,int val) {
        for (int i = fromCol; i < matrix.get(0).size(); i++) {
            matrix.get(rowNum).set(i,val);
        }
    }

    private void setColumn(ArrayList<ArrayList<Integer>> matrix, int colNum,int fromRow, int val) {
        for (int i = fromRow; i < matrix.size(); i++) {
            matrix.get(i).set(colNum,val);
        }
    }
}
