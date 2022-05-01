package edu.ren.misc.problems;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static boolean isAnagram(String input1, String input2){
        Map<Character,Integer> mapOne = new HashMap<>();
        Map<Character,Integer> mapTwo = new HashMap<>();
        int count = 1;
        for (int i = 0; i < input1.length(); i++) {
            if (mapOne.containsKey(input1.charAt(i))){
                int cnt = mapOne.get(input1.charAt(i));
                mapOne.put(input1.charAt(i),cnt+1);
            }
            else
                mapOne.put(input1.charAt(i), count);
        }

        for (int j = 0; j < input2.length(); j++) {
            if (mapTwo.containsKey(input2.charAt(j))){
                int cnt = mapTwo.get(input2.charAt(j));
                mapTwo.put(input2.charAt(j),cnt+1);
            }
            else
                mapTwo.put(input2.charAt(j), count);
        }
        if (mapOne.size() == mapTwo.size() && mapOne.equals(mapTwo))
            return true;
        else
            return false;
    }
}
