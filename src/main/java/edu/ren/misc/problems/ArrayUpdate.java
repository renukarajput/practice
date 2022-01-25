package edu.ren.misc.problems;

import java.util.List;

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
        if (initialSum < (len * (digit + 1))) {
            return digit + 1;
        }
        return 0;
    }

    // 1 2 3 4 5
    public int recursiveSum(List<Integer> list) {
        return recursiveHelper(list, 0, 0);
    }

    private int recursiveHelper(List<Integer> list, int acc, int i) {
        if (i >= list.size())
            return acc;
        int sum = acc + list.get(i);
        return recursiveHelper(list, sum, i + 1);
    }
}
