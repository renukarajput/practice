package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.*;

/**
 * final xyx
 * lock(){
 * sync(xyz)
 *     currentOwner =
 *     else con.await
 *           retry
 * }
 */
public class UniquePathsInGrid {

    int get(Integer[][] grid) {
        List<List<Integer>> gridList = getGridAsLists(grid);
        return get(gridList, grid.length - 1, grid[0].length - 1);
    }

    public static List<List<Integer>> getGridAsLists(Integer[][] grid) {
        List<List<Integer>> gridList = new ArrayList<>();
        for (Integer[] gridRow : grid) {
            gridList.add(Arrays.asList(gridRow));
        }
        return gridList;
    }

    protected int get(List<List<Integer>> grid, int row, int col) {
        Integer[][] cache = new Integer[row + 1][col + 1];
        for (Integer[] cacheRow : cache) {
            Arrays.fill(cacheRow, -1);
        }
        return get(grid, row, col, cache);
    }

    private int get(List<List<Integer>> grid, int row, int col, Integer[][] cache) {
        if (row == 0 && col == 0) {
            return 1;
        }
        if (!(row >= 0 && row < grid.size() && col >= 0 && col < grid.get(0).size())) {
            return 0;
        }
        if (cache[row][col] != -1) {
            return cache[row][col];
        }

        int ways = 0;
        if (row > 0 && grid.get(row - 1).get(col) == 0) {
            ways += get(grid, row - 1, col, cache);
        }

        if (col > 0 && grid.get(row).get(col - 1) == 0) {
            ways += get(grid, row, col - 1, cache);
        }

        cache[row][col] = ways;
        return ways;
    }
}
