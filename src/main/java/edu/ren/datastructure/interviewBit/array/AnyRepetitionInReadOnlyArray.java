package edu.ren.datastructure.interviewBit.array;

import java.util.ArrayList;

public class AnyRepetitionInReadOnlyArray {

    int get(ArrayList<Integer> arr) {
        int slow = arr.get(0);
        int fast = arr.get(arr.get(0));
       // System.out.println("slow "+slow +" fast "+fast);
        while (slow != fast) {
            slow = arr.get(slow);
            fast = arr.get(arr.get(fast));
           // System.out.println("slow "+slow +" fast "+fast);
        }

        fast = 0;
        while (slow != fast) {
            slow = arr.get(slow);
            fast = arr.get(fast);
           // System.out.println("*slow "+slow +" fast "+fast);

        }
        return slow;
    }
}
