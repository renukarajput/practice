package edu.ren.geeks.backtracking;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.Optional;

public class ChessBoard {
    int size;
    boolean[][] visitedCell;
    int[][] moves;

    public ChessBoard(int size, int[][] moves) {
        this.size = size;
        visitedCell = new boolean[size][size];
        this.moves = moves;
    }

    private boolean isValidPosition(int i, int y) {
        return (i >= 0 && y >= 0 && i < size && y < size && visitedCell[i][y] == false);
    }
    public int[][] path(int x, int y) {
        int[][] path=new int[size][size];
        visitedCell[x][y]=true;
        path[x][y]=0;
        if (path(x,y, path,1))
            return path;
        return null;
    }

   private boolean path(int initial_x,int initial_y, int[][] path,int visitedCount) {
       if (visitedCount == size * size) {
           return true;
       }


       for (int[] move : moves) {
           int next_x = initial_x + move[0];
           int next_y = initial_y + move[1];
           if(!isValidPosition(next_x, next_y)){
                continue;
            }
           path[next_x][next_y]=visitedCount;
           visitedCell[next_x][next_y] = true;

           if (path(next_x, next_y, path,visitedCount+1)) {
                return true;
            }
            visitedCell[next_x][next_y] = false;
        }
        return false;
    }
}
