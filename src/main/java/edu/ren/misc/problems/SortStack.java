package edu.ren.misc.problems;

import java.util.Stack;

/**
 * Created by rrn3194 on 6/1/16.
 */
public class SortStack {

    // Recursive sorting of stack

    public static void sortStackRecursively(Stack<Integer> st){
        if (!st.isEmpty()){
            int temp = st.pop();
            sortStackRecursively(st);
            sortedInsertionRecursively(st, temp);
        }
    }

    private static void sortedInsertionRecursively(Stack<Integer> st, int elm) {
        System.out.println(st);
        if (st.isEmpty() || elm > st.peek()){
            st.push(elm);
            return;
        }
        int temp = st.pop();
        sortedInsertionRecursively(st, elm);
        st.push(temp);
    }

    // Iterative sorting descending order
    public static Stack<Integer> sortStackIteratively(Stack<Integer> stack){
        Stack<Integer> tempStack = new Stack<>();

        while(!stack.isEmpty()){
            Integer elm = stack.pop();

            while(!tempStack.isEmpty() && elm > tempStack.peek()){
                Integer top = tempStack.pop();
                stack.push(top);
            }
            tempStack.push(elm);
        }
        return tempStack;
    }
}