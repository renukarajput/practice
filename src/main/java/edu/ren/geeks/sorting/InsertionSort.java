package edu.ren.geeks.sorting;

public class InsertionSort {
    // 6, 5, 3, 2, 8, 10, 9
    // 5, 6, 3, 2, 8, 10, 9
    // 5, 3, 6, 2, 8, 10, 9
    // 3, 5, 6, 2, 8, 10, 9 and so on..
    public int[] sortArray(int[] input) {
        int j;
        for (int i = 1; i < input.length; i++) {
            j = i;
            while (j > 0 && input[j - 1] > input[j]) {
                swap(input, j - 1, j);
                j--;
            }
        }
        return input;
    }

    private void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
