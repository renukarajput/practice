package edu.ren.datastructure.interviewBit.tree;


import java.util.Stack;

public class PathSumExistsOptimised extends PathSumExists {
    @Override
    boolean sumExists(BinarySearchTree binarySearchTree, int sum) {
        return sumExists(binarySearchTree.root, sum);
    }

    boolean sumExists(TreeNode treeNode, int sum) {
        if (treeNode == null) {
            return false;
        }
        if (treeNode.left == null && treeNode.right == null && treeNode.val == sum) {
            return true;
        }
        if (sumExists(treeNode.left, sum - treeNode.val) || sumExists(treeNode.right, sum - treeNode.val)) {
            return true;
        }
        return false;
    }

    /*
        10
       5  6
      1 2 4 7 - target = 17
    */
    boolean hasPathSum(TreeNode root, int targetSum) {
        Stack<Integer> stack = new Stack<>();
        stack.push(root.val);
        int currSum = root.val;
        while (true) {
            if ((root.right == null) && (root.left == null) && (currSum == targetSum))
                return true;
            else {
                Integer top = stack.pop();
                currSum -= top;
            }

            while (root.left != null) {
                int leftVal = root.left.val;
                stack.push(leftVal);
                currSum += leftVal;
            }

            while (root.right != null) {
                int rightVal = root.right.val;
                stack.push(rightVal);
                currSum += rightVal;
            }
            return false;
        }
    }
}
