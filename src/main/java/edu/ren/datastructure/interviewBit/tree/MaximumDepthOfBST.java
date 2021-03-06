package edu.ren.datastructure.interviewBit.tree;

public class MaximumDepthOfBST {
    public int maxDepth(BinarySearchTree binarySearchTree) {
        return maxDepth(binarySearchTree.root);
    }

    protected int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int maxLeft = maxDepth(node.left) + 1;
        int maxRight = maxDepth(node.right) + 1;
        return Math.max(maxLeft, maxRight);
    }
}
