package edu.ren.datastructure.interviewBit.array;

public class PeakOfArray {

    int peak(int[] arr) {
        return peak(arr, 0, arr.length - 1);
    }

    private int peak(int[] arr, int start, int end) {
        int mid = start + (end - start) / 2;
        if (mid==0) {
            if(arr[mid]>arr[mid+1])
            return arr[mid];
            else
                return arr[mid+1];
        }
        if (mid==arr.length-1) {
            if(arr[mid]>arr[mid-1])
            return arr[mid];
            else
                return arr[mid-1];
        }
        if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
            return arr[mid];
        }

        if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
            return peak(arr, mid + 1, end); //certain peak in right
        }
        if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]) {
            return peak(arr, start,mid - 1);
        }
   //mid smaller than both
        return peak(arr, start,mid - 1);

    }
}
