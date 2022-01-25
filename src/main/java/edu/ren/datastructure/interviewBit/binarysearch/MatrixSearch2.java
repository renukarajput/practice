package edu.ren.datastructure.interviewBit.binarysearch;

import java.util.ArrayList;
import java.util.List;

public class MatrixSearch2 extends MatrixSearch{
    @Override
    int search(List<List<Integer>> matrix, int key) {
        return searchMatrix(matrix,key);
    }

    public int searchMatrix(List<List<Integer>> matrix, int key) {
        int NUM_ROWS = matrix.size();
        int NUM_COLS = matrix.get(0).size();
        int startRow = 0;
        int endRow = NUM_ROWS - 1;
        // default value is last row for edge case
       // int biRow = NUM_ROWS - 1; // row to search column

        //binary search 1st value of rows
        int mid = 0;
        while (startRow <= endRow) {
            mid = (startRow + endRow) / 2;
            if (key >= matrix.get(mid).get(0) && key <= matrix.get(mid).get(NUM_COLS - 1)) {
                break;
            }
            if (key < matrix.get(mid).get(0)) {
                endRow = mid - 1;
            } else {
                startRow = mid + 1;
            }
        }

       int biRow = mid;

        //binary search column of biRow
        startRow = 0;
        endRow = NUM_COLS - 1;
        while (startRow <= endRow) {
            mid = (startRow + endRow) / 2;
            if (key == matrix.get(biRow).get(mid)) {
                return 1;
            }
            if (key < matrix.get(biRow).get(mid)) {
                endRow = mid - 1;
            } else {
                startRow = mid + 1;
            }
        }
        return 0;
    }
}