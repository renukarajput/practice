package edu.ren.datastructure.interviewBit.tree;

import java.util.ArrayList;
import java.util.List;

public class PathSumExistsInAllPaths {

    List<List<Integer>> getAllPaths(BinarySearchTree binarySearchTree, int sum) {
        List<Integer> stack = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        fillPathsHavingSum(binarySearchTree.root, sum, new int[]{0}, stack, result);
        return result;
    }

    private boolean fillPathsHavingSum(TreeNode root, final int sum, int[] currentSum, List<Integer> stack, List<List<Integer>> allPaths) {

        if (root == null) {
            return false;
        }
        currentSum[0] = currentSum[0] + root.val;
        stack.add(0, root.val);

        if (root.left == null && root.right == null) {
            if (currentSum[0] == sum) {
                allPaths.add(new ArrayList<>(stack));
                return true;
            }
            return false;
        }
        boolean sumExists = false;
        if (root.left != null) {
            sumExists = fillPathsHavingSum(root.left, sum, currentSum, stack, allPaths);

            Integer removed = stack.remove(0);
            currentSum[0] = currentSum[0] - Math.abs(removed);

        }

        if (root.right != null) {
            sumExists = fillPathsHavingSum(root.right, sum, currentSum, stack, allPaths);
            Integer removed = stack.remove(0);
            currentSum[0] = currentSum[0] - Math.abs(removed);
        }


        return sumExists;
    }
}
