package edu.ren.geeks.string;

import java.util.*;

public class UncommonChars {

    public Set<Character> findUncommonCharacters(String str1, String str2) {
        Set<Character> resultSet = new HashSet<>();
        Set<Character> firstSet = getSetFromCharArray(str1);
        Set<Character> secondSet = getSetFromCharArray(str2);

        Set<Character> firstSetCopy = new HashSet<>(firstSet);
        firstSetCopy.retainAll(secondSet); //retain common elements

        firstSet.removeAll(firstSetCopy); //remove common from first ->unique to first
        secondSet.removeAll(firstSetCopy);

        resultSet.addAll(firstSet);
        resultSet.addAll(secondSet);
        return resultSet;
    }

    private Set<Character> getSetFromCharArray(String str1) {
        Set<Character> firstSet = new HashSet<>();
        for (Character c : str1.toLowerCase().toCharArray()) {
            firstSet.add(c);
        }
        return firstSet;
    }
}
