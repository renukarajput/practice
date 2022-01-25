package edu.ren.datastructure.interviewBit.array;

public class MedianOfSortedArraysOfEqualSize {
    int median(int[]one,int[] two){
        return median(one,0,one.length-1,two,0,two.length-1);
    }

   private int median(int one[], int startOne, int endOne, int two[], int startTwo, int endTwo) {
        int medianOneIndex = startOne + (endOne - startOne) / 2;
        int medianTwoIndex = startTwo + (endTwo - startTwo) / 2;
        if(startOne==endOne){
            return (one[startOne]+two[startTwo])/2;
        } if (one[medianOneIndex] == two[medianTwoIndex]) {
            return one[medianOneIndex];
        }
        if (one[medianOneIndex] < two[medianTwoIndex]) {
            return median(one, medianOneIndex+1, endOne, two, startTwo, medianTwoIndex-1);
        }else {
            return median(one, startOne,medianOneIndex-1, two, medianTwoIndex+1,endTwo);
        }
    }
}