package edu.ren.misc.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstRepeatedInArray {

    // 4, 3, 5, 3, 4, 6, 7, 6
    public int getTheElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    // 4, 3, 5, 3, 4, 6, 7, 6
    public int getTheElementOptimized(int[] arr) {
        Set<Integer> set = new HashSet();
        int min = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
            } else {
                min = i;
            }
        }
        if (min != -1) {
            return arr[min];
        }
        return min;
    }
// 4, 3, 4, 5, 3, 4, 6, 7, 6
    public int getTheElementUsingMap(int[] arr) {
        Map<Integer, Integer> map = new HashMap();
        int min = -1;
        int currentMin;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                currentMin = map.get(arr[i]);
                if (currentMin < min || currentMin == 0)
                    return arr[currentMin];
                min = currentMin;
            }
            map.put(arr[i], i);
        }
        if (min != -1)
            return arr[min];
        return min;
    }
}
