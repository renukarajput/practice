package edu.ren.datastructure.interviewBit.tree;

import java.util.ArrayList;
import java.util.List;

public class PathSumExists {

    boolean sumExists(BinarySearchTree binarySearchTree, int sum) {
        return sumExists(binarySearchTree.root, sum);
    }

    private boolean sumExists(TreeNode root, int sum) {
        List<Integer> stack = new ArrayList<>();
        return sumExists(root, sum, new int[]{0}, stack);
    }



    private boolean sumExists(TreeNode root, final int sum, int[] currentSum, List<Integer> stack) {

        if (root == null) {
            return false;
        }
        currentSum[0] = currentSum[0] + root.val;
        stack.add(0, root.val);

        if (root.left == null && root.right == null) {
            if (currentSum[0] == sum) {
                return true;
            }
            return false;
        }
        boolean sumExists = false;
        if (root.left != null) {
            sumExists = sumExists(root.left, sum, currentSum, stack);
            if(!sumExists){
                Integer removed = stack.remove(0);
                System.out.println(removed);
                currentSum[0] = currentSum[0] - removed;
            }
        }
        if (!sumExists && root.right != null) {
            sumExists = sumExists(root.right, sum, currentSum, stack);
            if(!sumExists){
                Integer removed = stack.remove(0);
                System.out.println(removed);
                currentSum[0] = currentSum[0] - removed;
            }
        }

        return sumExists;
    }

}
