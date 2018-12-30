package edu.ren.hackerrank.dp;

public class Candies {
    int getMin(int[] arr) {
        int[] count = {0};
        for (int i = 0; i <arr.length ; i++) {
            getMin(arr, 0, count);
        }

        return count[0];
    }

    int getMin(int[] arr, int i, int[] count) {

        if (arr.length == 0) {
            return 0;
        }
        int numCandies = 0;
        int leftMax = 1, rightMax = 1;

            if (i > 0 && arr[i] > arr[i - 1]) {
                leftMax = count[0]+1;
            }
            if (i < arr.length - 1 && arr[i] > arr[i + 1]) {
                rightMax =1+ getMin(arr, i + 1, count);
            }

            numCandies = Math.max(leftMax, rightMax);
            count[0] += numCandies;

        return count[0];
    }
}
