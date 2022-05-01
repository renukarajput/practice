package edu.ren.datastructure.interviewBit.array;

import java.util.ArrayList;

public class FlipBlockOfZeroToMaximizeOne extends Flip {


    @Override
    int[] flip(char[] arr) {
        int startOfZero = -1, startOfZeroInMax = -1;
        int countOfZero = 0, maxCountOfZero = 0;

        if (arr[0] == ZERO) {
            startOfZero = 0;
            countOfZero = 1;
            startOfZeroInMax = 0;
        }
        int endIndex = 1;

        while (endIndex < arr.length) {
            if (arr[endIndex] == ZERO) {
                if (endIndex > 0 && arr[endIndex - 1] != ZERO) {
                    countOfZero = 0;
                    startOfZero = endIndex;
                }
                countOfZero++;
            }
            if (arr[endIndex] != ZERO || endIndex == arr.length) {
                if (countOfZero > maxCountOfZero) {
                    maxCountOfZero = countOfZero;
                    countOfZero = 0;
                    startOfZeroInMax = startOfZero;
                }
            }
            endIndex++;
        }
        return new int[]{startOfZeroInMax, startOfZeroInMax + maxCountOfZero - 1};
    }
}
