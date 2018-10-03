package edu.ren.datastructure.interviewBit.array;

import java.util.ArrayList;

public class FirstRepetitionInArray {

    int get(ArrayList<Integer> arr)
    {
        int i;
        for (i = 0; i < arr.size(); i++)
        {
            if (arr.get(Math.abs(arr.get(i))) >= 0) {
                arr.set(Math.abs(arr.get(i)) ,-arr.get(Math.abs(arr.get(i))));
            }
        }
       // System.out.println(arr);
        for (i = 0; i < arr.size(); i++)
        {
            if(arr.get(i)<0){
               return i;

            }
        }
        return -1;
    }
}
