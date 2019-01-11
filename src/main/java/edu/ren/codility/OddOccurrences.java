package edu.ren.codility;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrences {

    // return the value of the unpaired element
    // 9 3 9 3 9 7 9
    public int find1(int[] input) {
        Set<Integer> elements = new HashSet<>();

        for (int i = 0; i < input.length; i++) {
            if (elements.contains(input[i])) {
                elements.remove(input[i]);
            } else {
                elements.add(input[i]);
            }
        }
        if (!elements.isEmpty())
            return elements.iterator().next();

        return 0;
    }

    int find(int arr[]) {
        // Do XOR of all elements and return
        int res = arr[0];
        for (int i = 1; i < arr.length; i++)
            res = res ^ arr[i];

        return res;
    }
}
