package edu.ren.datastructure.interviewBit.tree;

public class FindSwappedNodesInBST {
    TreeNode[] get(BinaryTree binaryTree) {
        TreeNode[] prev = new TreeNode[]{null};
        TreeNode[] res = new TreeNode[]{null, null};
        isBST(binaryTree.root, res, prev);
        return res;
    }

    private void isBST(TreeNode node, TreeNode[] res, TreeNode[] prev) {
        if (node == null) {
            return;
        }

        isBST(node.left, res, prev);
        if (prev[0] != null) {
           // System.out.println(prev[0].val + "-" + node.val);
        }


        if (prev[0] != null && node.val < prev[0].val) {

            if (res[0] == null) {
                res[0] = prev[0];
                res[1]=node;
            } else {
                res[1] = node;
            }
        }
        prev[0] = node;

        isBST(node.right, res, prev);
    }
}
