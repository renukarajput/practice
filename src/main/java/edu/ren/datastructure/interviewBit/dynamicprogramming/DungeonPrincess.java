package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.List;
import java.util.Stack;

public class DungeonPrincess {

    static class Cell {
        int row;
        int col;


        public Cell(int row, int col) {
            this.row = row;
            this.col = col;
        }

        Cell down() {
            return new Cell(row + 1, col);
        }

        Cell right() {
            return new Cell(row, col + 1);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cell cell = (Cell) o;
            return row == cell.row &&
                    col == cell.col;
        }


        @Override
        public String toString() {
            return "(" + row + "," + col+")";
        }
    }

    int minimumInititalHealth(Integer[][] grid) {
        List<List<Integer>> gridAsLists = UniquePathsInGrid.getGridAsLists(grid);
        return minimumInititalHealth(gridAsLists);
    }
    protected int minimumInititalHealth(List<List<Integer>> grid){
        return minimumInititalHealth(grid, new Stack<>());

    }

    private int minimumInititalHealth(List<List<Integer>> grid, Stack<Cell> stack) {
        final int row = grid.size() - 1;
        final int col = grid.get(0).size() - 1;

        int minHealth = Integer.MAX_VALUE, currentMinHealthNeed;
        int minInitialHealthNeedInPath = Integer.MIN_VALUE;
        int currentHealthSum = 0;
        boolean[][] visitedState = new boolean[row + 1][col + 1];
        Cell lastPopped = null;
        stack.add(new Cell(0, 0));
        currentHealthSum+=grid.get(0).get(0);
        visitedState[0][0]=true;

        while (!stack.isEmpty()) {
            Cell cell = stack.peek();

            if (currentHealthSum < 0) {
                currentMinHealthNeed = 1 - currentHealthSum;
                minInitialHealthNeedInPath = Math.max(currentMinHealthNeed, minInitialHealthNeedInPath);
            }

            if (cell.row == row && cell.col == col) {
                minHealth = Math.min(minHealth, minInitialHealthNeedInPath);
              //  System.out.println(stack);
                //System.out.println(cell + "sum " + currentHealthSum + " minReq " + minInitialHealthNeedInPath);
                minInitialHealthNeedInPath = Integer.MIN_VALUE;
            }

            if(cell.down().equals(lastPopped)){
                lastPopped = stack.pop();
                visitedState[cell.row][cell.col] = false;
                currentHealthSum -= grid.get(cell.row).get(cell.col);
                continue;
            }

            boolean movedRight = false;
            if (cell.col < col && visitedState[cell.row][cell.col + 1] == false) {
                Cell right = cell.right();
                if (!right.equals(lastPopped)) {
                    visitedState[cell.row][cell.col + 1] = true;
                    stack.add(right);
                    currentHealthSum += grid.get(right.row).get(right.col);
                    movedRight = true;
                }
            }
            boolean movedDown = false;

            if (!movedRight && cell.row < row && visitedState[cell.row + 1][cell.col] == false) {
                Cell down = cell.down();
                    visitedState[cell.row + 1][cell.col] = true;
                    stack.add(down);
                    currentHealthSum += grid.get(down.row).get(down.col);
                    movedDown=true;
            }

            if (movedDown == false && movedRight == false) {
                lastPopped = stack.pop();
                visitedState[cell.row][cell.col] = false;
                currentHealthSum -= grid.get(cell.row).get(cell.col);
            }
        }
        return minHealth;
    }

}
