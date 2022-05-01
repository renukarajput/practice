package edu.ren.datastructure.interviewBit.tree;

public class BinaryTreeEqualsImage {

    int isEqual(BinarySearchTree treeOne, BinarySearchTree treeTwo) {
        return isEqual(treeOne.root, treeTwo.root);
    }

    private int isEqual(TreeNode nodeOne, TreeNode nodeTwo) {
        if (nodeOne == null && nodeTwo == null) {
            return 1;
        }

        if (nodeOne == null && nodeTwo != null || nodeOne != null && nodeTwo == null) {
            return 0;
        }


        if(isEqual(nodeOne.left, nodeTwo.left)==1 && isEqual(nodeOne.right, nodeTwo.right)==1){
            return 1;
        }
        return 0;
    }
}
