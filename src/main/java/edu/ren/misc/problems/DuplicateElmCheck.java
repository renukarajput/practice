package edu.ren.misc.problems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElmCheck {
    //1 1 2 3 4 6 k=2 ,**** 1 1 k=2
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int j;
        for (int i = 0; i < nums.length - k; i++) {
            j = i + k;
            while (j > i) {
                if (nums[i] == nums[j]) {
                    return true;
                }
                j--;
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicateUsingMap(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer value = map.put(nums[i], i);
            if (value != null && i - value <= k) {
                return true;
            }
//            if (map.containsKey(nums[i]) && (i - map.get(nums[i])) <= k)
//                return true;
        }
        return false;
    }
}
