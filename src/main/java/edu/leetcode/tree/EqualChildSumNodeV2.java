package edu.leetcode.tree;

import edu.ren.datastructure.interviewBit.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class EqualChildSumNodeV2 extends EqualChildSumNode {
    @Override
    public int equalToDescendants(TreeNode root) {
        int[] count = new int[]{0};
        equalToDescendants(root, count);
        return count[0];
    }

    int equalToDescendants(TreeNode root, int[] count) {
        if (root == null)
            return 0;
        int sum = equalToDescendants(root.left, count) + equalToDescendants(root.right, count);
        if (sum == root.val)
            count[0]++;
        return sum + root.val;
    }
}
