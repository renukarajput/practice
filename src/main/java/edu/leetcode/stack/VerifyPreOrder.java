package edu.leetcode.stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class VerifyPreOrder {
    public boolean verifyPreorder(int[] preorder) {
        if(preorder.length == 0) return true;

        int limit = Integer.MIN_VALUE;
        Deque<Integer> stack = new ArrayDeque<>();
        stack.add(preorder[0]);

        for(int i = 1; i < preorder.length; i++) {

            if(preorder[i] < limit) return false;

            if(preorder[i] > stack.peek()) {

                int parent = stack.peek();
                while(!stack.isEmpty() && preorder[i] > stack.peek()) {
                    parent = stack.pop();
                    limit = parent;
                }
            }

            stack.push(preorder[i]);
        }
        return true;
    }

    public boolean verifyPreorder_incorrect(int[] preorder) {
        List<Integer> stack = new ArrayList<>();
        stack.add(preorder[0]);
        int top;
        int grandParent;
        int limitMinInSubtree=0;

        for (int i = 1; i < preorder.length;) {
            if (stack.isEmpty()) {
                return false;
            }
            top = stack.get(stack.size() - 1);
            int element = preorder[i];
            if (element == top)
                return false;

            if (stack.size() > 1) {
                grandParent = stack.get(stack.size() - 2);
            } else {
                grandParent = 0;
            }
            if(element<limitMinInSubtree)return false;

            if (element < top) {
                if (grandParent == 0 || top < grandParent || (top > grandParent && element > grandParent)) {
                    stack.add(element);
                    i++;
                } else {
                    return false;

                }
            } else {
                limitMinInSubtree=top; //node-->rightchild--(left subtree,right subtree)
                if (grandParent == 0 || (top < grandParent && element < grandParent) || top > grandParent) {
                    stack.add(element);
                    i++;
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    stack.remove(stack.size() - 1);
                }

            }

        }
        return true;

    }
}

