package homework.main.java;


public class ArrayRotation {

    public static void leftRotate(int arr[], int noOfRotation, int n) {
        int i;
        if (noOfRotation <= arr.length)
           for (i = 0; i < noOfRotation; i++)
                leftRotatebyOne(arr, n);
        else
            System.out.println("Invalid input");
    }

    public static void leftRotatebyOne(int arr[], int n) {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }

    public static int[] rotate(int[] inp, int noOfRotation){
        if (inp == null || noOfRotation < 0) {
            System.out.println("Invalid input");
            return inp;
        }
        int[] output = rotateToLeft(inp, inp.length);
        if(noOfRotation <= 1)
            return output;
        return rotate(output, noOfRotation-1);
    }

    public static int[] rotateToLeft(int[] input, int len){
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
