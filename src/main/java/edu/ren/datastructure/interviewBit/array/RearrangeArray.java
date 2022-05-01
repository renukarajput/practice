package edu.ren.datastructure.interviewBit.array;

import java.util.Arrays;

public class RearrangeArray {

    public int[] rearrangeArray(int[] input) {
        int count = 0;
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 0) {
                count++;
            }
        }
        for (int i = 0; i < input.length; i++) {
            if (input[i] != 0) {
                output[count] = input[i];
                count++;
            }
        }
        return output;
    }

    public void pushZerosToStart(int[] arr) {
        int lastIndex = arr.length - 1;
        int writeIndex = lastIndex;

        for (int currIndex = lastIndex; currIndex >= 0; currIndex--) {
            if (arr[currIndex] != 0) {
                if (currIndex != writeIndex)
                    arr[writeIndex] = arr[currIndex];
                writeIndex--;
            }
        }
        while (writeIndex >= 0) {
            arr[writeIndex] = 0;
            writeIndex--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public void pushZerosToEnd(int arr[], int n) {

        int writeIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[writeIndex] = arr[i];
                writeIndex++;
            }
        }
        while (writeIndex < n) {
            arr[writeIndex] = 0;
            writeIndex++;
        }
    }
}
