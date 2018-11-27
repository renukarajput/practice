package edu.ren.datastructure.interviewBit.array;

import java.util.List;

/**
 * Created by rrn3194 on 11/22/18.
 */
public class RemoveDuplicateFromArrayListOptimized extends RemoveDuplicateFromArray {

    @Override
    public int removeFromSorted(List<Integer> input) {
        for (int i = 0; i < input.size() - 1; ) {
            if (input.get(i) == input.get(i + 1)) {
                input.remove(i);
            } else {
                i++;
            }
        }
        return input.size();
    }
}
