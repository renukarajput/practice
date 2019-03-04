package edu.ren.geeks.array;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("Duplicates")
public class MinimumTimeToRotOranges {
    final int FRESH = 1;
    final int ROTTEN = 2;
    final int EMPTY = 0;

    int getTime(int[][] grid) {
        Set<String> currentlyProcessed = new HashSet<>();
        int days = 0;
        boolean hasFresh;
        while (true) {
            boolean canRot = false;
            hasFresh=false;
            days++;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == ROTTEN && !currentlyProcessed.contains(getKey(i, j))) {
                        canRot = rotAdjacent(grid, i, j,currentlyProcessed);
                    }
                    hasFresh|=grid[i][j]==FRESH;
                }
            }
            if (!canRot) {
                break;
            }
            currentlyProcessed.clear();
        }
        if(hasFresh){
            return -1;
        }
        return days;

    }

    private boolean rotAdjacent(int[][] grid, int i, int j,Set<String> currentlyProcessed) {
        boolean hasRotten = false;
        hasRotten |= rotCell(grid, i - 1, j,currentlyProcessed);
        hasRotten |= rotCell(grid, i + 1, j,currentlyProcessed);
        hasRotten |= rotCell(grid, i, j - 1,currentlyProcessed);
        hasRotten |= rotCell(grid, i, j + 1,currentlyProcessed);
        return hasRotten;
    }

    private boolean rotCell(int[][] grid, int i, int j,Set<String> currentlyProcessed) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return false;
        }
        if(grid[i][j]!=FRESH){
            return false;
        }
        currentlyProcessed.add(getKey(i, j));

            grid[i][j] = ROTTEN;
    return true;
    }

    private String getKey(int i, int j) {
        return String.valueOf(i).concat("|").concat(String.valueOf(j));
    }
}
