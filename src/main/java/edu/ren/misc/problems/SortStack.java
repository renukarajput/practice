package edu.ren.misc.problems;

import java.util.Stack;

/**
 * Created by rrn3194 on 6/1/16.
 */
public class SortStack {

    public static void sortStack(Stack<Integer> st){
        if (!st.isEmpty()){
            int temp = st.pop();
            sortStack(st);
            sortedInsert(st, temp);
        }
    }

    private static void sortedInsert(Stack<Integer> st, int elm) {
        System.out.println(st);
        if (st.isEmpty() || elm > st.lastElement()){
            st.addElement(elm);
            return;
        }
        int temp = st.pop();
        sortedInsert(st, elm);
        st.push(temp);
        System.out.println("+++++++++ "+st);
    }
}
