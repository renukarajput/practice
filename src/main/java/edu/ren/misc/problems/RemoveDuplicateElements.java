package edu.ren.misc.problems;

import java.util.Arrays;

//112
//122
//1111223
//1211223
//1231223
public class RemoveDuplicateElements {

    public int remove(int[] arr) {
        int writePosition = 0;
        for (int readPosition = 0; readPosition < arr.length; readPosition++) {
            if (arr[readPosition] != arr[writePosition]) {
                arr[writePosition + 1] = arr[readPosition];
                writePosition++;
            }
        }
        return writePosition + 1;
    }
}
