package edu.leetcode.backtracking;

public class AndroidUnlockPattern {
    boolean[][] screen = new boolean[3][3];
    int[][] allNextMoves = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {-1, -1}, {1, -1}, {-1, 1}};
    int total = 0;

    public int numberOfPatterns(int m, int n) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                numberOfPatterns(i, j, m, n, 0);
            }
        }
        return total;
    }

    private int numberOfPatterns(int i, int j, int m, int n, int currentSize) {

        if (currentSize >= m && currentSize <= n)
            total++;

        for (int[] nextMove : allNextMoves) {
            int next_x = i + nextMove[0];
            int next_y = j + nextMove[1];
            if (next_x >= 3 || next_y >= 3 || next_x < 0 || next_y < 0) {
                return 0;
            }
            if (screen[next_x][next_y])
                continue;
            screen[next_x][next_y] = true;
            numberOfPatterns(i + 1, j, m, n, currentSize + 1);
            screen[next_x][next_y] = false;
        }
        return total;
    }
}
