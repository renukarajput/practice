package leetcode_14days.day2;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SquaredSortedArray {
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        int[] result = getSortedSquare(arr);
        System.out.println(Arrays.toString(result));
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = result[i];
//        }
//        System.out.println(Arrays.toString(arr));

    }
    //1 3 6 8
    //2 5 7
    //1 2 3 5 6 7 8
    //-5 -4 -3 -2 -1 1 3 4 5

    //===============================

    private static int[] getSortedSquare(int[] arr) {
        for (int i = 0; i <= arr.length-1; i++) {
            arr[i] = arr[i]*arr[i];
        }
        Arrays.sort(arr);
        return arr;
    }

    private static Integer[] getSquare(Integer[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = arr[i] * arr[i];
        }
        Set<Integer> set = new TreeSet<>();
        set.addAll(Arrays.asList(arr));
        return set.toArray(new Integer[]{});
    }
}
