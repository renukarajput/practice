package edu.ren.datastructure.interviewBit.tree;

public class BinaryTreeEqualsSymmetric {


    int isEqual(BinarySearchTree tree) {
        return isEqual(tree.root);
    }
    private int isEqual(TreeNode nodeOne){
        if(nodeOne==null){
            return 0;
        }
        return isEqual(nodeOne.left,nodeOne.right);
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
