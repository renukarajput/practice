package edu.leetcode.tree;

import edu.ren.datastructure.interviewBit.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class EqualChildSumNode {

    public int equalToDescendants(TreeNode root) {
        Map<TreeNode, Integer> sumCache = new HashMap<>();
        return countEqual(root, sumCache);
    }

    int countEqual(TreeNode root, Map<TreeNode, Integer> cache) {
        if (root == null) {
            return 0;
        }

        int r = 0;
        int leftSum = sum(root.left, cache);
        cache.put(root.left,leftSum);
        int rightSum = sum(root.right, cache);
        cache.put(root.right,rightSum);
        if (leftSum + rightSum == root.val)
            r = 1;
        return r + countEqual(root.left, cache) + countEqual(root.right, cache);
    }

    int sum(TreeNode root, Map<TreeNode, Integer> cache) {
        if (root == null) {
            return 0;
        }
        if (cache.containsKey(root)) {
            return cache.get(root);
        }
        int ans = root.val + sum(root.left, cache) + sum(root.right, cache);
        return ans;
    }
}