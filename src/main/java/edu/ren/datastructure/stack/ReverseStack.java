package edu.ren.datastructure.stack;

import java.util.Stack;

/**
 * Created by rrn3194 on 5/29/16.
 */
public class ReverseStack {

    public static void reverseMyStack(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int elm = st.pop();
        reverseMyStack(st);
        insertAtBottom(st, elm);
    }

    private static void insertAtBottom(Stack<Integer> st, int newElement) {
       if (st.isEmpty()) {
           st.push(newElement);
           return;
       }
        Integer element = st.pop();
       insertAtBottom(st,newElement);
       st.push(element);
    }
}
