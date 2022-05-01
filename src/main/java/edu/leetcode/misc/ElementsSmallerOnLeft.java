package edu.leetcode.misc;

import java.util.*;

public class ElementsSmallerOnLeft {
    public List<Integer> countSmaller(int[] nums) {

        List<Integer> result = new ArrayList<>(nums.length);
        for (int i : nums) {
            result.add(0);
        }
        TreeMap<Integer, Integer> treeMap = new TreeMap();
        for (int i = nums.length - 1; i >= 0; i--) {
            Integer lowerKey = treeMap.lowerKey(nums[i]);
            if (lowerKey == null) {
                result.set(i, 0);
            } else {
                int count = 0;
                while (lowerKey != null && treeMap.containsKey(lowerKey)) {
                    count += treeMap.get(lowerKey);
                    lowerKey = treeMap.lowerKey(lowerKey);
                }
                result.set(i, count);
            }

            treeMap.put(nums[i], 1 + treeMap.getOrDefault(nums[i], 0));

        }
        return result;
    }
}
