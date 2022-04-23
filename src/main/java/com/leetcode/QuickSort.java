package com.leetcode;

public class QuickSort {
    public int[] sortArray(int[] arr) {
        if (arr.length == 0) return new int[]{};
        quickSort(arr, 0, arr.length-1);
        return arr;
    }

    private void quickSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int mid = partition(arr, l, r);
        quickSort(arr, l, mid-1);
        quickSort(arr, mid+1, r);

    }
    private int partition(int[] nums, int left, int right) { // 12 9 7 15 10
        int pivot = nums[right];
        int i = left;
        for (int j = i; j < right; j++) {
            if(nums[j] <= pivot){
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, i, right);
        return i;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) { //3 2 1
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] > nums[j]) {
                    int temp= nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
}
