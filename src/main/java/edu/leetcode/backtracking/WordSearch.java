package edu.leetcode.backtracking;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++) {
                visited[i][j] = true;
                if (exist(board, word, 0, i, j, visited)) {
                    return true;
                }
                visited[i][j] = false;
                //System.out.println();
            }
        return false;
    }

    public boolean exist(char[][] board, String word, int matchedCount, int boardX, int boardY, boolean[][] visited) {
        if (matchedCount == word.length())
            return false;


        if (board[boardX][boardY] != word.charAt(matchedCount))
            return false;

        if (matchedCount == word.length()-1)
            return true;

        //System.out.print(board[boardX][boardY]);

        boolean result = false;
        if (isValid(board, boardX + 1, boardY, visited)) {
            visited[boardX + 1][boardY] = true;
            result = exist(board, word, matchedCount + 1, boardX + 1, boardY, visited);
            visited[boardX + 1][boardY] = false;
        }

        if (result) {
            return result;
        }
        if (isValid(board, boardX - 1, boardY, visited)) {
            visited[boardX - 1][boardY] = true;
            result = exist(board, word, matchedCount + 1, boardX - 1, boardY, visited);
            visited[boardX - 1][boardY] = false;
        }
        if (result) {
            return result;
        }

        if (isValid(board, boardX, boardY - 1, visited)) {
            visited[boardX][boardY - 1] = true;
            result = exist(board, word, matchedCount + 1, boardX, boardY - 1, visited);
            visited[boardX][boardY - 1] = false;
        }
        if (result) {
            return result;
        }
        if (isValid(board, boardX, boardY + 1, visited)) {
            visited[boardX][boardY + 1] = true;
            result = exist(board, word, matchedCount + 1, boardX, boardY + 1, visited);
            visited[boardX][boardY + 1] = false;
        }
        if (result) {
            return result;
        }
        return false;
    }

    boolean isValid(char[][] board, int boardX, int boardY, boolean[][] visited) {
        return boardX >= 0 && boardX < board.length && boardY >= 0 && boardY < board[0].length && !visited[boardX][boardY];
    }
}
