package edu.ren.datastructure.interviewBit.binarysearch;

import java.util.List;

public class SearchForRange {
    int[] rangeOf(List<Integer> arr, int key) {
        int index = binarySearch(arr, key, 0, arr.size() - 1);
        int leftIndex = index;
        while (leftIndex > 0 && arr.get(leftIndex - 1) == key) {
            int leftResult = binarySearch(arr, key, 0, leftIndex - 1);
            if(leftIndex!=-1) {
                leftIndex = leftResult;
            }else {
                break;
            }
        }
        int rightIndex = index;
        while (rightIndex < arr.size() - 1 && arr.get(rightIndex + 1) == key) {
            int rightResult = binarySearch(arr, key, rightIndex+1, arr.size() - 1);
            if(rightResult!=-1){
                rightIndex=rightResult;
            }else {
                break;
            }
        }
        return new int[]{leftIndex, rightIndex};
    }

    int binarySearch(List<Integer> arr, int key, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) == key) {
                return mid;
            }
            if (arr.get(mid) > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
}
