package com.leetcode.blind75.tree;

import edu.ren.datastructure.interviewBit.tree.TreeNode;

//https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class MaxDepthOfTree {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
