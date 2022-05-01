package edu.ren.datastructure.interviewBit.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfSortedArray {
    List<Integer> get(Integer[] one, Integer[] two) {
        return get(Arrays.asList(one), Arrays.asList(two));
    }

    List<Integer> get(List<Integer> one, List<Integer> two) {
        final List<Integer> result = new ArrayList<>();
        int indexOne = 0, indexTwo = 0;
        while (indexOne < one.size() && indexTwo < two.size()) {
            if (one.get(indexOne).equals(two.get(indexTwo))) {
                result.add(one.get(indexOne));
                indexOne++;
                indexTwo++;
            } else if (one.get(indexOne) < two.get(indexTwo)) {
                indexOne++;
            } else {
                indexTwo++;
            }
        }
        return result;
    }
}
