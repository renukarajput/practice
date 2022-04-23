package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CountKDifference {

    public  int count(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public int findNumber(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
//        Integer[] ints = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        int limit = arr.length/4;
        System.out.println("map keys: " + map.keySet() + " value : " + map.values());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > limit) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
