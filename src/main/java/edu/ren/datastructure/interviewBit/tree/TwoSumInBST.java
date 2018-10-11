package edu.ren.datastructure.interviewBit.tree;

public class TwoSumInBST {
    boolean twoSum(BinarySearchTree binarySearchTree, int sum) {
        return twoSum(binarySearchTree.root, sum);
    }

    boolean twoSum(TreeNode treeNode, int sum) {
        int minSumWithoutLeft = treeNode.val, maxSumWithoutRight = treeNode.val;
        if (treeNode.right == null) {
            minSumWithoutLeft = treeNode.val + treeNode.right.val;
        }

        if (treeNode.left != null) {
            maxSumWithoutRight = treeNode.val + treeNode.left.val;
        }
        if (sum <= minSumWithoutLeft) {
            return twoSum(treeNode.right, sum - treeNode.right.val);
        }
    return false;
    }

}
