package edu.ren.datastructure.interviewBit.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rrn3194 on 11/22/18.
 */
public class RemoveDuplicateFromArray {

    public int removeFromSorted(List<Integer> input) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            if (!result.contains(input.get(i))) {
                result.add(input.get(i));
            }
        }
        return result.size();
    }

}
