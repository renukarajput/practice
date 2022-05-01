package edu.ren.datastructure.interviewBit.tree;

import java.util.*;

public class AllPathsOfBinaryTree {
    List<Deque<Integer>>  getAllPaths(BinarySearchTree binarySearchTree) {
        final List<Deque<Integer>> paths = new ArrayList<>();
        allPaths(binarySearchTree.root, paths, new ArrayDeque<>());
        return paths;
    }

    private void allPaths(TreeNode root, List<Deque<Integer>> paths, Deque<Integer> currentPath) {
        if (root == null) {
            return;
        }
        currentPath.add(root.val);
        if (root.left == null && root.right == null) {
            paths.add(new ArrayDeque<>(currentPath));
        }
       if(root.left!=null) {
           allPaths(root.left, paths, currentPath);
           currentPath.removeLast();
       }
        if(root.right!=null) {
            allPaths(root.right, paths, currentPath);
            currentPath.removeLast();
        }

    }
}
