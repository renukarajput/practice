package edu.ren.datastructure.interviewBit.array;

import java.util.ArrayList;

public class MissingNumberInRange {
    int get(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); ) {
            if (i + 1 == arr.get(i)) {
                i++;
            } else {
                int indexOfNum = arr.get(i) - 1;
                if (indexOfNum < arr.size() && indexOfNum >= 0) {
                    int numAtPositionOfthisElem = arr.get(indexOfNum);
                    if(numAtPositionOfthisElem==arr.get(i)){
                        i++;
                        continue;
                    }
                    arr.set(indexOfNum, arr.get(i));
                    if (numAtPositionOfthisElem > 0 && numAtPositionOfthisElem < arr.size()) {
                        arr.set(i, numAtPositionOfthisElem);
                    } else {
                        arr.set(i, 0); //mark it processed
                    }

                } else {
                    //this can't be a missing no.
                    i++;
                }
            }
        }

        int lastMatchingNum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != i + 1) {
                return i + 1;
            } else {
                lastMatchingNum = i + 1;
            }
        }
        return lastMatchingNum + 1;
    }
}
