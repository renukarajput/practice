package com.scratch;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    final int base=10;

    void rearrange(Integer[] arr){
        Comparator<Integer> comparator=(x,y)->{
            final int lenghtOfX = getNumberOfDigitsIn(x);
            final int lenghtOfY = getNumberOfDigitsIn(y);
            if(lenghtOfX==lenghtOfY){
                return Integer.compare(x,y);
            }
            if(lenghtOfX>lenghtOfY){
                final int valueOfY = (int) (y*Math.pow(10,(lenghtOfX - lenghtOfY)));
                return Integer.compare(x,valueOfY);
            }else {
                final int valueOfX = (int) (x*Math.pow(10,(lenghtOfY - lenghtOfX)));
                return Integer.compare(valueOfX,y);
            }
        };
        Arrays.sort(arr,comparator.reversed());
    }

    private int getNumberOfDigitsIn(Integer num) {
        int digits=1;
        while (num/base>0){
            digits++;
            num=num/base;
        }
        return digits;
    }
}
