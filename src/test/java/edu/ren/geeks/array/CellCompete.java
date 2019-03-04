package edu.ren.geeks.array;

import java.util.Arrays;
import java.util.List;

public class CellCompete {
    public List<Integer> cellCompete(int[] states, int days) {
        Integer[] newState = new Integer[states.length];
        final int ACTIVE = 1;
        final int INACTIVE = 0;
        while (days-- > 0) {
            for (int i = 0; i < states.length; i++) {
                int left = i == INACTIVE ? INACTIVE : states[i - 1];
                int right = i == states.length -1? INACTIVE : states[i + 1];
                if (left == right) {
                    newState[i] = INACTIVE;
                } else {
                    newState[i] = ACTIVE;
                }
            }

            for (int i = 0; i <states.length ; i++) {
                states[i]=newState[i];
            }
        }
        return Arrays.asList(newState);
    }
}
