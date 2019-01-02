package edu.ren.datastructure.interviewBit.tree;


import java.util.*;

public class VerticalBSTTraversal {
    Map<Integer, ArrayList<Integer>> horizonIndexToNodes = new TreeMap<>();

    ArrayList<ArrayList<Integer>> getVerticalNodeValues(BinarySearchTree binarySearchTree) {
        computeInPreOrder(binarySearchTree);
        final ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        horizonIndexToNodes.forEach((k, v) -> result.add(v));
        return result;
    }

    private void computeInPreOrder(BinarySearchTree binarySearchTree) {
        computeInPreOrder(binarySearchTree.root, 0,0);
    }

    private void computeInPreOrder(TreeNode treeNode, int count, int level) {
        if(treeNode==null){
            return;
        }
        horizonIndexToNodes.putIfAbsent(count, new ArrayList<>());
        horizonIndexToNodes.get(count).add(treeNode.val);
        computeInPreOrder(treeNode.left, count - 1,level+1);
        computeInPreOrder(treeNode.right, count + 1,level+1);
    }
}
