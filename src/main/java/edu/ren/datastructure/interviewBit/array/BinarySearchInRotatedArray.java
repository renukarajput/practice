package edu.ren.datastructure.interviewBit.array;

import java.util.Arrays;
import java.util.List;

public class BinarySearchInRotatedArray {
    int findInSortedAndRotated(Integer[] arr, int key) {
        return findInSortedAndRotated(Arrays.asList(arr), key);
    }

    int findInSortedAndRotated(List<Integer> arr, int key) {
        int peakIndex = indexOfPeak(arr, 0, arr.size() - 1);
        if (peakIndex == arr.size() - 1) {
            return binarySearch(key, arr, 0, peakIndex);
        }
        if (key > arr.get(arr.size() - 1)) {
            return binarySearch(key, arr, 0, peakIndex);
        }
        return binarySearch(key, arr, peakIndex + 1, arr.size() - 1);
    }

    private int binarySearch(int key, List<Integer> arr, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr.get(mid) == key) {
            return mid;
        }
        if (arr.get(mid) < key) {
            return binarySearch(key, arr, mid + 1, end);
        }
        return binarySearch(key, arr, start, mid - 1);

    }

    int indexOfPeak(List<Integer> arr, int start, int end) {
        if (start == 0 && end == arr.size() - 1 && arr.get(start) < arr.get(end)) {
            return end;
        }
        int mid = start + (end - start) / 2;
        int high = arr.get(arr.size() - 1);
        int low = arr.get(0);
        if (mid == arr.size() - 1) {
            return mid;
        }
        if (arr.get(mid) > arr.get(mid + 1)) {
            return mid;
        }
        if (arr.get(mid) > high) {
            return indexOfPeak(arr, mid + 1, end);
        }
        if (low > arr.get(mid)) {
            return indexOfPeak(arr, start, mid - 1);
        }
        return -1;
    }
}
