package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.Arrays;
import java.util.List;

public class MaxRectangleWithAllOnes extends Grid {
    int max(Integer[][] grid) {
        return max(getGridAsLists(grid));
    }

    public int max(List<List<Integer>> grid) {
        int[] colOfLastZeroInRow = new int[grid.size()];
        Arrays.fill(colOfLastZeroInRow,-1);
        int[] rowOfLastZeroInColumn = new int[grid.size()];
        Arrays.fill(rowOfLastZeroInColumn,-1);
        final int row = grid.size() - 1;
        final int col = grid.get(0).size() - 1;
        int result = 0;
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                if (grid.get(i).get(j) == 0) {
                    rowOfLastZeroInColumn[j] = i;
                    colOfLastZeroInRow[i] = j;
                    continue;
                }
                final int maxUnSelectableColumnInRow = colOfLastZeroInRow[i];
                for (int firstColumn = maxUnSelectableColumnInRow+1; firstColumn <= j; firstColumn++) {
                    int maxSelectableColumn = Math.min(firstColumn,col);
                    int maxSelectableRow = 0;
                    for (int k = maxUnSelectableColumnInRow+1; k <= j; k++) {
                        maxSelectableRow = Math.max(maxSelectableRow, rowOfLastZeroInColumn[k]);
                    }
                     maxSelectableRow = Math.min(maxSelectableRow,row);
                    int area = (1 + j - maxSelectableColumn) * (1 + i - maxSelectableRow);
                    result = Math.max(area, result);
                }
            }
        }
        return result;
    }
}
