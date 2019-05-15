package edu.ren.tictactoe;

public class Board {
    final private int len = 3;
    char[][] board;

    public Board() {
        board= new char[len-1][len-1];
    }
}
