package edu.ren.algo.bsearch;

/**
 * Created by rrn3194 on 5/4/18.
 */
public class BinarySearch {
    public static int smallestIndexOfInsertInArray(int[] input, int noToSearch) {
        return smallestIndexOfInsertInArray(input,0,input.length-1, true, noToSearch);
    }

    public static int smallestIndexOfInsertInArray(int[] input, int start,int end,boolean lookForSmallestPosition, int noToSearch) {

        int low = start, high = end;
        while (true) {
            int mid = low + (high - low) / 2;
            if (input[mid] == noToSearch) {
                if (lookForSmallestPosition) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (noToSearch < input[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            if(low>high){
                break;
            }
        }

        return low;
    }

    public static int smallestIndexOfInsertInUniquqArray(int[] input, int noToSearch) {
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
