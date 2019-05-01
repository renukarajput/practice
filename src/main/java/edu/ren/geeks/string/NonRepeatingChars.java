package edu.ren.geeks.string;

import java.util.*;

public class NonRepeatingChars {

    public static Character getNonRepeatingFirstChar(List<Character> characterList) {
        Map<Character, Boolean> map = new LinkedHashMap<>();
        Set<Character> duplicates = new HashSet<>();

        characterList.stream().forEach(key -> {
            if (map.containsKey(key) && !duplicates.contains(key)) {
                map.remove(key);
                duplicates.add(key);
            } else if (!duplicates.contains(key)){
                map.put(key, true);
            }
        });
        if (map.entrySet().iterator().hasNext())
            return map.entrySet().stream().findFirst().get().getKey();
        else
            return null;
    }

    public static void firstNonRepeatingChar(String input) {
        char[] chars = input.toCharArray();
        Set<Character> visitedSet = new LinkedHashSet<>();
        for (int i = 0; i < chars.length; i++) {
            if (!visitedSet.contains(chars[i])) {
                visitedSet.add(chars[i]);
            } else {
                visitedSet.remove(chars[i]);
            }
        }
        System.out.println(visitedSet.stream().findFirst().get());
    }
}