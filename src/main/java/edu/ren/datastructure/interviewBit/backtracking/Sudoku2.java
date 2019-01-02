package edu.ren.datastructure.interviewBit.backtracking;

import java.util.ArrayList;

public class Sudoku2 extends Sudoku{
    private final char EMPTY_CELL = '.';
    final int start = 1;


    @Override
    void solve(ArrayList<ArrayList<Character>> grid) {
        boolean solved = solveIfFeasible(grid);
      //  System.out.println(solved);
    }

    private boolean solveIfFeasible(ArrayList<ArrayList<Character>> grid) {
        final int size = grid.size();
       /* print(grid);
        System.out.println();*/
        int row = -1;
        int col = -1;
        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.size(); j++) {
                if (grid.get(i).get(j) == EMPTY_CELL) {
                    row = i;
                    col = j;
                    break;
                }
            }
            if (row != -1) {
                break;
            }
        }
        if (row == -1) {
            return true;
        }
        for (int k = start; k <= size; k++) {
            if (isValid(grid, row, col, k) && isSubMatrixValid(grid, row, col, k)) {
                grid.get(row).set(col, Character.forDigit(k, 10));
                boolean isSuccess = solveIfFeasible(grid);
                if (isSuccess) {
                    return true;
                }
                grid.get(row).set(col, EMPTY_CELL);
            }
        }
        return false;
    }


    private boolean isValid(ArrayList<ArrayList<Character>> grid, int row, int col, int num) {
        if (grid.get(row).contains(Character.forDigit(num, 10))) {
            return false;
        }
        for (int i = 0; i < grid.size(); i++) {
            if (grid.get(i).get(col) == Character.forDigit(num, 10)) {
                return false;
            }
        }
        return true;
    }

    private boolean isSubMatrixValid(ArrayList<ArrayList<Character>> grid, int row, int col, int num) {
        boolean[] isPresent = new boolean[10];
        isPresent[num] = true;
        int subMatrixSize = (int) Math.sqrt(grid.size());
        int startRow = row - row % subMatrixSize;
        int startCol = col - col % subMatrixSize;
        for (int i = startRow; i < startRow + subMatrixSize; i++) {
            for (int j = startCol; j < startCol + subMatrixSize; j++) {
                if (i == row && j == col) {
                    continue;
                }
                Character charValue = grid.get(i).get(j);
                if (charValue == EMPTY_CELL) {
                    continue;
                }
                Integer visitedIndex = Character.getNumericValue(charValue);
                if (isPresent[visitedIndex]) {
                    return false;
                }
                isPresent[visitedIndex] = true;
            }
        }
        return true;
    }

    void print(ArrayList<ArrayList<Character>> grid) {
        grid.forEach(g -> System.out.println(g));
    }
}
