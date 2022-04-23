package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntConversion {

    public int romanToInt(String s) {
        Map<String, Integer> map = populateMap();
        int sum = 0;
        for (int i = 0; i < s.length();) {
            final char currKey = s.charAt(i);
            final Integer currVal = map.get(String.valueOf(currKey));
            Integer nextVal = 0;
            if (i + 1 < s.length()) {
                final char nextKey = s.charAt(i + 1);
                nextVal = map.get(String.valueOf(nextKey));
            }
            if (currVal < nextVal) {
                sum += (nextVal - currVal);
                i += 2;
            } else {
                sum += currVal;
                i += 1;
            }
        }
        return sum;
    }

    private Map<String, Integer> populateMap() {
        String[] str = {"I", "V", "X", "L", "C", "D", "M"};
        Integer[] values = {1, 5, 10, 50, 100, 500, 1000};
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            map.put(str[i], values[i]);
        }
        return map;
    }
}
