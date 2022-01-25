package edu.ren.datastructure.interviewBit.tree;

public class InvertBinaryTree {

    void invert(BinarySearchTree binarySearchTree){
        invert(binarySearchTree.root);
    }

    private void invert(TreeNode root) {
        if(root==null){
            return;
        }
        invert(root.left);
        invert(root.right);
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
    }
}
