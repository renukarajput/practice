package com.leetcode;

import java.util.Arrays;

public class MergeSortedArrays {

    // 123 , 256
    public void mergeArr(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--];
            } else {
                arr1[k--] = arr2[j--];
            }
        }
        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }

    }

    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int[] result = new int[m + n];
        int[] pending = null;
        int i = 0, j = 0, k = 0, idx = -1;
        while (i < arr1.length - arr2.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
                pending = arr2;
                idx = j;
            } else {
                result[k++] = arr2[j++];
                pending = arr1;
                idx = i;
            }
        }

        int length = pending.length;
        if (pending == arr1) {
            length = pending.length - arr2.length;
        }
        while (pending != null) {
            if (!(idx < length)) break;
            result[k++] = pending[idx++];
        }

        System.arraycopy(result, 0, arr1, 0, arr1.length);
        System.out.println(Arrays.toString(result));
    }
}
