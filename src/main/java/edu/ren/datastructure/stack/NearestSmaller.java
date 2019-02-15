package edu.ren.datastructure.stack;

import java.util.ArrayList;

public class NearestSmaller {

    public int[] fromLeft(int[] arr) {
        ArrayList<Integer> input = new ArrayList<>();
                int[] result = new int[arr.length];

        for ( int i: arr) {
            input.add(i);
        }
        ArrayList<Integer> output = prevSmaller(input);
        int cnt=0;
        for ( int elm: output) {
            result[cnt++]= elm;
        }
        return result;
    }
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {
        ArrayList<Integer> result = new ArrayList<>();
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        stack.push(0);

        for (int i = 0; i < arr.size(); i++) {
            result.add(-1);
        }

        for (int i = 1; i < arr.size(); i++) {
            Integer top = stack.peek();
            while (arr.get(top) >= arr.get(i)) {
                stack.pop();
                if (stack.isEmpty())
                    break;
                top = stack.peek();
            }
            if (!stack.isEmpty()) {
                result.set(i, arr.get(top));
//                result[i] = arr[top];
            }
            stack.push(i);
        }
        return result;
    }
}
