package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.*;

public class MinSumPathInMatrix {
    int minSumPath(Integer[][] grid) {
        List<List<Integer>> gridAsLists = UniquePathsInGrid.getGridAsLists(grid);
        return minSumPath(gridAsLists);
    }

    public int minSumPath(List<List<Integer>> grid) {
        int row = grid.size() - 1;
        int col = grid.get(0).size() - 1;

        int[][] sumMatrix = new int[row + 1][col + 1];
        for (int[] matrixRow:sumMatrix){
            Arrays.fill(matrixRow,-1);
        }

        Queue<UniquePathsInGridUsingBFS.Cell> queue = new ArrayDeque<>();
        queue.add(new UniquePathsInGridUsingBFS.Cell(0, 0));
        sumMatrix[0][0]=grid.get(0).get(0);
        while (!queue.isEmpty()) {
            UniquePathsInGridUsingBFS.Cell head = queue.remove();
            if (head.col < col) {
                UniquePathsInGridUsingBFS.Cell right = head.right();
                queue.add(right);
                adjustMinSum(grid, sumMatrix,head.row,head.col, right);
            }

            if (head.row < row) {
                UniquePathsInGridUsingBFS.Cell down = head.down();
                queue.add(down);
                adjustMinSum(grid, sumMatrix,head.row,head.col, down);
            }
        }
        return sumMatrix[row][col];
    }

    private void adjustMinSum(List<List<Integer>> grid, int[][] sumMatrix, int row, int col, UniquePathsInGridUsingBFS.Cell next) {
        int sum = sumMatrix[row][col] +grid.get(next.row).get(next.col);
        if (sumMatrix[next.row][next.col] == -1) {
            sumMatrix[next.row][next.col] = sum;
        } else {
            sumMatrix[next.row][next.col] = Math.min(sumMatrix[next.row][next.col], sum);
        }
    }
}


