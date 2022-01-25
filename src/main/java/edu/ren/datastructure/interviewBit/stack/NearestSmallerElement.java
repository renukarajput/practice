package edu.ren.datastructure.interviewBit.stack;

import java.util.*;

public class NearestSmallerElement {

   public int[] nextSmallest(int[] arr) {
        int[] nextSmallest = new int[arr.length];
        Arrays.fill(nextSmallest,-1);
       ArrayDeque<Integer> stack = new ArrayDeque<>(arr.length);
        stack.addFirst(arr.length-1);
        for (int i = arr.length - 2; i >= 0; i--) {
            int top = stack.peek();
            while (arr[top]>arr[i]){
                nextSmallest[top]=arr[i];
                stack.remove();
                if(stack.isEmpty()){
                    break;
                }
                top=stack.peek();
            }
            stack.addFirst(i);
        }
        return nextSmallest;
    }
}
