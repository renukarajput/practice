package edu.ren.datastructure.interviewBit.twopointer;

import java.util.ArrayList;

public class RemoveDuplicatesFromSorted2 {
    //111222333
    //11222333

    void remove(ArrayList<Integer> arr) {
        int maxLimit = 2;
        int count = 0;
        int readIndex = 0, writeIndex = 0;
        while (readIndex < arr.size()) {

            if (count > maxLimit) {
                count = 0;
                arr.set(writeIndex,arr.get(readIndex));
            }else {

            }

        }

    }
}
