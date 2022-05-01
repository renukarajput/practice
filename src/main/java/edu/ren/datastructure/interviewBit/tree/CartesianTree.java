package edu.ren.datastructure.interviewBit.tree;

import java.util.List;

public class CartesianTree {
    BinarySearchTree build(List<Integer> list){
        TreeNode root = build(list, 0, list.size() - 1);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.root=root;
        return binarySearchTree;
    }
    TreeNode build(List<Integer> list, int start, int end) {
        if(start>end){
            return null;
        }
        int maxIndex = getMax(list, start, end);
        TreeNode treeNode = new TreeNode(list.get(maxIndex));

        treeNode.left = build(list,start,maxIndex-1);
        treeNode.right = build(list,maxIndex+1,end);
        return treeNode;
    }

    private int getMax(List<Integer> list, int start, int end) {
        int max = list.get(start), maxIndex = start;
        for (int i = start+1; i <= end; i++) {
            if (max < list.get(i)) {
                max = list.get(i);
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
