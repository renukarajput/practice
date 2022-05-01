package edu.ren.datastructure.interviewBit.tree;

import java.util.ArrayList;
import java.util.List;

public class LCAOfBinaryTree {
    int LCA(BinarySearchTree binarySearchTree, int x, int y) {
        List<TreeNode> pathOne = getPath(binarySearchTree, x);
        List<TreeNode> pathTwo = getPath(binarySearchTree, y);
        int firstPathIndex = pathOne.size() - 1;
        int secondPathIndex = pathTwo.size() - 1;
        TreeNode lca = null;
        while (firstPathIndex >= 0 && secondPathIndex >= 0 && pathOne.get(firstPathIndex) == pathTwo.get(secondPathIndex)) {
            lca = pathOne.remove(firstPathIndex);
            pathTwo.remove(secondPathIndex);
            firstPathIndex--;
            secondPathIndex--;
        }
        if (lca != null)
            return lca.val;
        return -1;
    }

    List<TreeNode> getPath(BinarySearchTree binarySearchTree, int num) {
        ArrayList<TreeNode> stack = new ArrayList<>();
        getPathUsingPreOrder(binarySearchTree.root, num, stack);
        return stack;
    }

    boolean getPathUsingPreOrder(TreeNode node, int num, List<TreeNode> stack) {
        if (node == null) {
            return false;
        }
        stack.add(0, node);
        if (node.val == num) {
            return true;
        }
        boolean isFound = false;
        if (node.left != null) {
            isFound = getPathUsingPreOrder(node.left, num, stack);
        }

        if (node.right != null && !isFound) {
            isFound = getPathUsingPreOrder(node.right, num, stack);
        }

        if (!isFound) {
            stack.remove(0);
        }
        return isFound;

    }
}
