package edu.ren.datastructure.interviewBit.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class WaveArray {
    public ArrayList<Integer> waveSort(ArrayList<Integer> arr) {
        Collections.sort(arr);
        int i = 0, j = 1;
        while (j < arr.size()) {
            swap(arr, i, j);
            i+=2;
            j+=2;
        }
        return arr;
    }

    public ArrayList<Integer> waveSortLexicoGraphicallySmallest(ArrayList<Integer> arr) {
        Collections.sort(arr);
        int i = 0, j = 1;
        while (j <=arr.size()-1) {
            swap(arr, i, j);
            i+=2;
            j+=2;
        }
        return arr;
    }


    private void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }
}
