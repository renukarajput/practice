package edu.ren.datastructure.interviewBit.tree;

import edu.ren.datastructure.list.Stack;

import java.util.ArrayList;
import java.util.List;

public class LCAOfBinaryTree {
    int LCA(BinarySearchTree binarySearchTree, int x, int y) {
        List<BinarySearchTree.BinaryTreeNode> pathOne = getPath(binarySearchTree, x);
        List<BinarySearchTree.BinaryTreeNode> pathTwo = getPath(binarySearchTree, y);
        int firstPathIndex = pathOne.size() - 1;
        int secondPathIndex = pathTwo.size() - 1;
        BinarySearchTree.BinaryTreeNode lca = null;
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

    List<BinarySearchTree.BinaryTreeNode> getPath(BinarySearchTree binarySearchTree, int num) {
        ArrayList<BinarySearchTree.BinaryTreeNode> stack = new ArrayList<>();
        getPathUsingPreOrder(binarySearchTree.root, num, stack);
        return stack;
    }

    boolean getPathUsingPreOrder(BinarySearchTree.BinaryTreeNode node, int num, List<BinarySearchTree.BinaryTreeNode> stack) {
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
