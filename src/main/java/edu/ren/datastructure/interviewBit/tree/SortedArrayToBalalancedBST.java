package edu.ren.datastructure.interviewBit.tree;

import java.util.ArrayList;

public class SortedArrayToBalalancedBST {

    public BinaryTree fromSortedArray(final ArrayList<Integer> list){
        TreeNode treeNode = fromSortedArray(list, 0, list.size() - 1);
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.root=treeNode;
        return binaryTree;
    }

    private TreeNode fromSortedArray(ArrayList<Integer> list,int start,int end){
        if(start>end){
            return null;
        }
        int mid=start+(end-start)/2;
        TreeNode root=new TreeNode(list.get(mid));
        root.left=fromSortedArray(list,start,mid-1);
        root.right=fromSortedArray(list,mid+1,end);
        return root;
    }
}
