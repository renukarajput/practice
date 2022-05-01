package edu.ren.datastructure.pramp;

public class MessedArraySort {
    // 6, 5, 3, 2, 8, 10, 9 k = 3

    public int[] sortKMessedArray(int[] input, int k) {
        for (int i = 0; i < input.length - 1; i++) {
            int index = i;
            for (int j = i; j <= i + k && j < input.length; j++) {
                if (input[i] > input[j]) {
                    index = j;
                }
            }
            swap(input, i, index);
        }
        return input;
    }

    public int[] sortKMessedArray_(int[] input, int k) {
        for (int i = 0; i < input.length - 1; i++) {
            int minIndex = i, min = Integer.MAX_VALUE;
            for (int j = i; j <= i + k && j < input.length; j++) {
                if (input[j] < min) {
                    min = input[j];
                    minIndex = j;
                }
            }
            swap(input, i, minIndex);
        }
        return input;
    }

    private void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
