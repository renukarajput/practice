package edu.ren.codility;

import java.util.Stack;

public class BinaryGapUsingStack {

    //000000010, 100101, 1000010001, 101001000, 101010, 10100
    public int maximumSequenceOFZero(int[] input) {
        Stack<Integer> stack = new Stack();
        int count = 0, maxLength = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1) {
                if (!stack.isEmpty()) {
                    int top = stack.peek();
                    count = i - top - 1;
                    if (count > maxLength)
                        maxLength = count;
                    stack.clear();
                }
                stack.push(i);
            }
        }
        return maxLength;
    }
}
