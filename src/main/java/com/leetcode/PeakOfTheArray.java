package com.leetcode;

// https://leetcode.com/problems/find-peak-element/
public class PeakOfTheArray {
    public int findPeakElement(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {  //&& arr[i] > arr[i - 1] automatically true
                return i;
            }
        }
        return arr.length - 1;
    }

    public int findPeakElementBinarySearch(int[] arr) {
        return helper(arr, 0, arr.length - 1);
    }

    // 1 2 1 3 5 0
    private int helper(int[] arr, int start, int end) {
        if (start >= end) {
            return start;
        }
        int mid = (start + end) / 2;
        if (arr[mid] > arr[mid + 1]) {
            return helper(arr, start, mid);
        }
        return helper(arr, mid + 1, end);
    }

    public int peakIndexInMountainArray(int[] arr) {
        for(int i=1; i< arr.length; i++){
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]) {
                return i;
            }
        }
        return arr.length-1;
    }

    public int peakIndexInMountainArrayBinarySearch(int[] arr) {
        int start=0, end=arr.length-1;
        int mid;
        while (start < end){
            mid = (start+end)/2;
//            if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]) {
//                return mid;
//            }
            if (arr[mid] < arr[mid+1]){
                start=mid+1;
            } else {
                end=mid;
            }
        }
        return start;
    }
}
