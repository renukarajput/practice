package edu.ren.datastructure.interviewBit.array;

import java.util.List;

public class DuplicateInArrayOptimized extends DuplicateInArray{

    @Override
    public Integer findDuplicate(Integer[] input) {
        int elmAtIndex, elmToReplace;
        for (int i = 0; i < input.length; i++) {
            if (i != input[i] - 1) {
                elmAtIndex = input[i];
                elmToReplace = input[elmAtIndex-1];
                if (elmAtIndex == elmToReplace){
                    return elmAtIndex;
                }
                input[elmAtIndex - 1] = elmAtIndex;
                input[i] = elmToReplace;
            }
        }
        return 0;
    }

    public Integer findDuplicateInArrayList(List<Integer> input) {
        int elmAtIndex = 0, elmToReplace = 0;
        for (int i = 0; i < input.size(); i++) {
            if (i != input.get(i) - 1) {
                elmAtIndex = input.get(i);
                elmToReplace = input.get(elmAtIndex-1);
                if (elmAtIndex == elmToReplace){
                    return elmAtIndex;
                }
                input.set(elmAtIndex - 1, elmAtIndex);
                input.set(i, elmToReplace);
            }
        }
        return -1;
    }
}
