package com.leetcode;

import edu.ren.datastructure.interviewBit.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new LinkedList();
        if (root == null) {
            return new ArrayList<>();
        }

        List<String> list = new ArrayList<>();
        list.add(String.valueOf(root.val));
        binaryTreePathsRec(root, list, paths);
        return paths;

    }

    private void binaryTreePathsRec(TreeNode root, List<String> currPath, List<String> allPaths) {
        if (root.left != null) {
            currPath.add(String.valueOf(root.left.val));
            binaryTreePathsRec(root.left, currPath, allPaths);
            currPath.remove(currPath.size()-1);
        }
        if (root.right != null) {
            currPath.add(String.valueOf(root.right.val));
            binaryTreePathsRec(root.right, currPath, allPaths);
            currPath.remove(currPath.size()-1);
        }
        if(root.left == null && root.right == null) {
            StringJoiner joiner=new StringJoiner("->");
            currPath.forEach(x->joiner.add(x));
            allPaths.add(joiner.toString());
        }
        System.out.println(allPaths);
    }
}
