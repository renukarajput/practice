package edu.ren.datastructure.interviewBit.tree;

public class BinarySearchTree {
    BinaryTreeNode root;

    void insert(int val) {
        if (root == null) {
            root = new BinaryTreeNode(val);
            return;
        }
        root.insert(val);

    }

    public class BinaryTreeNode {
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;

        public BinaryTreeNode(int val) {
            this.val = val;
        }

        void insert(int val){
            if(this.val >val){
                if(left!=null){
                    left.insert(val);
                }else {
                    left=new BinaryTreeNode(val);
                }
            }else {
                if(right!=null){
                    right.insert(val);
                }else {
                    right=new BinaryTreeNode(val);
                }
            }
        }
    }
}
