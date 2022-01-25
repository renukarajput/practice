package edu.ren.hackerrank.dp;

import java.util.Arrays;

public class CandiesDP2 extends CandiesDP{
    @Override
    int getMin(int[] arr) {
        int [] result=new int[arr.length];
        Arrays.fill(result,1);
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]>arr[i+1]){
                result[i]=result[i+1]+1;
            }
        }

        for (int i = arr.length-1; i >0 ; i--) {
            if(arr[i]>arr[i-1]){
                result[i]=result[i-1]+1;
            }
        }
        return sum(result);
    }
}
