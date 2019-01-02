package edu.ren.algo.greedy;

import java.util.Arrays;

public class MaxTripletProduct {
int maxProduct(int[] arr){
    int[] max=new int[3];
    max[0]=arr[0];
    max[1]=arr[1];
    max[2]=arr[2];
    int product=max[0]*max[1]*max[2];
    int maxProduct=product;
    for (int i = 3; i <arr.length ; i++) {
        int maxIndex=-1;
        if(arr[i]*max[1]*max[2]>maxProduct){
            maxIndex=0;
            maxProduct=arr[i]*max[1]*max[2];
        }
        if(arr[i]*max[0]*max[2]>maxProduct){
            maxIndex=1;
            maxProduct=arr[i]*max[0]*max[2];
        }
        if(arr[i]*max[0]*max[1]>maxProduct){
            maxIndex=2;
            maxProduct=arr[i]*max[0]*max[1];
        }
        if(maxIndex!=-1){
            max[maxIndex]=arr[i];
        }else if(product==maxProduct){
            int minIndex=0,min=Integer.MAX_VALUE;
            for (int j = 0; j <2 ; j++) {
                if(max[j]<min){
                    min=max[j];
                    minIndex=j;
                }
            }
            max[minIndex]=arr[i];
        }
    }
    return maxProduct;
}
}
