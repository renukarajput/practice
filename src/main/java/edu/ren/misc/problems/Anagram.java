package edu.ren.misc.problems;

import java.util.Map;
import java.util.stream.Collectors;

public class Anagram {
    public static boolean isAnagram(String input1, String input2){
        if (input1.length()!=input2.length()) return false;
        Map<Character, Long> mapOne = input1.chars().mapToObj(c -> Character.valueOf((char) c)).
                collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        Map<Character, Long> mapTwo = input2.chars().mapToObj(c -> Character.valueOf((char) c))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(mapOne + " == "+ mapTwo);
        return mapOne.size() == mapTwo.size() && mapOne.equals(mapTwo);
    }
}
