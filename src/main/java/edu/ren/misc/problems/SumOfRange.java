package edu.ren.misc.problems;

import java.util.Arrays;

public class SumOfRange {
    // 1, 2, 4, 3, 5, 7, 6
// 1 2 4 3
    public int[][] getSumForGivenRange(int[] input) {
        int[][] matrix = new int[input.length][input.length];
        for (int[] row : matrix)
            Arrays.fill(row, -1);
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum = 0;
            for (int j = i; j < input.length; j++) {
                sum += input[j];
                System.out.println("sum = " + sum);
                matrix[i][j] = sum;
            }
        }
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        return matrix;
    }

    public int sumOfGivenRange(int[] arr, int start, int end) {
        int len = arr.length;
        int[] sum = new int[len];
        for (int i = 1; i < len; i++) {
            sum[i] = sum[i - 1] + arr[i];
        }

        return start == 0 ? sum[end] : sum[end] - sum[start - 1];
    }
}
