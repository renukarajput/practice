package edu.leetcode.tree;

import edu.ren.datastructure.interviewBit.tree.BinaryTree;
import edu.ren.datastructure.interviewBit.tree.BinaryTreePrinter;
import edu.ren.datastructure.interviewBit.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class TiltOfTree {
    public static void main(String[] args) {
        int arr[] = {1,2,-1,3,-1,4,-1,5};
        BinaryTree binaryTree = BinaryTree.buildFromLevelOrder(arr);
        TreeNode root = binaryTree.getRoot();
        BinaryTreePrinter.printNode(root);
        int res = new TiltOfTree().findTilt(root);
        System.out.println(res);
    }

    public int findTilt(TreeNode root) {
        Map<TreeNode,Integer> sumCache=new HashMap<>();
       return findTiltOfNode(root,sumCache)+findTiltOfNode(root.getLeft(),sumCache)+findTiltOfNode(root.getRight(),sumCache);
    }

    public int findTiltOfNode(TreeNode root,Map<TreeNode,Integer> sumCache) {
        if(root==null)
            return 0;
        return Math.abs(sum(root.getLeft(),sumCache)-sum(root.getRight(),sumCache));
    }

    public int sum(TreeNode root, Map<TreeNode,Integer> sumCache) {
        if(sumCache.containsKey(root))
            return sumCache.get(root);
        if(root==null)
            return 0;
        int sum=root.getVal()+sum(root.getLeft(),sumCache)+sum(root.getRight(),sumCache);
        sumCache.put(root,sum);
        return sum;
    }
}
