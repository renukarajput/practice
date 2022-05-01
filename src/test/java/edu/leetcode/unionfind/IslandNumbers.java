package edu.leetcode.unionfind;

import java.util.Arrays;
//https://leetcode.com/problems/number-of-islands/ using DFS
public class IslandNumbers {

    public int numIslands(char[][] positions) {
        int[][] islandIndex = new int[positions.length][positions[0].length];
        for (int[] indexRow : islandIndex) {
            Arrays.fill(indexRow, -1);
        }
        return numIslands(positions, islandIndex);

    }

    int numIslands(char[][] positions, int[][] islandIndex) {
        int index = 0;
        for (int i = 0; i < positions.length; i++) {
            for (int j = 0; j < positions[0].length; j++) {
                if (positions[i][j] == '0' || islandIndex[i][j] != -1) {
                    continue;
                }
                index++;
                markWithNeighbourIndex(positions, islandIndex, i, j, index);

            }
        }
        return index;
    }

    void markWithNeighbourIndex(char[][] positions, int[][] islandIndex, int i, int j, int index) {
        islandIndex[i][j] = index;
        int[] headCell = new int[]{i, j};
        int[][] neighbourDirections = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
        for (int[] direction : neighbourDirections) {
            int x = headCell[0] + direction[0];
            int y = headCell[1] + direction[1];
            if (isValid(x, y, islandIndex.length, islandIndex[0].length) && positions[x][y] == '1' && islandIndex[x][y] == -1) {
                islandIndex[x][y] = index;
                markWithNeighbourIndex(positions, islandIndex, x, y, index);
            }
        }
    }

    protected boolean isValid(int x, int y, int matrixRowSize, int matrixColSize) {
        if (x < 0 || y < 0 || x >= matrixRowSize || y >= matrixColSize) {
            return false;
        }
        return true;
    }
}
