package edu.ren.tictactoe;

public class NoPlace {
    char[][] board = Board.board;

    boolean OutOfBoard(int rowLength, int colLength) {
        if (rowLength > 3 || colLength > 3) {
            System.out.println("There is no row or column");
            return true;
        }
        return false;
    }
}
