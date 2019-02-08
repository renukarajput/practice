package edu.ren.misc.problems;

public class ArrayUpdate {

    // n*s > old
    // old/s
    // 13 /5 , 26/6
    public int getX(int[] input) {

        int len = input.length;
        int initialSum = 0;
        for (int i = 0; i < len; i++) {
            initialSum += input[i];
        }
        int digit = initialSum / len;
        if (initialSum < (len * (digit+1))){
            return digit+1;
        }
        return 0;
    }
}
