package edu.ren.datastructure.interviewBit.tree;

public class BinaryTree {
    protected TreeNode root;

    public static BinaryTree withRoot(TreeNode root){
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.root=root;
        return binaryTree;
    }
    public static BinaryTree buildFromLevelOrder(int[] arr){
        BinarySearchTree fromArray = new TreeFromBFS().createFromArray(arr);
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.root=fromArray.root;
        return binaryTree;
    }

    public TreeNode getRoot(){
        return root;
    }

}
