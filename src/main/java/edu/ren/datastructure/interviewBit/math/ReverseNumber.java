package edu.ren.datastructure.interviewBit.math;

/**
 * Created by rrn3194 on 11/21/18.
 */
public class ReverseNumber {
    public int reverse(int num) {
        int result = reverseUtil(Math.abs(num));
        if (num < 0) {
            return -1 * result;
        }
        return result;
    }

    private int reverseUtil(int num) {
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            num = num / 10;
            if (sum > (Integer.MAX_VALUE - rem) / 10) {
                return 0;
            }
            sum = (sum * 10) + rem;
        }

        return sum;
    }
}
