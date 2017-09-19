package scala.javaPro;

import java.util.*;

/**
 * Created by rrn3194 on 5/23/16.
 */
public class LIS{
    public static void main(String[] args) {
        int arr[]={10, 22, 9, 33, 21, 50, 41, 60, 80};
        int output = findLengthOfLIS(arr);
        System.out.println("Output: "+output);
    }

    private static int findLengthOfLIS(int[] arr) {
        int len = arr.length;
        Set set = new HashSet<>();
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < len; j++) {

            }
        }
        int size = set.size();
        return size;
    }

}
