package leetcode_14days.day4;

public class StringReversal {
    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        reverseString(arr);
        System.out.println("after");
        for (char c : arr) {
            System.out.print(c+" ");
        }
    }

    public static void reverseString(char[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;end--;
        }
    }
}
