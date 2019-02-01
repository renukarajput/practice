package edu.ren.datastructure.interviewBit.twopointer;

import java.util.ArrayList;

public class RemoveElementFromArray {
    //4 1 1 2 1 3
    //4 2 1 2 1 3


//4, 1, 1, 2, 1, 3
//4, 2, 1, 2, 1, 3

    int remove(ArrayList<Integer> arr,int value){
        int readIndex=0,writeIndex=0;
        while (readIndex<arr.size()){
            if(!arr.get(readIndex).equals(value)){
                arr.set(writeIndex,arr.get(readIndex));
                writeIndex++;
            }
            readIndex++;
        }
        return writeIndex;
    }
}
