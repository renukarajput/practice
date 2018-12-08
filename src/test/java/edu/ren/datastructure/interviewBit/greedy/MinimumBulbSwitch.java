package edu.ren.datastructure.interviewBit.greedy;

import java.util.Arrays;
import java.util.List;

public class MinimumBulbSwitch {
    int min(Integer[] arr) {
        return min(Arrays.asList(arr));
    }
    int min(List<Integer> arr) {
        boolean isMakeZero = false;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (isMakeZero) {
                if (num == 1) {
                    count++;
                    isMakeZero = false;
                }
            } else {
                if (num == 0) {
                    count++;
                    isMakeZero = true;
                }
            }
        }
        return count;
    }
}
