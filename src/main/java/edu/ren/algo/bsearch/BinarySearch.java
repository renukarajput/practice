package edu.ren.algo.bsearch;

/**
 * Created by rrn3194 on 5/4/18.
 */
public class BinarySearch {

    public static int indexOfInsertInArray(int[] input, int noToSearch) {
        int start = 0, mid = 0;
        int end = input.length - 1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (input[mid] == noToSearch)
                return mid;
            if (noToSearch > input[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return noToSearch > input[mid] ? mid + 1 : mid;
    }
}
