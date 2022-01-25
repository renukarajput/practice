package edu.ren.datastructure.interviewBit.array;

import java.util.Arrays;
import java.util.List;

public class MissingInteger {

    public int findFirstMissingInteger(Integer[] input) {
        return findFirstMissingInteger(Arrays.asList(input));
    }
    
    public int findFirstMissingInteger(List<Integer> input) {
        int numberAtIndex, numberToReplace;
        for (int i = 0; i < input.size(); ) {
            if (input.get(i) == i + 1) {
                i++;
                continue;
            }
            if (input.get(i) > 0 && input.get(i) <= input.size()) {
                numberAtIndex = input.get(i);
                numberToReplace = input.get(numberAtIndex - 1);
                if (numberAtIndex == numberToReplace) {
                    i++;
                    continue;
                }
                input.set(numberAtIndex - 1, numberAtIndex);
                input.set(i, numberToReplace);
            } else {
                i++;
            }
        }
        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) != i + 1) {
                return i + 1;
            }
        }
        return input.size()+1;
    }

}
