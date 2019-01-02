package edu.ren.datastructure.interviewBit.binarysearch;

import java.util.List;



public class MatrixSearch {
    int search(List<List<Integer>> matrix, int key) {
        final int NUM_ROW = matrix.size() - 1;
        return search(matrix, key, 0,  NUM_ROW);
    }

    int search(List<List<Integer>> matrix, int key,int startRow,int endRow){
        int midRow=0;
        while (startRow<=matrix.size()-1 && endRow>=0) {
            midRow = startRow + (endRow - startRow) / 2;
            if (key >= getMaxtrixElement(matrix, midRow, 0) && key <= getMaxtrixElement(matrix, midRow, matrix.get(0).size() - 1)) {
               break;
                // return binarySearch(matrix.get(midRow), key);
            }
            if (key < getMaxtrixElement(matrix, midRow, 0)) {
                endRow = midRow - 1;
            }else {
                startRow=midRow+1;
            }
        }
         return binarySearch(matrix.get(midRow), key);
    }
    int binarySearch(List<Integer> row,int key){
        int start=0,end=row.size()-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(row.get(mid)==key){
                return 1;
            }
            if(row.get(mid)<key){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return 0;
    }

    protected int getMaxtrixElement(List<List<Integer>> matrix, int row, int col) {
        return matrix.get(row).get(col);
    }
}
