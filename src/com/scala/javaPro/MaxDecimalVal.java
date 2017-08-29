package com.scala.javaPro;

import java.util.Scanner;

/**
 * Created by rrn3194 on 4/20/16.
 */
public class MaxDecimalVal {
        public static void main(String[] args) {
            int arr[][] = new int[][]{{0, 1, 0},
                                      {1, 1, 0},
                                      {1, 1, 1}};
            System.out.println("Max is:::"+findMaxDecimalVal(arr));

        }

        private static int findMaxDecimalVal(int[][] arr) {
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                int sum = 0;
                for (int j = 0; j < arr.length; j++) {
                    if(arr[i][j] == 1)
                        sum += Math.pow(2 , (arr.length - 1 - j));
                }
                if(max < sum)
                    max = sum;

            }
            return max;
        }

    private static int findMaxDecimal(int arr[][]){
        RowComparator rc = new RowComparator();
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
           max = rc.compare(arr[i],arr[i]);
        }

        return max;
    }
}
