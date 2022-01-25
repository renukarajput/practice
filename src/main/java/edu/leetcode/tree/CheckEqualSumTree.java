package edu.leetcode.tree;

import edu.ren.datastructure.interviewBit.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class CheckEqualSumTree {
    boolean result = false;

    public boolean checkEqualTree(TreeNode root) {
        result = false;
        int sum = sum(root);
        if (sum % 2 != 0)
            return false;
        Map<TreeNode, Integer> sumMap = new HashMap<>();
        checkEqualTree(root, null, sum / 2, sumMap);
        return result;
    }

    int sum(TreeNode root) {
        if (root == null)
            return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    public int checkEqualTree(TreeNode root, TreeNode parent, int sumToFind, Map<TreeNode, Integer> sumMap) {

        if (parent != null && sumMap.containsKey(parent)) {
            int parentSum = sumMap.get(parent);
            if (parentSum == sumToFind && root != null) {
                result = true;
                return sumToFind;
            }
        }
        if (root == null)
            return 0;
        int leftSubtreeSum = checkEqualTree(root.left, root, sumToFind, sumMap);
        if (leftSubtreeSum + root.val == sumToFind && root.right != null || (leftSubtreeSum == sumToFind&&root.left!=null)) {
            result = true;
            return sumToFind;
        }
        sumMap.put(root, leftSubtreeSum + root.val);
        return root.val + leftSubtreeSum + checkEqualTree(root.right, root, sumToFind, sumMap);
    }
}
