package edu.ren.datastructure.interviewBit.tree;

import edu.ren.algo.bsearch.BinarySearch;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {
    List<Integer> postOrder(BinaryTree binarySearchTree) {
        return postOrder(binarySearchTree.root);
    }

    private List<Integer> postOrder(TreeNode root) {
        final ArrayList<Integer> postOrderList = new ArrayList<>();
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        stack.add(root);
        TreeNode lastRemoved = null;
        while (!stack.isEmpty()) {
            TreeNode node = stack.getLast();
            if (lastRemoved != node.left && lastRemoved != node.right) {
                while (node.left != null) {
                    node = node.left;
                    stack.add(node);
                }
            }

            TreeNode top = stack.getLast();
            if (top.right != null && top.right != lastRemoved) {
                stack.addLast(top.right);
            } else {
                lastRemoved = stack.removeLast();
                postOrderList.add(lastRemoved.val);

            }
        }
        return postOrderList;
    }
}
