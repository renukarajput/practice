package edu.ren.datastructure.interviewBit.backtracking;

import java.util.ArrayList;

public class Sudoku {

    private final char EMPTY_CELL = '.';
    final int start = 1;

    class Cell {
        final int gridSize;
        final int subSize;

        public Cell(int gridSize) {
            this.gridSize = gridSize;
            this.subSize = (int) Math.sqrt(gridSize);
        }

        int row;
        int col;

        void next() {
            if (col == gridSize - 1) {
                col = 0;
                row += 1;
            } else {
                col += 1;
            }
        }

        void back() {
            if (col == 0) {
                col = gridSize - 1;
                row -= 1;
            } else {
                col -= 1;
            }
        }

        @Override
        public String toString() {
            return "(" + row + "," + col + ')';
        }
    }

    void solve(ArrayList<ArrayList<Character>> grid) {
        Cell cell = new Cell(grid.size());
        cell.row = 0;
        cell.col = 0;
        boolean solved = solve(grid, cell);
        //System.out.println(solved);
    }

    private boolean solve(ArrayList<ArrayList<Character>> grid, Cell cell) {
        final int size = grid.size();
       /* print(grid);
        System.out.println();*/
        if (!(cell.row < size && cell.col < size)) {
            return true;
        }
        if (isEmpty(grid, cell.row, cell.col)) {
            for (int k = start; k <= size; k++) {
                if (isValid(grid, cell.row, cell.col, k) && isSubMatrixValid(grid, cell, k)) {
                    grid.get(cell.row).set(cell.col, Character.forDigit(k, 10));
                    cell.next();
                    boolean isSuccess = solve(grid, cell);
                    if (isSuccess) {
                        return true;
                    }
                    grid.get(cell.row).set(cell.col, EMPTY_CELL);
                    cell.back();
                }
            }
            return false;
        } else {
            cell.next();
            boolean isSolved = solve(grid, cell);
            if (isSolved) {
                return true;
            }
            grid.get(cell.row).set(cell.col, EMPTY_CELL);
            cell.back();
            return false;
        }

    }

    private boolean isEmpty(ArrayList<ArrayList<Character>> grid, int row, int col) {
        return grid.get(row).get(col).equals(EMPTY_CELL);
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

    private boolean isSubMatrixValid(ArrayList<ArrayList<Character>> grid, Cell cell, int num) {
        boolean[] isPresent = new boolean[10];
        isPresent[num] = true;
        int subMatrixSize = cell.subSize;
        int startRow = cell.row - cell.row % subMatrixSize;
        int startCol = cell.col - cell.col % subMatrixSize;
        for (int i = startRow; i < startRow + subMatrixSize; i++) {
            for (int j = startCol; j < startCol + subMatrixSize; j++) {
                if (i == cell.row && j == cell.col) {
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
