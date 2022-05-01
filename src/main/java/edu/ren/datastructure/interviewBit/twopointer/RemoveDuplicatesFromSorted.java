package edu.ren.datastructure.interviewBit.twopointer;

import java.util.ArrayList;

public class RemoveDuplicatesFromSorted {
    public int removeDuplicates(ArrayList<Integer> a) {
        int i = 0, j = 1;

        while (j < a.size()) {
            if (a.get(i) .equals( a.get(j))) {
                //continue;
            } else {
                a.set(i + 1, a.get(j));
                i++;
            }
            j++;
        }
        return i+1;
    }
}
