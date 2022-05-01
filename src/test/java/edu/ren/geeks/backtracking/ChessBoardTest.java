package edu.ren.geeks.backtracking;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Deque;
import java.util.Optional;

import static org.junit.Assert.*;

public class ChessBoardTest {
    int[][] moves = {{1, 2}, {1, -2}, {-1, 2}, {-1, -2}, {2, 1}, {2, -1}, {-2, 1}, {-2, -1}};
    //int[][] moves = {, {1, -2}, , , , {2, -1}, , };
    //int[][] moves = {{3, 0}, {-3, 0}, {0, 3}, {0, -3}, {2, 2}, {2, -2}, {-2, -2}, {-2, 2}};
    int xMove[] = {2, 1, -1, -2, -2, -1, 1,  2};
    int yMove[] = {1, 2,  2,  1, -1, -2, -2, -1};

    //@Before
    public void setUp() throws Exception {
        for (int i = 0; i <xMove.length ; i++) {
            moves[i][0]=xMove[i];
            moves[i][1]=yMove[i];
        }
    }

    @Test
    public void knight_tour() {
        ChessBoard chessBoard = new ChessBoard(7, moves);
        int[][] path = chessBoard.path(0, 0);
        if (path != null) {
            for (int[] row : path) {
                System.out.println(Arrays.toString(row));
            }
        }

    }
}