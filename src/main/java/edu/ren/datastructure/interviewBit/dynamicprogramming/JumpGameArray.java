package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.Arrays;
import java.util.List;

public class JumpGameArray {
    boolean isFeasible(Integer[] arr) {
        return isFeasible(Arrays.asList(arr));
    }

    //i+j<arr.size
    boolean isFeasible(List<Integer> arr) {
        boolean[] isFeasible = new boolean[arr.size()];
        isFeasible[arr.size() - 1] = true;
        for (int i = arr.size() - 2; i >= 0; i--) {
            int num = arr.get(i);
            for (int j = 1; j < arr.size() - i && j <= num; j++) {
                if (isFeasible[i + j]) {
                    isFeasible[i] = true;
                    break;

                }
            }
        }
        return isFeasible[0];
    }

}
