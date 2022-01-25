package edu.ren.geeks.array;

public class FirstUniqueElm {
// 1, 1, 2, 4, 4, 5, 5, 6, 6
    int find(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid % 2 == 0) {
                if (arr[mid] == arr[mid + 1]) {
                    start = mid + 2;
                } else {
                    end = mid;
                }
            } else if (mid % 2 == 1) {
                if (arr[mid] == arr[mid - 1]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        if (start == end) {
            return arr[start];
        }
        return -1;
    }
}
