package edu.leetcode.practice2021;

public class MonotonicArray {

    public boolean isMonotonic(int[] arr) {
        return increasing(arr) || decreasing(arr);
    }

    public boolean increasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { //1 2 2 4
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    public boolean decreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // 6 5 4 4
            if (arr[i] < arr[i+1]) {
                return false;
            }
        }
        return true;
    }

}
