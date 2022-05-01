package edu.ren.hackerrank;

public class ElectronicShop {
    // 40 50 60 - 5 8 12 -> 60
    public int getMoneySpent(int[] keyboards, int[] drives, int balance) {
        int maxSum = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                int currentSum = keyboards[i] + drives[j];
                if (currentSum <= balance && currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    // 1 3 5 7 9 100 110 120->2
    int closestElement(int[] arr, int num) {
        int start = 0;
        int end = arr.length-1;
        int prevDiff = Integer.MAX_VALUE;
        int closestIndex = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            int diff = Math.abs(arr[mid] - num);
            if (diff < prevDiff) {
                prevDiff = diff;
                closestIndex = mid;
            }
            if (arr[mid] < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return arr[closestIndex];
    }

    // 40 50 60 - 5 8 12 -> 60
    public int getMoneySpentBinarySearch(int[] keyboards, int[] drives, int balance) {
        int maxSum = -1;
        int start = 0;
        int end = drives.length;
        for (int i = 0; i < keyboards.length; i++) {
            int mid = start + (end - start) / 2;
            int currentSum = keyboards[i] + drives[mid];
            if (currentSum == balance) {
                return currentSum;
            }

        }
        return maxSum;
    }
}