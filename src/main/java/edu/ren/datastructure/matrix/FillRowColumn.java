package edu.ren.datastructure.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rrn3194 on 3/18/18.
 */
public class FillRowColumn {

    public void fillRowAndCol(int[][] input) {
        List<int[]> pairList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] == 1) {
                    int[] pair = new int[]{i, j};
                    pairList.add(pair);
                }
            }
        }


        for (int i = 0; i < pairList.size(); i++) {
            int row_idx = pairList.get(i)[0];
            int col_idx = pairList.get(i)[1];
            for (int j = 0; j < input[0].length; j++) {
                input[row_idx][j] = 1;
            }

            for (int j = 0; j < input.length; j++) {
                input[j][col_idx] = 1;
            }
        }

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(input[i][j]+" ");
            }
            System.out.println();
        }


    }

}
