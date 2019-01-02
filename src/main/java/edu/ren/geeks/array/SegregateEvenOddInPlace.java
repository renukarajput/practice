package edu.ren.geeks.array;

// https://www.geeksforgeeks.org/segregate-even-odd-numbers-set-3/
public class SegregateEvenOddInPlace {

    public int[] segregateEvenOdds(int[] input) {
        int writeIndex = 0;

        for (int readIndex = 0; readIndex < input.length; readIndex++) {
            if (input[readIndex] % 2 == 0) {
                int temp = input[writeIndex];
                input[writeIndex] = input[readIndex];
                input[readIndex] = temp;
                writeIndex++;
            }
        }
        return input;
    }
}
