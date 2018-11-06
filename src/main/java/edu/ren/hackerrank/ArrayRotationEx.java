package edu.ren.hackerrank;

public class ArrayRotationEx {
    public static void main(String[] args) {
        int input[] = {1, 2, 3, 4, 5};
        int k = 3;
        int output[] = new int[input.length];
        if (k > input.length)
            System.out.println("Invalid input");
        else {
            for (int i = 0; i < k; i++)
                output = rightRotateByK(input, input.length);
            for (int a : output)
                System.out.print(a + " ");
        }

//        rotateByK(input, input.length,k);
    }

    public static int[] rightRotateByK(int arr[], int len) {
        int temp;
        for (int i = 0; i < len - 1; i++) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }


    public static void rotateByK(int arr[], int len, int k) {
        int temp = 0;
        for (int i = 0; i < k - 1; i++) {
            for (int j = i; j < len; j = j + k) {
                temp = arr[j + k];
                arr[(j + k) % len] = arr[j];
                System.out.println(arr[j] + "*");
            }
        }
    }

    public static int[] rotate(int[] inp, int noOfRotation) {
        int[] output = ArrayRotationEx.rotateToLeft(inp, inp.length);
        return output;
        /*if (noOfRotation <= 1)
            return output;
        return rotate(output, noOfRotation - 1);*/
    }

    public static int[] rotateToLeft(int[] input, int len) {
        int temp[] = new int[len];
        for (int i = 0; i < len; i++) {
            if (i == len - 1)
                temp[i] = input[len - (i + 1)];
            else
                temp[i] = input[i + 1];
        }
        return temp;
    }
}