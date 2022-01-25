package edu.ren.misc.problems;

import java.util.*;

public class NearestDuplicate {

    public int getMinimumDistance(int[] input) {
        int length = input.length;
        int minDist = Integer.MAX_VALUE;
        int distance = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (input[i] == input[j]) {
                    distance = j - i;
                    if (distance > 0 && minDist > distance) {
                        minDist = distance;
                    }
                }
            }
        }
        return minDist;
    }

    public int getMinimumDistanceOptimized(int[] input) {
        int length = input.length;
        int minDist = Integer.MAX_VALUE;
        int distance = 0;
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < length; i++) {
            if (map.containsKey(input[i])) {
                distance = i - map.get(input[i]);
            }
            map.put(input[i], i);
            if (distance > 0 && minDist > distance) {
                minDist = distance;
            }
        }
        return minDist;
    }
}
