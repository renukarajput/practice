package edu.ren.datastructure.interviewBit.tree;

public class FindSwappedNodesInBST {
    TreeNode[] get(BinaryTree binaryTree) {
        TreeNode minNode = new TreeNode(Integer.MIN_VALUE);
        TreeNode[] prev = new TreeNode[]{minNode, minNode};
        isBST(binaryTree.root, prev);
        return prev;
    }

    private void isBST(TreeNode node, TreeNode[] prevArr) {
        if (node == null) {
            return;
        }
        isBST(node.right, prevArr);
        if (node.val < prevArr[1].val) { //violated
            if (prevArr[1].val < prevArr[0].val) {//was violated
                prevArr[1] = node;
            } else {
                prevArr[0] = prevArr[1];
                prevArr[1] = node;
            }
        } else if (prevArr[1].val < prevArr[0].val) {
            return;
        }
        isBST(node.right, prevArr);
    }
}
