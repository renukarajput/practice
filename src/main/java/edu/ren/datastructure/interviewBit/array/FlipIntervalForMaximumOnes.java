package edu.ren.datastructure.interviewBit.array;

public class FlipIntervalForMaximumOnes extends Flip {
    private static final char ZERO = '0';

    @Override
    int[] flip(char[] arr) {
        int startIndex = -1, endIndex = -1;
        int countOfZero = 0, countOfOne = 0;
        int[] countOfOneArr = new int[arr.length];
        int[] countOfZeroArr = new int[arr.length];

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == ZERO) {
                countOfZero++;
            } else {
                countOfOne++;
            }
            countOfZeroArr[index] = countOfZero;
            countOfOneArr[index] = countOfOne;
        }


        int maxNumOnesInIntervalByFlip = -1;
        // ---i-j--
        for (int i = 0; i < arr.length; i++) {
            int countOfZeroInLeft, countOfOneInLeft;
            if (i == 0) {
                countOfZeroInLeft = 0;
                countOfOneInLeft = 0;
            } else {
                countOfZeroInLeft = countOfZeroArr[i - 1];
                countOfOneInLeft = countOfOneArr[i - 1];
            }

            for (int j = i; j < arr.length; j++) {
                int numOnesInInterval;
                int numZeroesInInterval;

                numZeroesInInterval = countOfZeroArr[j] - countOfZeroInLeft;
                numOnesInInterval = countOfOneArr[j] - countOfOneInLeft;

                int numOfOnesAddedByFlip = numZeroesInInterval - numOnesInInterval;
                if (maxNumOnesInIntervalByFlip < numOfOnesAddedByFlip) {
                    maxNumOnesInIntervalByFlip = numOfOnesAddedByFlip;
                    startIndex = i;
                    endIndex = j;
                }
            }
        }
        return new int[]{startIndex, endIndex};

    }
}
