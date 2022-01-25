package leetcode_14days.day2;


public class RotateArray {

    public static void rotate(int[] arr, int k) {
        while (k != 0) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
            k--;
        }
    }

    public static int[] rotateOptimized(int[] arr, int k) {
        if (arr.length < k) {
            k = k % arr.length;
        }
        int[] kElements = new int[k];
        System.arraycopy(arr, arr.length - k, kElements, 0, kElements.length);
        System.arraycopy(arr, 0, arr, k, arr.length - k);
        System.arraycopy(kElements, 0, arr, 0, kElements.length);
        return arr;
    }
}
