package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        System.out.println(Arrays.toString(twoSumUsingHashMap(arr, 6)));
    }

    public static int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (diff == arr[j]) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static int[] twoSumUsingHashMap(int[] arr, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            map.put(arr[i], i);
//        }
        for (int j = 0; j < arr.length; j++) {
            int diff = target - arr[j];
            if (map.containsKey(diff) && map.get(diff) != j) {
                result[0] = j;
                result[1] = map.get(diff);
            }
            map.put(arr[j], j);
        }
        return result;
    }
}
