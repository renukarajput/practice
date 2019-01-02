package edu.ren.datastructure.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rrn3194 on 11/18/18.
 */

public class SetZeroInMatrixOfArr {

    public void setMatrixWithZeros(int[][] input) {
        List<int[]> indexList = new ArrayList<>();
        int[] pair;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                if (input[i][j] == 0) {
                    pair = new int[]{i, j};
                    indexList.add(pair);
                }
            }
        }

        for (int i = 0; i < indexList.size(); i++) {
            int row_Idx = indexList.get(i)[0];
            int col_Idx = indexList.get(i)[1];

            for (int j = 0; j < input[0].length; j++) {
                input[row_Idx][j] = 0;
            }
            for (int j = 0; j < input.length; j++) {
                input[j][col_Idx] = 0;
            }
        }
    }
}
