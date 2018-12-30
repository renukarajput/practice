package edu.ren.hackerrank.medium;

import java.util.Arrays;

public class NewYearChaos {
    //1 2 3 4 5
    //1 2 3 5 4
    //1 2 5 3 4
    //2 1 5 3 4
    int getMinimumBribe(int[] arr) {

        int bribe = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int originalPosition = num - 1;

            if (i < originalPosition) {
                if (originalPosition - i > 2) {
                    System.out.println("Too chaotic");
                    return -1;
                }
            }

            for (int j =0; j <i ; j++) {
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    bribe++;
                }
            }
        }
        System.out.println(bribe);
        System.out.println(Arrays.toString(arr));
        return bribe;
    }
}
