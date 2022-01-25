package edu.ren.misc.problems;

import java.util.*;

public class WordMatch {
    // program , programmer
    // maprorg , programmer
    public boolean isWordPresent(String input, String wordToMatch) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < wordToMatch.length(); i++) {
            Character key = wordToMatch.charAt(i);
            map.putIfAbsent(key, 0);
            map.put(key, map.get(key) + 1);
        }
//        System.out.println("map == " + map);
        for (int i = 0; i < input.length(); i++) {
            Character k = input.charAt(i);
            if (!map.containsKey(k)) {
                return false;
            }
        }
        return true;
    }

    public int findDistanceBetweenWords(String input, String wordToMatch) {
        int count = 0;
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'x') {
                if (isWordPresent(sb.toString(), wordToMatch)) {
                    count++;
                }
            } else {
                sb.append(input.charAt(i));
            }
            if (sb.toString().equals(wordToMatch)) {
                list.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        System.out.println(" - " + count + " list - " + list);
        return count;
    }
}
