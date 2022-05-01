package edu.ren.datastructure.interviewBit.array;

import java.util.Arrays;

/**
 * Created by rrn3194 on 8/31/18.
 */
public class InsertionSort implements ArraySorter {

    public void sortArrayNaive(int[] input) {
        int len = input.length;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len; j++) {
                if (input[j - 1] > input[j]) {
                    swapValues(input, j - 1, j);
                    System.out.println("i= " + i + "j= " + j + " === " + Arrays.toString(input));
                }
            }
        }
    }

    private void swapValues(int[] input, int firstPosition, int secondPosition) {
        int temp = input[firstPosition];
        input[firstPosition] = input[secondPosition];
        input[secondPosition] = temp;
    }

    //5, 2, 4, 6, 7
    @Override
    public void sortArray(int[] input) {
        int len = input.length, j, x;
        for (int i = 1; i < len; i++) {
            x = input[i];
            j = i - 1;
            while (j >= 0 && input[j] > x) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = x;
        }
    }
}
