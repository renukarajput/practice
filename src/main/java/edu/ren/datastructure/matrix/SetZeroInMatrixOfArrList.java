package edu.ren.datastructure.matrix;

import java.util.*;

/**
 * Created by rrn3194 on 11/18/18.
 */

public class SetZeroInMatrixOfArrList {

    public void setMatrixWithZeros(ArrayList<ArrayList<Integer>> input) {
        List<int[]> indexList = new ArrayList<>();
        int[] pair;
        for (int i = 0; i < input.size(); i++) {
            for (int j = 0; j < input.get(0).size(); j++) {
                if (input.get(i).get(j) == 0) {
                    pair = new int[]{i, j};
                    indexList.add(pair);
                }
            }
        }

        for (int i = 0; i < indexList.size(); i++) {
            int row_Idx = indexList.get(i)[0];
            int col_Idx = indexList.get(i)[1];

            setZeroInRow(input, row_Idx);
            setZeroInColumn(input, col_Idx);
        }
    }

    protected void setZeroInRow(ArrayList<ArrayList<Integer>> input, Integer rowIndex) {
        int rowSize = input.get(rowIndex).size();
        for (int j = 0; j < rowSize; j++) {
            input.get(rowIndex).set(j, 0);
        }
    }

    protected void setZeroInColumn(ArrayList<ArrayList<Integer>> input, Integer columnIndex) {
        int columnSize = input.size();
        for (int j = 0; j < columnSize; j++) {
            input.get(j).set(columnIndex, 0);
        }
    }
}

