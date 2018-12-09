package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class MinJumpStepsToEndWithBlockage {
    int min(int[] arr) {
        return min(arr, 0, 0);
    }

    private int min(int[] arr, int index, int numSteps) {
        if (index == arr.length - 1 && arr[index] != 1) {
            return numSteps;
        }
        if (index < arr.length && arr[index] == 1 || index > arr.length) {
            return -1;
        }

        int minStepsWithOneJump = min(arr, index + 1, numSteps + 1);

        int minStepsWithTwoJump = min(arr, index + 2, numSteps + 1);
        if (minStepsWithOneJump >= 0 && minStepsWithTwoJump >= 0) {
            return Math.min(minStepsWithOneJump, minStepsWithTwoJump);
        }
        return Math.max(minStepsWithOneJump, minStepsWithTwoJump);
    }
}
