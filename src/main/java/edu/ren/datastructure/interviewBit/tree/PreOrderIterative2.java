package edu.ren.datastructure.interviewBit.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class PreOrderIterative2 extends PreOrderIterative {
    @Override
    ArrayList<Integer> preOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        final ArrayList<Integer> arrayList = new ArrayList<>();
        final Deque<TreeNode> stack = new ArrayDeque<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode top = stack.removeLast();
            arrayList.add(top.val);
            if (top.right != null) {
                stack.add(top.right);
            }
            if (top.left != null) {
                stack.add(top.left);
            }

        }
        return super.preOrder(root);
    }
}
