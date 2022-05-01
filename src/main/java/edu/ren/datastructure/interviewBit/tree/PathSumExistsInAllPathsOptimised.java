package edu.ren.datastructure.interviewBit.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

public class PathSumExistsInAllPathsOptimised extends PathSumExistsInAllPaths {
    @Override
    List<List<Integer>> getAllPaths(BinarySearchTree binarySearchTree, int sum) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        List<List<Integer>> result = new ArrayList<>();
        getAllPaths(binarySearchTree.root, sum, stack, result);
        return result;
    }

    private boolean getAllPaths(TreeNode root, int sum, Deque<TreeNode> stack, List<List<Integer>> result) {
        if (root == null) {
            return false;
        }
        stack.add(root);
        if (root.left == null && root.right == null && root.val == sum) {
            List<Integer> collected = stack.stream().map(x -> x.val).collect(Collectors.toList());
            result.add(collected);
            return true;
        }
        boolean foundInLeft=false,foundInRight=false;
        if (root.left != null) {
            foundInLeft=getAllPaths(root.left, sum - root.val, stack, result);
            stack.removeLast();
        }
        if (root.right != null) {
           foundInRight= getAllPaths(root.right, sum - root.val, stack, result);
            stack.removeLast();
        }
        return foundInLeft||foundInRight;
    }
}
