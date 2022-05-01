package edu.ren.geeks.dp;

public class KnapSackDP {
    int getMaxValue(int[] weights, int[] values, int capacity) {
        int[][] result = new int[capacity + 1][values.length + 1];
        for (int i = 0; i <= values.length; i++) {
            result[0][i] = 0;
            result[i][0]=0;
        }


        for (int i = 1; i <= capacity; i++) {
            for (int j = 1; j <= values.length; j++) {
                final int bySelecting = i - weights[j-1] >= 0 ? result[i - weights[j-1]][j-1] + values[j-1] : 0;
                final int byNotSelecting = result[i][j - 1];
                result[i][j] = Math.max(bySelecting, byNotSelecting);
            }
        }
        return result[capacity][values.length];
    }
}
