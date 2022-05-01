package com.scratch;

import java.util.*;

public class ChessBoard {
    int size;
    boolean[][] visitedCell;
    int[][] validMoves;

    public ChessBoard(int size, int[][] validMoves) {
        this.size = size;
        visitedCell = new boolean[size][size];
        this.validMoves = validMoves;
    }


    static class BoardCell {
        int x;
        int y;

        public BoardCell(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            BoardCell boardCell = (BoardCell) o;
            return x == boardCell.x &&
                    y == boardCell.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String toString() {
            return "{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

    }


    public Optional<Collection<BoardCell>> path(int x, int y) {
        BoardCell initial = new BoardCell(x, y);
        Deque<BoardCell> path = new ArrayDeque<>();
        if (path(initial, path))
            return Optional.of(path);
        return Optional.empty();
    }


    private boolean path(BoardCell initial, Deque<BoardCell> path) {
        path.addLast(initial);
        visitedCell[initial.x][initial.y] = true;
        if (path.size() == size * size) {
            return true;
        }

        int startIndex = Math.abs(new Random().nextInt() % validMoves.length);
        int minIndex = getMoveToMaxVisitedNeighbours(initial, startIndex);
        if (minIndex == -1) {
            return false;
        }
        int[] nextMove = validMoves[minIndex];
        BoardCell nextBoardCell = new BoardCell(initial.x + nextMove[0], initial.y + nextMove[1]);
        if (path(nextBoardCell, path)) {
            return true;
        }
        visitedCell[nextBoardCell.x][nextBoardCell.y] = false;
        path.removeLast();
        return false;
    }

    private int getMoveToMaxVisitedNeighbours(BoardCell initial, int startIndex) {
        int minDegree = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < validMoves.length; i++) {
            int index = (startIndex + i) % validMoves.length;
            int next_x = initial.x + validMoves[index][0];
            int next_y = initial.y + validMoves[index][1];
            if (!isValidPosition(next_x, next_y)) {
                continue;
            }
            int degree = getNumberOfUnvisitedNeighbours(next_x, next_y);
            if (degree < minDegree) {
                minDegree = degree;
                minIndex = index;
            }
        }
        return minIndex;
    }

    private int getNumberOfUnvisitedNeighbours(int x, int y) {
        int count = 0;
        for (int[] move : validMoves) {
            if (isValidPosition(x + move[0], y + move[1])) {
                count++;
            }
        }
        return count;
    }

    private boolean isValidPosition(int x, int y) {
        return (x >= 0 && y >= 0 && x < size && y < size && visitedCell[x][y] == false);
    }

}
