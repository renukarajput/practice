package edu.ren.datastructure.interviewBit.binarysearch;

import java.util.List;

public class MatrixSearchAsArraySearch extends MatrixSearch {

    int search(List<List<Integer>> matrix, int key) {
        final int rowSize = matrix.size() - 1;
        final int colSize = matrix.get(0).size() - 1;
        int totalElements = rowSize * colSize;
        return search(matrix, key, totalElements, rowSize, colSize, 0, 0, rowSize, colSize);
    }

    int search(List<List<Integer>> matrix, int key, int totalElements, int rowSize, int colSize, int startRow, int startColumn, int endRow, int endCol) {
        if (startRow > rowSize || startColumn > colSize || endRow < 0 || endCol < 0) {
            return -1;
        }
        if (totalElements == 0) {
            if (matrix.get(startRow).get(startColumn) == key) {
                return 1;
            }
            return 0;
        }

        int numberOfElementsInOneHalf = totalElements / 2;
        int midRow = numberOfElementsInOneHalf / rowSize;
        int midCol = numberOfElementsInOneHalf % rowSize;
        int element = getMaxtrixElement(matrix, midRow, midCol);
        if (element == key) {
            return 1;
        }
        if (element > key) {
            if (midCol != 0) {
                endRow = midRow;
                endCol = midCol - 1;
            } else {
                endRow = midRow - 1;
                endCol = colSize;
            }

        } else {
            if (midCol != colSize) {
                startRow = midRow;
                startColumn = midCol + 1;
            } else {
                startRow = midRow + 1;
                startColumn = 0;
            }
        }
        return search(matrix, key, numberOfElementsInOneHalf, rowSize, colSize, startRow, startColumn, endRow, endCol);
    }
}
