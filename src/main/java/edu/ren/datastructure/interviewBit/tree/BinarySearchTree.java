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

    }
