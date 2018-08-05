package edu.ren.datastructure.stack;

import java.util.Stack;

public class SortStack {

    // Recursive sorting of stack

    public static void sortStackRecursively(Stack<Integer> st) {
        if (!st.isEmpty()) {
            int temp = st.pop();
            sortStackRecursively(st);
            sortedInsertionRecursively(st, temp);
        }
    }

    private static void sortedInsertionRecursively(Stack<Integer> st, int elm) {
        if (st.isEmpty() || elm > st.peek()) {
            st.push(elm);
            return;
        }
        int temp = st.pop();
        sortedInsertionRecursively(st, elm);
        st.push(temp);
    }

    public static void sortStackInAscendingOrder(Stack<Integer> stack) {
        sortStack(stack, SortOrder.ASCENDING);
    }

    public static void sortStackInDescendingOrder(Stack<Integer> stack) {
        sortStack(stack, SortOrder.DESCENDING);
    }

    private static void sortStack(Stack<Integer> stack, SortOrder sortOrder) {
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            Integer elm = stack.pop();

            while (!tempStack.isEmpty() && sortOrder.compare(elm, tempStack.peek())) {
                Integer top = tempStack.pop();
                stack.push(top);
            }
            tempStack.push(elm);
        }
        while (!tempStack.isEmpty()) {
            Integer element = tempStack.pop();
            stack.push(element);
        }
    }

    enum SortOrder {
        ASCENDING {
            @Override
            boolean compare(int elementOne, int elementTwo) {
                return Integer.compare(elementOne, elementTwo) >= 0;
            }
        },

        DESCENDING {
            @Override
            boolean compare(int elementOne, int elementTwo) {
                return ASCENDING.compare(elementTwo, elementOne);
            }
        };

        abstract boolean compare(int elementOne, int elementTwo);
    }
}