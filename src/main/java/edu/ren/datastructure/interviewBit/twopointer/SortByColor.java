package edu.ren.datastructure.interviewBit.twopointer;

import java.util.ArrayList;

public class SortByColor {
    ArrayList<Integer> sort(ArrayList<Integer> arr) {
        int[] colorCount = new int[3];
        arr.forEach(i -> {
            colorCount[i]++;
        });

        for (int i = 0, j = 0; i < colorCount.length && j < arr.size(); ) {
            if (colorCount[i] == 0) {
                i++;
                continue;
            }
                arr.set(j, i);
                colorCount[i]--;
                j++;

        }
        return arr;
    }
}
