package edu.ren.hackerrank.medium;

public class MinimumSwapsToSortBoundedArray {
    //1-n elements in unsorted array
    int getSwaps(int[] arr){
        int numSwap=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                 if(arr[j]<arr[i] && arr[j]!=j+1){
                     int temp=arr[j];
                     arr[j]=arr[i];
                     arr[i]=temp;
                     numSwap++;
                 }
            }
        }
        return numSwap;
    }
}
