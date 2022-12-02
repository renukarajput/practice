package edu.leetcode.array;

import java.util.LinkedHashMap;
import java.util.Map;
// https://leetcode.com/problems/first-unique-character-in-a-string/
public class FirstUniqueChar {
    public int firstUniqueChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.toCharArray().length; i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return  i;
            }
        }
        return -1;
    }
}
