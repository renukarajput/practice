package edu.ren.misc.problems;

/**
 * Created by rrn3194 on 6/1/16.
 */

import org.junit.Test;

import java.util.Stack;

public class StackSortTest {

        @Test
        public void sortAscending(){
            Stack<Integer> stack=new Stack();
            stack.push(8);
            stack.push(6);
            stack.push(9);
            stack.push(14);
            stack.push(25);
            System.out.println(stack);
            SortStack.sortStack(stack);
            System.out.println(stack);
        }

    }
