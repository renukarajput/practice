package edu.ren.geeks.array;

/**
 * Created by rrn3194 on 11/4/18.
 */
public class CountOnes {

    public static int countNoOfOne(int[] input, int start, int end) {
        int mid = (start + end) / 2;

        if (end >= start) {
            if ((input[mid + 1] == 0) && (input[mid] == 1))
                return mid + 1;

            if (input[mid] == 1) {
                return countNoOfOne(input, mid + 1, end);
            }
            return countNoOfOne(input, start, mid - 1);
        }
        return 0;
    }
}
