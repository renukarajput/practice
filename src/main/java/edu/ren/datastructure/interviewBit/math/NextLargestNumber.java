package edu.ren.datastructure.interviewBit.math;

import java.util.Arrays;

public class NextLargestNumber {
//  {'2', '0', '6', '6', '5', '4'};
    static void findNext(char arr[], int n) {
        int i;

        for (i = n - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                break;
            }
        }

        if (i == 0) {
            System.out.println("Not possible");
        } else {
            int x = arr[i - 1], min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > x && arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, i - 1, min);
            Arrays.sort(arr, i, n);
            System.out.print("Next number : ");
            for (i = 0; i < n; i++)
                System.out.print(arr[i]);
        }
    }

    static void swap(char ar[], int i, int j) {
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    public static void main(String[] args) {
        char digits[] = {'2', '0', '6', '6', '5', '4'};
        findNext(digits, digits.length);
    }
}


