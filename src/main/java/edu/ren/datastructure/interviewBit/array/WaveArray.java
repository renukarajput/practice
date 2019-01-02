package edu.ren.datastructure.interviewBit.array;

import java.util.ArrayList;
import java.util.Collections;

public class WaveArray {
    public ArrayList<Integer> waveSort(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size() - 1; i += 2) {
            swapNumbers(arrayList, i, i + 1);
        }
        return arrayList;
    }

    private void swapNumbers(ArrayList<Integer> list, int first, int second) {
        Integer temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }
}
