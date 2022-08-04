package com.leetcode.blind75.tree;

import edu.ren.datastructure.interviewBit.tree.TreeNode;

//https://leetcode.com/problems/validate-binary-search-tree/
public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        // 2147483647 is the maximum integer value for which this will fail. hence passing Long
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }
}
