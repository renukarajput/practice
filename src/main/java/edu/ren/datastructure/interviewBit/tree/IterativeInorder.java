package edu.ren.datastructure.interviewBit.tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class IterativeInorder {
    ArrayList<Integer> inorder(BinarySearchTree binarySearchTree) {
        return inorder(binarySearchTree.root);
    }

    ArrayList<Integer> inorder(TreeNode node) {
        LinkedList<TreeNode> pathStack = new LinkedList<>();
        final ArrayList<Integer> inorderResult = new ArrayList<>();

        while (true) {
            while (node != null) {
                pathStack.addFirst(node);
                node = node.left;
            }
            if (pathStack.isEmpty()) {
                break;
            }
            TreeNode topNode = pathStack.remove(0);
            inorderResult.add(topNode.val);
            if (topNode.right != null) {
                node=topNode.right;
            }
        }
        return inorderResult;
    }
}
