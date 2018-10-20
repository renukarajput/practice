package edu.ren.datastructure.interviewBit.array;

public class MedianOSortedArrays {
    int median(int one[], int two[]) {
        int totalLength = one.length + two.length;
        boolean isEven = totalLength % 2 == 0;
        int medianOneIndex = totalLength / 2, medianTwoIndex = totalLength / 2;
        if (isEven) {
            medianTwoIndex = medianOneIndex + 1;
        }
        int medianOne, medianTwo;
        int i = 0, j = 0;
        while (true) {
            if (isEven) {
                if (i + j == medianOneIndex) {
                    medianOne = one[i];
                } else if (i + j == totalLength / 2){

                }
            } else {

            }
            if (one[i] < two[j]) {
                i++;
            } else {
                j++;
            }
        }
        //return 0;
    }


}
