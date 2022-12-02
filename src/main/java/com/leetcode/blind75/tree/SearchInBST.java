package com.leetcode.blind75.tree;

import edu.ren.datastructure.interviewBit.tree.TreeNode;

public class SearchInBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null || root.val == val) {
            return root;
        }
        return root.val > val ? searchBST(root.left, val) : searchBST(root.right, val);
    }
}
