package edu.ren.datastructure.interviewBit.array;

import java.util.ArrayList;
import java.util.List;

public class MaximumUnsortedSubArray {

    public ArrayList<Integer> maximumSubArray(List<Integer> arr) {

        int j = 1;
        int[] indexes = new int[]{-1, -1};
        while (j < arr.size()) {
            int element = arr.get(j);
            int i = j - 1;
            boolean isUnsorted = false;
            while (i >= 0 && arr.get(i) >element) {
                isUnsorted = true;
                arr.set(i+1,arr.get(i));
                i--;
            }
            if (isUnsorted) {
                if (i+1 >= indexes[0] && indexes[0]!=-1) {
                    indexes[1] = j;
                } else {
                    indexes[1] = j;
                    indexes[0] = i+1;
                }
                arr.set(i+1, element);
            }

            j++;
        }
        final ArrayList<Integer> result = new ArrayList<>();
        if (indexes[1] != -1) {
            result.add(indexes[0]);
            result.add(indexes[1]);
        } else {
            result.add(-1);
        }
        return result;
    }
}
