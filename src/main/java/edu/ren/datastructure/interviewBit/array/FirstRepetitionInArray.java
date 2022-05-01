package edu.ren.datastructure.interviewBit.array;

import java.util.ArrayList;
import java.util.HashSet;

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

    public void printFirstRepeating(int arr[]) {
        int min = -1;

        HashSet<Integer> set = new HashSet<>();

        for (int i=0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                min = i;
                //break;
            }
            else
                set.add(arr[i]);
        }

        if (min != -1)
            System.out.println("The first repeating element is " + arr[min]);
        else
            System.out.println("There are no repeating elements");
    }
}
