package edu.ren.datastructure.interviewBit.array;

/**
 * Created by rrn3194 on 8/31/18.
 */
public class MaxInArray {
    public int findMaximumElement(int[] input) {
        int max = input[0];
        int pos = 0;
        return findMaxUtil(input, max, pos);
    }

    private int findMaxUtil(int[] input, int max, int pos) {
        if (pos >= input.length)
            return max;

        if (max < input[pos]) {
            max = input[pos];
        }
        return findMaxUtil(input, max, pos + 1);
    }

    public void printArrayUsingRecursion(int[] input) {
        int pos = 0;
        printArrayUtil(input, pos);
    }

    private void printArrayUtil(int[] input, int pos) {
        if (pos >= input.length)
            return;
        System.out.print(input[pos] + " ");

        printArrayUtil(input, pos + 1);
    }


    public int sumOfArray(int[] input) {
        int pos = 0, sum = 0;
        return sumOfArrayUtil(input, sum, pos);
    }

    private int sumOfArrayUtil(int[] input, int sum, int pos) {
        if (pos >= input.length)
            return sum;

        return sumOfArrayUtil(input, sum + input[pos], pos + 1);
    }
}
