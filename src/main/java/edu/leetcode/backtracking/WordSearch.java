package edu.leetcode.backtracking;

public class WordSearch {
    int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

    public boolean exist(char[][] board, String word) {
        boolean[][] visitedIndex = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (find(board, i, j, word, 0, visitedIndex)) {
                    return true;
                }
            }
        }
        return false;
    }

    //backtracking
    boolean find(char[][] board, int i, int j, String word, int wordIndex,
                 boolean[][] visitedIndex) {
        if (wordIndex == word.length()) {
            return true;
        }
        if (i >= board.length || j >= board[0].length
            || i < 0 || j < 0
            || board[i][j] != word.charAt(wordIndex)
            || visitedIndex[i][j]) {
            return false;
        }
        visitedIndex[i][j] = true;
        for (int[] d : directions) {
            if (find(board, i + d[0], j + d[1], word, wordIndex + 1, visitedIndex)) {
                return true;
            }
        }
        visitedIndex[i][j] = false;
        return false;
    }

  /*  boolean isValid(char[][] board, int boardX, int boardY, boolean[][] visited) {
        return boardX >= 0 && boardX < board.length && boardY >= 0 && boardY < board[0].length && !visited[boardX][boardY];
    }*/
}
