package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.Arrays;
import java.util.List;

public class LongestIncreasingDecSequence {

    int lbs(List<Integer> arr) {
        int n = arr.size();
        int i, j;

        int[] lis = new int[n];
        for (i = 0; i < n; i++)
            lis[i] = 1;

        /* Compute LIS values from left to right */
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr.get(i) > arr.get(j) && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;

        /* Allocate memory for lds and initialize LDS values for
            all indexes */
        int[] lds = new int[n];
        for (i = 0; i < n; i++)
            lds[i] = 1;

        /* Compute LDS values from right to left */
        for (i = n - 2; i >= 0; i--)
            for (j = n - 1; j > i; j--)
                if (arr.get(i) > arr.get(j) && lds[i] < lds[j] + 1)
                    lds[i] = lds[j] + 1;


        /* Return the maximum value of lis[i] + lds[i] - 1*/
        int max = lis[0] + lds[0] - 1;
        for (i = 1; i < n; i++)
            if (lis[i] + lds[i] - 1 > max)
                max = lis[i] + lds[i] - 1;

        return max;
    }
//1 1 1 2 2 3 4 5 6 5 6 5
//3 2 1 2 1 1 1 3 3 2 2 1
    int getMaxIncreasingDecreasingSeqLength(Integer[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        return getMaxIncreasingDecreasingSeqLength(Arrays.asList(arr));
    }

    int getMaxIncreasingDecreasingSeqLength(List<Integer> arr) {
        int[] lisFromStart = getLisFromStart(arr);
        int[] lisFromEnd = getLisFromEnd(arr);
        int max = lisFromStart[0] + lisFromEnd[0] - 1, temp;
        for (int i = 0; i < arr.size(); i++) {
            temp = lisFromStart[i] + lisFromEnd[i] - 1;
            max = Math.max(max, temp);

        }
        return max;
    }

    int[] getLisFromStart(List<Integer> arr) {
        int[] lis = new int[arr.size()];
        lis[0] = 1;

        for (int i = 1; i < arr.size(); i++) {
            int max = 1, tempLis;
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    tempLis = 1 + lis[j];
                    max = Math.max(max, tempLis);
                }
            }
            lis[i] = max;
        }
        return lis;
    }

    int[] getLisFromEnd(List<Integer> arr) {
        int[] lis = new int[arr.size()];
        lis[arr.size() - 1] = 1;

        for (int i = arr.size() - 2; i >= 0; i--) {
            int max = 1, tempLis;
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    tempLis = 1 + lis[j];
                    max = Math.max(max, tempLis);
                }
            }
            lis[i] = max;
        }
        return lis;
    }
}
