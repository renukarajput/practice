package edu.ren.datastructure.interviewBit.array;

import java.util.Arrays;
import java.util.Iterator;

public class RotateArray {

    public static void main(String[] args) {
        int a[][]={{1,2,3,4},
                   {5,6,7,8},
                  {9,10,11,12},
                  {13,14,15,16}};
        flipRows(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(Arrays.toString(a[i]));
        }

    }

    void rotate(int [][]arr){

    }
    void rotate(int[][]arr ,int startRow,int startColumn,int endRow,int endColumn,int incrementSize){
        int prevTemp=arr[startRow][startColumn];
        arr[startRow][startColumn]=arr[endRow][startColumn];
        int temp=arr[startRow][endColumn];
        arr[startRow][endColumn]=prevTemp;
        arr[endRow][startColumn]=temp;

    }
  static void flipRows(int[][] arr){
       for (int i = 0,j=arr.length-1; i <j ; i++,j--) {
           int[] temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
       }
    }
}
