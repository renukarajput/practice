package edu.ren.datastructure.interviewBit.tree;

public class MinimumDepthOfBST {

    int minDepth(BinarySearchTree binarySearchTree) {
        return minDepth(binarySearchTree.root);
    }

    private int minDepth(TreeNode node) {
        if (node.left == null && node.right == null) {
            return 1;
        }
        int minLeft = Integer.MAX_VALUE, minRight = Integer.MAX_VALUE;

        if (node.left != null) {
            minLeft = minDepth(node.left) + 1;
        }

        if (node.right != null) {
            minRight = minDepth(node.right) + 1;
        }
        return Math.min(minLeft, minRight);
    }
}
