package edu.ren.geeks.array;

import java.util.LinkedList;
import java.util.Queue;

public class SegregateEvenOdd {

    public int[] segregateEvenOdds(int[] input) {
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 != 0) {
                queue.add(input[i]);
            } else {
                input[count] = input[i];
                count++;
            }
        }
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            input[count+i] = queue.remove();
        }
        return input;
    }
}
