package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class DigitSumDP extends DigitSum {

    @Override
    int getNumberOfWays(int digitNum, int sum) {
        int[][] result = new int[digitNum + 1][sum + 1];
        result[0][0] = 1;
       
        for (int digitPosition = 1; digitPosition <= digitNum; digitPosition++) {
            for (int requiredSum = 0; requiredSum <= sum; requiredSum++) {
                int count = 0;
                for (int digit = 0; digit <= 9; digit++) {
                    if (digitPosition == 1 && digit == 0)
                        continue;
                    if (requiredSum - digit <= sum && requiredSum - digit >= 0) {
                        count += result[digitPosition - 1][requiredSum - digit];
                        count = count % 1000000007;
                    }
                }
                result[digitPosition][requiredSum] = count;

            }
        }
        return result[digitNum][sum];
    }
}
