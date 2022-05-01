package edu.ren.datastructure.interviewBit.dynamicprogramming;

// fibbonacci series
public class NoOfWaysToReachEnd {

    public int get_(int n) {
        int[] arr = new int[n + 1];
        if (n == 0 || n == 1)
            return 1;
        if (n == 2)
            return 2;
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }
        return arr[n];
    }

    // 5 -> 0 1 1 2 3 5 fibbonacci using loop
    public int get(int n) {
        if (n == 0 || n == 1)
            return 1;
        int first = 0;
        int second = 1;
        int third = 1;
        for (int i = 2; i <= n + 1; i++) {
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }

    public int getRec(int n) {
        if (n == 0 || n == 1)
            return 1;
        if (n == 2)
            return 2;
        return getRec(n - 1) + getRec(n - 2) + getRec(n-3);
    }
}
