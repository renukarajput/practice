package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class MinJumpStepsToEndWithBlockageDP extends MinJumpStepsToEndWithBlockage {
    @Override
    int min(int[] arr) {
        return minSteps(arr);
    }

    private int minSteps(int[] arr) {
        int[] minStepCache = new int[arr.length];
        minStepCache[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            int byOneJump = -1, byTwoJump = -1;

            if (arr[i] == 1) {
                minStepCache[i] = -1;
                continue;
            }
            if (minStepCache[i - 1] != -1)
                byOneJump = minStepCache[i - 1] + 1;

            if (i > 1 && minStepCache[i - 2] != -1) {
                byTwoJump = minStepCache[i - 2] + 1;
            }


            if (byOneJump >=0  && byTwoJump >= 0) {
                minStepCache[i] = Math.min(byOneJump, byTwoJump);
            }else {
                minStepCache[i] = Math.max(byOneJump, byTwoJump); //ignore negative one
            }

        }

        return minStepCache[arr.length - 1];
    }
}
