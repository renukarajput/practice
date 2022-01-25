package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.Arrays;

public class DigitSum {
    int getNumberOfWays(int digitNum, int sum) {
        int[] count = {0};
        int[] number = new int[digitNum];
        getNumberOfWays(digitNum, sum, count, number);
        return count[0];
    }

    boolean getNumberOfWays(int digitNum, int sum, int[] count, int[] number) {
        if (9 * digitNum < sum) {
            return false;
        }
        if (digitNum == 0 && sum == 0) {
            count[0]++;
            System.out.print(Arrays.toString(number));
            int s = Arrays.stream(number).sum();
            System.out.println("  sum= " + s);
            return true;
        }
        if (digitNum <= 0 || sum <= 0) {
            return false;
        }
        int countways = 0;
        for (int i = 0; i < 10; i++) {
            if (digitNum == 1 && i == 0) {
                continue;
            }
            number[digitNum - 1] = i;
            if (getNumberOfWays(digitNum - 1, sum - i, count, number)) {
                countways++;
            }
        }
        return countways != 0;
    }
}
