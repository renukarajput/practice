package edu.ren.datastructure.interviewBit.array;

public class DuplicateInArray {

    //[3 4 1 4]
    //es=4*5/2 =10
    //ac =12
    //ep=4! =24
    //ap= 48
    //y/x=2 y-x=2

    int and(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = res ^ arr[i];

        }
        return res;
    }
}

