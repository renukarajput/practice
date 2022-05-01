package edu.ren.datastructure.interviewBit.string;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveConsecutiveDuplicate {

    public String removeAllConsecutiveDuplicate(String input) {
        Map<Character, Integer> items = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            Character current = input.charAt(i);
            if (!items.containsKey(current)) {
                items.put(current, 1);
            } else {
                items.remove(current);
            }
        }
        Iterator<Character> iterator = items.keySet().iterator();
        while (iterator.hasNext()){
            result.append(iterator.next());
        }
        return result.toString();
    }
}
