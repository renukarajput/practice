package edu.ren.datastructure.interviewBit.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class BSTPreOrderIterator {
    TreeNode root;
    Deque<TreeNode> stack;

    public BSTPreOrderIterator(BinarySearchTree binarySearchTree) {
        this.root = binarySearchTree.root;
        stack = new ArrayDeque<>();
        stack.push(root);
    }

    protected TreeNode fillLeftBranch() {
       TreeNode next=root;
        if (root != null) {
            stack.push(root);
            root = root.left;
        }
        return next;
    }

    boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        }
        return true;
    }

    int next() {
        TreeNode top = stack.pop();
        if (top.right != null) {
            stack.push(top.right);
        }
        if (top.left != null) {
            stack.push(top.left);
        }
        return top.val;
    }
}
