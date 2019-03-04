package edu.ren.geeks.searching;

public class SearchInRowColSortedMatrix {
    int[] search(int[][] matrix, int num) {
        final int maxCol = binarySearchRow(matrix, num);
        final int maxRow = binarySearchCol(matrix, num);
        int row = 0, col = maxCol;
        boolean found = false;
        boolean movedRight=false;
        while (row <= maxRow && col<=maxCol) {
            if (matrix[row][col] == num) {
                found = true;
                break;
            }
            if (matrix[row][col] < num) {
                if(col<maxCol){
                    movedRight=true;
                    col++;
                }else {
                    row++;
                    col=0;
                    movedRight=false;
                }
            }else {
                if(col>0){
                    col--;
                    if(movedRight){
                        row++;
                    }
                    movedRight=false;
                }else {
                   // row--;
                    break;
                }
            }
        }
        if (found) {
            return new int[]{row, col};
        }

        return new int[]{-1,-1};
    }

    private int binarySearchRow(int[][] matrix, int num) {
        int start = 0, end = matrix[0].length-1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (matrix[0][mid] == num) {
                return mid;
            }
            if (matrix[0][mid] > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private int binarySearchCol(int[][] matrix, int num) {
        int start = 0, end = matrix.length-1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (matrix[mid][0] == num) {
                return mid;
            }
            if (matrix[mid][0] > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

}
