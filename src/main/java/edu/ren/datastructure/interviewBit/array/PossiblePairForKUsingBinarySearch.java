package edu.ren.datastructure.interviewBit.array;

import java.util.Arrays;

public class PossiblePairForKUsingBinarySearch {
    //1 3 5 7 8
    //log 2^3 +log 2^4
    //log 8 +log 16 = log (8*16)
    //1, 2, 1, 1 4, 6, 3, 7, 8 3 6= 9
    //  1 1 1 2 3 3 4 6 6 7 8 9
    //log n-1  log n-2  logn-3  log1=log (n!)
    //log n + log n ...
    public int noOfPairForKSum(int[] input, int sum) {
        double x = 0;
        int count = 0, lastElm = 0;
        int end = input.length - 1;
        Arrays.sort(input);
        for (int start = 0; start < input.length; start++) {
            if (input[start] == lastElm && start!=0)
                continue;
            int diff = sum - input[start];
            int foundIndex = binarySearchInArrayRange(input, diff, start, end);

            if (foundIndex != -1) {
                System.out.println(input[start] + " ---- " + input[foundIndex]);
                count++;
            }
            lastElm = input[start];
        }
        return count;
    }

    private int binarySearchInArrayRange(int[] input, int number, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (number == input[mid]) {
                return mid;
            } else {
                if (number > input[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
