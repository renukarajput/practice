package edu.ren.datastructure.interviewBit.backtracking;

import java.io.*;
import java.util.*;

public class NQueen {



    ArrayList<ArrayList<String>> placeNQueen(int n) {
        boolean[][] board = new boolean[n][n];
        Set<ArrayList<String>> result = new HashSet<>();
        placeNQueen(n, board, result);
        final ArrayList<ArrayList<String>> solutions = new ArrayList<>(result);
        return solutions;
    }

    private void placeNQueen(int n, boolean[][] board, Set<ArrayList<String>> result) {
        if (n == 0) {
            ArrayList<String> current = getBoardAsString(board);
            if (!result.contains(current))
                result.add(current);
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (isSafe(board, i, j)) {
                    board[i][j] = true;
                    placeNQueen(n - 1, board, result);
                    board[i][j] = false;
                }

            }

        }
    }

    private ArrayList<String> getBoardAsString(boolean[][] board) {
        ArrayList<String> boardRepresentation = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();

            for (int j = 0; j < board.length; j++) {

                if (board[i][j]) {
                    stringBuilder.append("Q");
                } else {
                    stringBuilder.append(".");
                }
            }
            boardRepresentation.add(stringBuilder.toString());
        }
        return boardRepresentation;
    }

    private boolean isSafe(boolean[][] board, int i, int j) {
        //check row and col
        final int size = board.length;
        if (!isRowColSafe(board, i, j, size)) {
            return false;
        }
        if (!isLeftTopToRightBottomDiagonalSafe(board, i, j, size)) {
            return false;
        }
        if (!isLeftBottomToRightTopDiagonalSafe(board, i, j, size)) {
            return false;
        }

        return true;
    }

    private boolean isLeftTopToRightBottomDiagonalSafe(boolean[][] board, int i, int j, int size) {
        int temp_i = i, temp_j = j;
        while (temp_i < size && temp_j < size) {
            if (board[temp_i][temp_j]) {
                return false;
            }
            temp_i++;
            temp_j++;
        }
        temp_i = i - 1;
        temp_j = j - 1;
        while (temp_i >= 0 && temp_j >= 0) {
            if (board[temp_i][temp_j]) {
                return false;
            }
            temp_i--;
            temp_j--;
        }

        return true;
    }

    private boolean isLeftBottomToRightTopDiagonalSafe(boolean[][] board, int i, int j, int size) {
        int temp_i = i, temp_j = j;
        while (temp_i < size && temp_j >= 0) {
            if (board[temp_i][temp_j]) {
                return false;
            }
            temp_i++;
            temp_j--;
        }

        temp_i = i - 1;
        temp_j = j + 1;
        while (temp_i >= 0 && temp_j < size) {
            if (board[temp_i][temp_j]) {
                return false;
            }
            temp_i--;
            temp_j++;
        }

        return true;
    }

    private boolean isRowColSafe(boolean[][] board, int i, int j, int size) {
        for (int k = 0; k < size; k++) {
            if (board[k][j] || board[i][k]) {
                return false;
            }
        }
        return true;
    }
}
