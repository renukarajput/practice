package edu.ren.datastructure.interviewBit.array;

/**
 * Created by rrn3194 on 9/11/18.
 */
public class BubbleSort implements ArraySorter {

    @Override
    public void sortArray(int[] input) {
        int len = input.length;
        boolean isSwapped = false;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len; j++) {
                if (input[j - 1] > input[j]) {
                    swapValues(input, j - 1, j);
                    isSwapped = true;
                }
            }
            if (isSwapped == false) {
                break;
            }
        }
    }

    private void swapValues(int[] input, int firstVal, int secondVal) {
        int temp = input[firstVal];
        input[firstVal] = input[secondVal];
        input[secondVal] = temp;
    }
}
