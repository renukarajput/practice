package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonWords {
    public static void main(String[] args) {
        countCommonWords(new String[]{"leetcode","is","amazing","as","is"}, new String[]{"amazing","leetcode","is"});
        countCommonWords(new String[]{"b","bb","bbb"}, new String[]{"a","aa","aaa"});
        countCommonWords(new String[]{"a","ab"}, new String[]{"a","a","a","ab"});
        countCommonWords(new String[]{"a","ab"}, new String[]{});
    }

    public static int countCommonWords(String[] words1, String[] words2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        List<String> res = new ArrayList<>();
        for (String str : words1) {
            map1.put(str, map1.getOrDefault(str,0)+1);
        }
        for (String str : words2) {
            map2.put(str, map2.getOrDefault(str,0)+1);
        }
        for (String str : map1.keySet()) {
            if ((map1.get(str) == 1 && map2.containsKey(str)) && map2.get(str)==1) {
                res.add(str);
            }
        }
        System.out.println(res);
        return res.size();
    }

}
