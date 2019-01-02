package edu.ren.datastructure.interviewBit.tree;

public class BinarySearchTree extends BinaryTree{

    void insert(int val) {
        if (root == null) {
            root = new TreeNode(val);
            return;
        }
        root.insert(val);

    }

    public static BinarySearchTree fromArray(int[] nodes) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        for (int node : nodes) {
            binarySearchTree.insert(node);
        }
        return binarySearchTree;
    }

    public boolean isBst(){
        return  isBst(root,null);
    }

    private boolean isBst(TreeNode root,TreeNode prev) {
        if(root==null){
            return true;
        }
        isBst(root.left,prev);

        return false;
    }

}
