package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class QueenAttack extends Grid {
    List<List<Integer>> getNumberOfAttackingQueens(Integer[][] board) {
        return getNumberOfAttackingQueens(getGridAsLists(board));
    }

    List<List<Integer>> getNumberOfAttackingQueens(List<List<Integer>> board) {

        final int NUM_ROW = board.size();
        final int NUM_COL = board.get(0).size();

        int[][][] attackMatrix = new int[NUM_ROW][NUM_COL][4];
        List<List<Integer>> numAttacks = new ArrayList<>();

        for (int i = 0; i < NUM_ROW; i++) {
            for (int j = 0; j < NUM_COL; j++) {
                fillAttackCount(board, attackMatrix, i, j, true);
            }
        }

        for (int i = NUM_ROW - 1; i >= 0; i--) {
            for (int j = NUM_COL - 1; j >= 0; j--) {
                fillAttackCount(board, attackMatrix, i, j, false);
            }
        }

        for (int i = 0; i < board.size(); i++) {
            numAttacks.add(new ArrayList<>());
            for (int j = 0; j < board.get(0).size(); j++) {
                int[] counts = attackMatrix[i][j];
                int countSum = 0;
                for (int count : counts) {
                    countSum += count;
                }
                numAttacks.get(i).add(countSum);
            }
        }
        return numAttacks;
    }

    private void fillAttackCount(List<List<Integer>> board, int[][][] attackMatrix, int i, int j, boolean firstPass) {
        int ROW = 0;
        int COL = 1;
        int BACK_DIAGONAL = 2;
        int FORWARD_DIAGONAL = 3;

        if (board.get(i).get(j) == 1 && firstPass) {
            //set neighbour attack matrices
            incrementAttackCount(ROW, attackMatrix, i, j + 1);
            incrementAttackCount(ROW, attackMatrix, i, j - 1);

            incrementAttackCount(COL, attackMatrix, i - 1, j);
            incrementAttackCount(COL, attackMatrix, i + 1, j);

            incrementAttackCount(BACK_DIAGONAL, attackMatrix, i + 1, j + 1);
            incrementAttackCount(BACK_DIAGONAL, attackMatrix, i - 1, j - 1);

            incrementAttackCount(FORWARD_DIAGONAL, attackMatrix, i + 1, j - 1);
            incrementAttackCount(FORWARD_DIAGONAL, attackMatrix, i - 1, j + 1);
        } else {
            int count = Math.max(getAttackCount(ROW, board, attackMatrix, i, j - 1), getAttackCount(ROW, board, attackMatrix, i, j + 1));
            setAttackCount(ROW, attackMatrix, i, j, count);

            count = Math.max(getAttackCount(COL, board, attackMatrix, i + 1, j), getAttackCount(COL, board, attackMatrix, i - 1, j));
            setAttackCount(COL, attackMatrix, i, j, count);

            count = Math.max(getAttackCount(BACK_DIAGONAL, board, attackMatrix, i + 1, j + 1), getAttackCount(BACK_DIAGONAL, board, attackMatrix, i - 1, j - 1));
            setAttackCount(BACK_DIAGONAL, attackMatrix, i, j, count);

            count = Math.max(getAttackCount(FORWARD_DIAGONAL, board, attackMatrix, i + 1, j - 1), getAttackCount(FORWARD_DIAGONAL, board, attackMatrix, i - 1, j + 1));
            setAttackCount(FORWARD_DIAGONAL, attackMatrix, i, j, count);
        }
    }

    private void incrementAttackCount(int attackDimension, int[][][] attackMatrix, int i, int j) {
        if (i < 0 || j < 0) {
            return;
        }
        if (i >= attackMatrix.length || j >= attackMatrix[0].length) {
            return;
        }
        attackMatrix[i][j][attackDimension] += 1;
    }

    private void setAttackCount(int attackDimension, int[][][] attackMatrix, int i, int j, int count) {
        if (i < 0 || j < 0) {
            return;
        }
        if (i >= attackMatrix.length || j >= attackMatrix[0].length) {
            return;
        }

        if (count > attackMatrix[i][j][attackDimension]) {
            attackMatrix[i][j][attackDimension] = count;
        }
    }

    private int getAttackCount(int attackDimension, List<List<Integer>> board, int[][][] attackMatrix, int i, int j) {
        if (i < 0 || j < 0) {
            return 0;
        }
        if (i >= attackMatrix.length || j >= attackMatrix[0].length) {
            return 0;
        }
        if (board.get(i).get(j) == 1) {
            return 0;
        }
        return attackMatrix[i][j][attackDimension];
    }


}
