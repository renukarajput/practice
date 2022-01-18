package edu.ren.datastructure.interviewBit.tree;

public class BinaryTreeEquals {

    public int isEqual(BinaryTree treeOne, BinaryTree treeTwo) {
        return isEqual(treeOne.root, treeTwo.root);
    }

    private int isEqual(TreeNode nodeOne, TreeNode nodeTwo) {
        if (nodeOne == null && nodeTwo == null) {
            return 1;
        }

        if (nodeOne == null && nodeTwo != null || nodeOne != null && nodeTwo == null) {
            return 0;
        }

        if (nodeOne.val != nodeTwo.val) {
            return 0;
        }
       if(isEqual(nodeOne.left, nodeTwo.left)==1 && isEqual(nodeOne.right, nodeTwo.right)==1){
            return 1;
       }
       return 0;
    }
}
