package hackerrank;

import java.util.*;

public class RotateArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int result[] = rotate(a,k);
        for (int b: result) {
            System.out.print(b+" ");
        }
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
