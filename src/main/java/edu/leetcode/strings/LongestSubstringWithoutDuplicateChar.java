package edu.leetcode.strings;

import java.util.*;

public class LongestSubstringWithoutDuplicateChar {


    public int lengthOfLongestSubstring(String s) {
        System.out.println(s);
        Deque<Integer> deque = new ArrayDeque<>();

        Set<Character> visited = new HashSet<>();
        char[] ch = s.toCharArray();
        int maxLen = 0;

        for (int k = 0; k < ch.length; k++) {
            if (visited.contains(ch[k])) {
                maxLen = Math.max(maxLen, deque.size());
                while (!deque.isEmpty() && visited.contains(ch[k])) {
                    int outCharIndex = deque.removeFirst();
                    visited.remove(ch[outCharIndex]);
                }


            }
            deque.addLast(k);
            visited.add(ch[k]);
        }
        return Math.max(maxLen, deque.size());

    }
}
