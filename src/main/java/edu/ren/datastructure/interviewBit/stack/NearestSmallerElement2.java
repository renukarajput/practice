package edu.ren.datastructure.interviewBit.stack;

import java.util.ArrayList;
import java.util.Stack;

public class NearestSmallerElement2 {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {
        ArrayList<Integer> retval=new ArrayList<>();
        Stack<Integer> st= new Stack<>();

        for(int i=0;i<arr.size();++i){
            while(!st.isEmpty() && arr.get(i)<=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                retval.add(-1);
            }
            else{
                retval.add(st.peek());
            }
            st.add(arr.get(i));
        }

        return retval;
    }
}
