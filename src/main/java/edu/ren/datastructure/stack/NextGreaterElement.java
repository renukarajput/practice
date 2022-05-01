package edu.ren.datastructure.stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public int[] print1(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int nextGreaterElm = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    nextGreaterElm = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + " - " + nextGreaterElm);
            result[i] = nextGreaterElm;
        }
        return result; //list.toArray(new Integer[list.size()])
    }

    public int[] get(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        Arrays.fill(result, -1);

        for (int i = 1; i < arr.length; i++) {
            Integer top = stack.peek();
            while (arr[top] < arr[i]) {
                Integer pop = stack.pop();
                result[pop] = arr[i];
                if (stack.isEmpty()) {
                    break;
                }
                top = stack.peek();
            }
            stack.push(i);
        }
        return result;
    }
}
