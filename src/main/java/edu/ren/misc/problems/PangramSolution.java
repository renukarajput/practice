package edu.ren.misc.problems;

import java.util.*;

public class PangramSolution {

    public static String pangramChecker(String sentence) {
        Set<Character> set = new HashSet<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            set.add(ch);
        }
        for (int i = 0; i < sentence.length(); i++) {
            if (set.contains(sentence.charAt(i))) {
                set.remove(sentence.charAt(i));
            }
        }
        if (set.isEmpty() == true)
            return "pangram";
        else
            return "not pangram";
    }
}