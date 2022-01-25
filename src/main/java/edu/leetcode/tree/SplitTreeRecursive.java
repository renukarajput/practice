package edu.leetcode.tree;

import edu.ren.datastructure.interviewBit.tree.TreeNode;

public class SplitTreeRecursive  {
    public TreeNode[] splitBST(TreeNode root, int V) {
        if(root == null) return new TreeNode[] {null, null};

        if(root.val <= V) {
            TreeNode[] res = splitBST(root.right, V);
            root.right = null;
            root.right = res[0];
            return new TreeNode[]{root, res[1]};
        } else {
            TreeNode[] res = splitBST(root.left, V);
            root.left = null;
            root.left = res[1];
            return new TreeNode[]{res[0], root};
        }
    }
}