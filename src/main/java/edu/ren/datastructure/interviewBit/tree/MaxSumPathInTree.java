package edu.ren.datastructure.interviewBit.tree;

import java.util.HashMap;
import java.util.Map;

public class MaxSumPathInTree {

    int getMaxSum(BinaryTree binaryTree) {
        final int[] maxSums = getMaxSum(binaryTree.root, new HashMap<>());
        return Math.max(maxSums[0], maxSums[1]);
    }

    private int[] getMaxSum(TreeNode root, Map<TreeNode, int[]> cache) {
        if (root== null) {
            return new int[]{0, 0};
        }
        final int maxSumInLeft[] = cache.getOrDefault(root, getMaxSum(root.left, cache));
        final int maxSumInRight[] = cache.getOrDefault(root, getMaxSum(root.right, cache));
        final int maxOfLeftRight = Math.max(maxSumInLeft[0], maxSumInRight[0]);
        int maxExtensible = root.val + maxOfLeftRight;
        if(root.left!=null) {
            maxExtensible = Math.max(maxExtensible, maxSumInLeft[1]);
        }
        if(root.right!=null) {
            maxExtensible = Math.max(maxExtensible, maxSumInRight[1]);
        }
        int maxExclusive = root.val + maxSumInLeft[0] + maxSumInRight[0];

         int[] result = {maxExtensible, maxExclusive};
        cache.putIfAbsent(root, result);
        return result;
    }
}
