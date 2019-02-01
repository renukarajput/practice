package edu.ren.datastructure.interviewBit.twopointer;

import java.util.ArrayList;

public class RemoveDuplicatesFromSorted2 {
    //111222333
    //112222333
    //11222333
//11112222
    int remove(ArrayList<Integer> arr) {
        int maxLimit = 2;
        int count = 1;
        int readIndex = 1, writeIndex = 0;
        while (readIndex < arr.size()) {
            if (arr.get(readIndex).equals(arr.get(writeIndex))) {
                if (count < maxLimit) {
                    if (readIndex - writeIndex > 1) {
                        arr.set(writeIndex + 1, arr.get(readIndex));
                    }
                    writeIndex++;
                }
                count++;
            } else {
                writeIndex++;
                arr.set(writeIndex, arr.get(readIndex));
                count = 1;

            }

            readIndex++;
        }
        return writeIndex+1;
    }
}
