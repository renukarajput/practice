package edu.ren.geeks.array;

public class LongestSubArrayWithEvenElements {
    int len(int[] arr) {
        int i = 0, j = 0;
        int maxLength = 0;
        while (j < arr.length) {
            if (j == arr.length - 1 || arr[j] % 2 != 0) {
                final int len = arr[j] % 2 == 0 ? j - i + 1 : j - i;
                maxLength = Math.max(maxLength, len);
                i = j + 1;
            }
            j++;
        }
        return maxLength;
    }
}
