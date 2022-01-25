package edu.ren.datastructure.interviewBit.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SumToLeafRecursiveOptimised extends SumRootToLeafRecursive {
    private static final int MODULO_NUM = 1003;

    private List<Deque<Integer>> getAllPaths(TreeNode treeNode) {
        final List<Deque<Integer>> paths = new ArrayList<>();
        allPaths(treeNode, paths, new ArrayDeque<>(), new int[]{0}, new int[]{0});
        return paths;
    }

    private void allPaths(TreeNode root, List<Deque<Integer>> paths, Deque<Integer> currentPath, int[] quotient, int[] remainder) {
        if (root == null) {
            return;
        }
        currentPath.add(root.val);
        if (currentPath.size() == 4) {
            int pathValueAsInt = getPathValueAsInt(currentPath);
            int newQuotient = pathValueAsInt / MODULO_NUM;
            int newRemainder = pathValueAsInt % MODULO_NUM;
            int quotientDiff = Math.max(quotient[0], newQuotient) - Math.min(quotient[0], newQuotient);
            remainder[0] = (MODULO_NUM * quotientDiff + newRemainder + remainder[0]) % MODULO_NUM;
            quotient[0] = Math.min(quotient[0], newQuotient);

        }
        if (root.left == null && root.right == null) {
            paths.add(new ArrayDeque<>(currentPath));
        }
        if (root.left != null) {
            //allPaths(root.left, paths, currentPath);
            currentPath.removeLast();
        }
        if (root.right != null) {
          //  allPaths(root.right, paths, currentPath);
            currentPath.removeLast();
        }

    }

    private int getPathValueAsInt(Deque<Integer> currentPath) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : currentPath) {
            stringBuilder.append(i);
        }
        return Integer.valueOf(stringBuilder.toString());
    }
}
