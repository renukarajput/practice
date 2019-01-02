package edu.ren.datastructure.interviewBit.tree;

public class PathSumExistsOptimised extends PathSumExists {
    @Override
    boolean sumExists(BinarySearchTree binarySearchTree, int sum) {
        return sumExists(binarySearchTree.root, sum);
    }

    boolean sumExists(TreeNode treeNode, int sum) {
        if (treeNode == null) {
            return false;
        }
        if (treeNode.left == null && treeNode.right == null && treeNode.val == sum) {
            return true;
        }
        if (sumExists(treeNode.left, sum - treeNode.val) || sumExists(treeNode.right, sum - treeNode.val)) {
            return true;
        }
        return false;
    }
}
