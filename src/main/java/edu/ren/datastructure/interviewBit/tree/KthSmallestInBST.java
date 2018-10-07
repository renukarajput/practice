package edu.ren.datastructure.interviewBit.tree;

public class KthSmallestInBST {

    int getKthSmallest(BinarySearchTree binarySearchTree, int k) {
        int[] res = new int[1];

        getKthSmallest(binarySearchTree.root, new int[]{k}, res);
        return res[0];
    }

    void getKthSmallest(BinarySearchTree.BinaryTreeNode node, int[] k, int[] res) {
        if (node == null) {
            return;
        }
        if (node.left != null)
            getKthSmallest(node.left, k, res);
        k[0]--;
        if (k[0] == 0) {
            res[0] = node.val;
            return;
        }
        getKthSmallest(node.right, k, res);
    }

}
