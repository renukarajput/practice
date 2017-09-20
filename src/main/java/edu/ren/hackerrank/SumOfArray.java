package edu.ren.hackerrank;

/**
 * Created by rrn3194 on 3/20/17.
 */
public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,5,6,8};
        sumOfArray(arr);
    }

    private static void sumOfArray(int[] arr) {
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
