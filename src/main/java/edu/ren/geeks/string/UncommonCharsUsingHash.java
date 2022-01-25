package edu.ren.geeks.string;

import java.util.*;

public class UncommonCharsUsingHash extends UncommonChars {
    final int MAX_CHAR = 26;

    public Map<Character, Integer> getSetOfChar() {

        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < MAX_CHAR; i++) {
            charMap.put(Character.toLowerCase((char) (i + 65)), 0);
        }
        return charMap;
    }

    public Set<Character> findUncommonChars(String str1, String str2) {
        Map<Character, Integer> charMap = getSetOfChar();
        for (int i = 0; i < str1.length(); i++) {
            if (charMap.containsKey(str1.charAt(i))) {
                charMap.put(str1.charAt(i), 1);
            }
        }
        for (int j = 0; j < str2.length(); j++) {
            if ((charMap.get(str2.charAt(j))).equals(1) || charMap.get(str2.charAt(j)).equals(-1)) {
                charMap.put(str2.charAt(j), -1);
            } else {
                charMap.put(str2.charAt(j), 2);
            }
        }

        int ch = 65;
        Set<Character> resultSet = new HashSet();
        for (int k = 0; k < MAX_CHAR; k++) {
            char charToFind = Character.toLowerCase(Character.valueOf((char) ch++));
            if (charMap.get(charToFind).equals(1) || charMap.get(charToFind).equals(2)) {
                resultSet.add(charToFind);
            }
        }
        System.out.println("== " + resultSet);
        return resultSet;
    }
}