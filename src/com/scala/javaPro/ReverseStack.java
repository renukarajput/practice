package com.scala.javaPro;

import java.util.Stack;

/**
 * Created by rrn3194 on 5/29/16.
 */
public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack();
        s.push(3);
        s.push(2);
        s.push(-1);
        s.push(0);
        s.push(4);
        s.push(-3);
       // printStack(s);
        System.out.println("-->"+s.toString());
        reverseMyStack(s);
        System.out.println("<----->"+s.toString());
        reverseStackUtil(s);
        System.out.println("::::: "+s.toString());
    }


    private static void printStack(Stack<Integer> s) {
       final int size = s.size();
        for (int i = 0; i <=size ; ++i) {
            if (!s.isEmpty()){
                System.out.print(s.pop()+" ");
            }
        }
    }

    private static void reverseMyStack(Stack<Integer> st){
        if (st.isEmpty()){
            return;
        }else{
            int elm = st.pop();
            reverseMyStack(st);
            st.push(elm);
        }
    }

    private static void reverseStackUtil(Stack<Integer> st) {
        if (st.isEmpty()){
            return;
        }else{
            popStack(st);
        }
    }

    private static void popStack(Stack<Integer> s){
        int size =  s.size();
        if (!s.isEmpty()) {
            int elm = s.pop();
            popStack(s);
            s.add(size-1, elm);
        }
    }


}
