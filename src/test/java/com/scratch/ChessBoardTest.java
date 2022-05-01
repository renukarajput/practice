package com.scratch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class ChessBoardTest {
    int[][] moves = {{3, 0}, {-3, 0}, {0, 3}, {0, -3}, {2, 2}, {2, -2}, {-2, -2}, {-2, 2}};

    @Test
    public void path() {
        ChessBoard pawnBoardVisit = new ChessBoard(10, moves);
        Optional<Collection<ChessBoard.BoardCell>> pathResult = pawnBoardVisit.path(2, 3);
        Collection<ChessBoard.BoardCell> path = pathResult.get();
        System.out.println(path);
        verifyPathConstraints(path);
        HashSet<ChessBoard.BoardCell> visitedCells = new HashSet<>(path);
        assertThat(visitedCells.size(), is(100));

    }

    private void verifyPathConstraints(Collection<ChessBoard.BoardCell> path) {
        Iterator<ChessBoard.BoardCell> iterator = path.iterator();
        ChessBoard.BoardCell current = iterator.next();
        while (iterator.hasNext()) {
            ChessBoard.BoardCell next = iterator.next();
            verifyMoveIsValid(current, next);
            current=next;
        }
    }

    private void verifyMoveIsValid(ChessBoard.BoardCell current, ChessBoard.BoardCell next) {
        int[] moveTaken = {next.x - current.x, next.y - current.y};
        for (int[] move : moves) {
            if (move[0] == moveTaken[0] && move[1] == moveTaken[1]) {
                return;
            }
        }
        fail("Invalid move " + Arrays.toString(moveTaken) +"from "+current +"to "+ next);
    }
}