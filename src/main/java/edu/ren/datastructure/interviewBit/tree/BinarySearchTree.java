package edu.ren.datastructure.interviewBit.tree;

public class BinarySearchTree {
    TreeNode root;

    void insert(int val) {
        if (root == null) {
            root = new TreeNode(val);
            return;
        }
        root.insert(val);

    }

}
