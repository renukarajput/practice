package edu.ren.geeks.string;

import java.util.Arrays;

public class MinimumSwaps {
//shift smallest no to right and largest no to left of array
    public int getMinimumAdjacentSwaps(int[] input) {

        int length = input.length - 1;
        int swapCount = 0;
        for (int i = 0; i < length; i++) {
            if (input[i] < input[i + 1]) {
                swapVariables(input, i, i + 1);
                swapCount++;
            }
            System.out.println("i = " + i + " *** " + Arrays.toString(input));
        }
        return swapCount;
    }

    private void swapVariables(int[] input, int firstVal, int secondVal) {
        int temp = input[firstVal];
        input[firstVal] = input[secondVal];
        input[secondVal] = temp;
    }
}
