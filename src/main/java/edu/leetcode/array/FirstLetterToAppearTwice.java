package edu.leetcode.array;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/first-letter-to-appear-twice/
public class FirstLetterToAppearTwice {

    public char repeatedCharacter(String s) {
        Map<Character, Integer> map = new HashMap();
        for (Character c : s.toCharArray()) {
            if (!map.containsKey(c))
                map.put(c, 1);
            else
                map.put(c, map.get(c) + 1);

            if (map.get(c) == 2) {
                return c;
            }
        }
        return ' ';
    }
}
