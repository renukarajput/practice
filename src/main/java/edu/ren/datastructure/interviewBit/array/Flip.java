package edu.ren.datastructure.interviewBit.array;

import java.util.ArrayList;

abstract public class Flip {
    public static final char ZERO = '0';

    public ArrayList<Integer> flip(String input) {
        int[] flipPoints = flip(input.toCharArray());
        ArrayList<Integer> result=new ArrayList<>();
        if(flipPoints[0]!=-1){
            result.add(flipPoints[0]+1);
            result.add(flipPoints[1]+1);
        }
        return result;
    }
    abstract int[] flip(char[] arr);
}
