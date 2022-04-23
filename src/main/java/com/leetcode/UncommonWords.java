package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWords {
    public static void main(String[] args) {
        uncommonWordsFromSentences("this apple is sweet", "this apple is sour");
        uncommonWordsFromSentences("apple apple", "banana");
    }

    public static String[] uncommonWordsFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        String[] w1 = s1.split(" ");
        String[] w2 = s2.split(" ");
        for (String word : w1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String word : w2) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        List<String> res = new ArrayList<>();
        for (String word : map.keySet()) {
            if (map.get(word) == 1)
                res.add(word);
        }
        return res.toArray(new String[res.size()]);
    }
}
