package edu.ren.geeks.array;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

@SuppressWarnings("Duplicates")
public class MinimumTimeToRotOrangesBFS extends MinimumTimeToRotOranges{

    @Override
    int getTime(int[][] grid) {
        Queue<int[]> rottenCells=new LinkedList<>();
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                if(grid[i][j]==ROTTEN){
                    rottenCells.add(new int[]{i,j});
                }
            }
        }

        final int[] marker=null;
        rottenCells.add(marker);
        int days=0;
        boolean canRot=false;
        while (!rottenCells.isEmpty()){
            final int[] rottenCell = rottenCells.remove();
            if(rottenCell==marker){
                if(!canRot||rottenCells.isEmpty()){
                    break;
                }
                rottenCells.add(marker);
                days++;
                continue;
            }
            canRot |= rotAdjacent(grid, rottenCell[0], rottenCell[1], rottenCells);
        }

        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                if(grid[i][j]==FRESH){
                    return -1;
                }
            }
        }
        return days;
    }

    protected boolean rotAdjacent(int[][] grid, int i, int j, Queue<int[]> queue) {
        boolean hasRotten = false;
        hasRotten |= rotCell(grid, i - 1, j,queue);
        hasRotten |= rotCell(grid, i + 1, j,queue);
        hasRotten |= rotCell(grid, i, j - 1,queue);
        hasRotten |= rotCell(grid, i, j + 1,queue);
        return hasRotten;
    }

    boolean rotCell(int[][] grid, int i, int j,Queue<int[]> queue) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return false;
        }
        if(grid[i][j]!=FRESH){
            return false;
        }
        queue.add(new int[]{i, j});

        grid[i][j] = ROTTEN;
        return true;
    }
}
