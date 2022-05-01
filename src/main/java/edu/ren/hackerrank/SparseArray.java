package edu.ren.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class SparseArray {
    //ab->2,
    //str - "aba", "baba","aba","xzxb" ,,,, queries -  "aba","xzxb","ab"
    public int[] matchingStrings(String[] strings, String[] queries) {
        Map<String, Integer> queryStringCountMap = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            queryStringCountMap.putIfAbsent(strings[i], 0);
            queryStringCountMap.put(strings[i], queryStringCountMap.get(strings[i]) + 1);
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (queryStringCountMap.containsKey(queries[i]))
                result[i] = queryStringCountMap.get(queries[i]);
            else
                result[i] = 0;
        }
        return result;
    }

    private boolean contains(String input, String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(input)) {
                return true;
            }
        }
        return false;
    }

}
