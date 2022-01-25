package edu.leetcode.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BombEnemy {
    public int maxKilledEnemies(char[][] grid) {
        if (grid.length==0)
            return 0;
        int[][] bombedEnemies = new int[grid.length][grid[0].length];
        int bombedCount;
        int max = 0;

        for (int i = 0; i < grid.length; i++) {
            bombedCount = 0;
            List<Integer> zeroCells = new ArrayList<>();
            for (int j = 0; j < grid[0].length; j++) {
                switch (grid[i][j]) {
                    case 'E':
                        bombedCount++;

                        break;
                    case '0':
                        zeroCells.add(j);
                        break;
                    case 'W':
                        for (int cell : zeroCells) {
                            bombedEnemies[i][cell] = bombedCount;
                            max = Math.max(bombedEnemies[i][cell], max);
                        }
                        bombedCount = 0;
                        zeroCells.clear();
                }
            }
            if (bombedCount != 0) {
                for (int cell : zeroCells) {
                    bombedEnemies[i][cell] = bombedCount;
                    max = Math.max(bombedEnemies[i][cell], max);
                }
            }
        }
        // print(bombedEnemies);

        for (int i = 0; i < grid[0].length; i++) {
            bombedCount = 0;
            List<Integer> zeroCells = new ArrayList<>();
            for (int j = 0; j < grid.length; j++) {
                switch (grid[j][i]) {
                    case 'E':
                        bombedCount++;
                        break;
                    case '0':
                        zeroCells.add(j);

                        break;
                    case 'W':
                        for (int cell : zeroCells) {
                            bombedEnemies[cell][i] += bombedCount;
                            max = Math.max(bombedEnemies[cell][i], max);
                        }
                        bombedCount = 0;
                        zeroCells.clear();
                }

            }
            if (bombedCount != 0) {
                for (int cell : zeroCells) {
                    bombedEnemies[cell][i] += bombedCount;
                    max = Math.max(bombedEnemies[cell][i], max);
                }
            }
        }
        return max;
    }

    void print(int[][] a) {
        for (int[] arr : a)
            System.out.println(Arrays.toString(arr));
    }
}
