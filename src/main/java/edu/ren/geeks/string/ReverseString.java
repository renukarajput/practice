package edu.ren.geeks.string;

public class ReverseString {

    public static String reverseStringInput(String input) {
        int start = 0, end = input.length() - 1;
        char[] arr = input.toCharArray();
        while (start <= end) {
            //(arr[start] >= 97 && arr[start] <= 122) && (arr[end] >= 97 && arr[end] <= 122)

            if (Character.isAlphabetic(arr[start]) && Character.isAlphabetic(arr[end])) {
                swap(arr, start, end);
                start++;
                end--;
            }
            if (!Character.isAlphabetic(arr[end])) {
                end--;
            }
            if (!Character.isAlphabetic(arr[start])) {
                start++;
            }
        }
        return new String(arr);
    }

    private static void swap(char[] arr, int start, int end) {
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static String[] reverseString(String[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
