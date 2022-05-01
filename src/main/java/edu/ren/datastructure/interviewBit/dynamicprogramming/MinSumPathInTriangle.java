package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.List;

public class MinSumPathInTriangle extends Grid {
    int minPath(Integer[][] triangle) {
        List<List<Integer>> gridAsList = getGridAsLists(triangle);
        return minPath(gridAsList);
    }
    protected int minPath(List<List<Integer>> triangle){
        return minPath(triangle, 0, 0, 0);
    }
    private int minPath(List<List<Integer>> triangle, int row, int col, int sum) {
        if (row == triangle.size()) {
            return sum;
        }
        if (!(row < triangle.size() && col < triangle.get(row).size())) {
            return -1;
        }
        int currentValue = triangle.get(row).get(col);
        int left = minPath(triangle, row + 1, col, sum + currentValue);
        int right = minPath(triangle, row + 1, col + 1, sum + currentValue);
        if (left == -1) {
            return right;
        }
        if (right == -1) {
            return left;
        }
        return Math.min(left, right);
    }
}
