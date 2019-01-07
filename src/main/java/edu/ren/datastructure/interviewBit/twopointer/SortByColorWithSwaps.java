package edu.ren.datastructure.interviewBit.twopointer;

import java.util.ArrayList;

public class SortByColorWithSwaps extends SortByColor {
    //0010112
    //0010212
    //0001212

    //0000112
    //0011101201
    //0001111201
    //001121
    //0000122022111
    //0000022122111
    //000222211
    @Override
    ArrayList<Integer> sort(ArrayList<Integer> arr) {
        int index = 0;
        int lenOfZeroBlock = 0;
        int lenOfOneBlock = 0;
        while (index < arr.size()) {

            final Integer number = arr.get(index);
            switch (number) {
                case 0:
                    if ((index != 0 && arr.get(index - 1) != 0)) {
                        swap(arr, index, lenOfZeroBlock);
                        lenOfOneBlock--;
                    } else {
                        index++;
                    }
                    lenOfZeroBlock++;
                    break;

                case 1:
                    if ((index != 0 && arr.get(index - 1) == 2)) {
                        swap(arr, index, lenOfZeroBlock + lenOfOneBlock);
                    }
                    lenOfOneBlock++;
                    index++;
                    break;

                case 2:
                    index++;

            }

        }
        return arr;
    }

    void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
}
