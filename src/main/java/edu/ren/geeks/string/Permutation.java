package edu.ren.geeks.string;

public class Permutation {

    public void allPossiblePermutation(String input) {
        int len = input.length()-1;
        for (int i = 0; i <= len; i++) {
            String result = swap(input, i, len);
            System.out.println("========== "+ result);
        }
    }

    private static String swap(String input, int start, int end) {
        char[] arr = input.toCharArray();
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return String.valueOf(arr);
    }
}
