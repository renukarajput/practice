package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IsInterLeavingOfTwoStringDP extends IsInterleavingOfTwoString {
    //XY Z XZY
    //XT XZ XZXT
    class Retry{
        int i;
        int j;
        int k;

        public Retry(int i, int j, int k) {
            this.i = i;
            this.j = j;
            this.k = k;
        }
    }
    @Override
    protected boolean matches(char[] one, char[] two, char[] pattern) {
        int i = 0, j = 0, k = 0;

        Stack<Retry> retryStack=new Stack<>();
        boolean bothMatch;
        while (k < pattern.length) {
            bothMatch=false;
            if (i < one.length && j < two.length && one[i] == pattern[k] && two[j] == pattern[k]) {
               bothMatch=true;
            }
            if (i < one.length && one[i] == pattern[k]) {
                if(bothMatch){
                    retryStack.push(new Retry(i,j+1,k+1));
                }
                i++;
                k++;
            } else if (j < two.length && two[j] == pattern[k]) {
                if(bothMatch){
                    retryStack.push(new Retry(i+1,j,k+1));
                }
                j++;
                k++;
            } else {
                if(retryStack.isEmpty()){
                    return false;
                }
                Retry retry = retryStack.pop();
                i=retry.i;
                j=retry.j;
                k=retry.k;
            }

        }
        return true;
    }
}
