package edu.ren.datastructure.interviewBit.array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {

    public Integer findDuplicate(Integer[] input) {
        Set<Integer> visited = new HashSet();
        for (int i = 0; i < input.length; i++) {
            if (!visited.contains(input[i])) {
                visited.add(input[i]);
            } else {
                return input[i];
            }
        }
        return 0;
    }
}
