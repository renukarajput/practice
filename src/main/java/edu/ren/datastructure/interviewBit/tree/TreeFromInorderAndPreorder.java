package edu.ren.datastructure.interviewBit.tree;

import sun.text.bidi.BidiBase;

import java.util.ArrayList;

public class TreeFromInorderAndPreOrder {
    public BinaryTree buildFrom(ArrayList<Integer> preOrder, ArrayList<Integer> inOrder){
        TreeNode root = construct(preOrder, inOrder,0,inOrder.size()-1);
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root=root;
        return binaryTree;
    }
    private TreeNode construct(ArrayList<Integer> preOrder, ArrayList<Integer> inOrder,int start,int end) {
        if(start>end||preOrder.isEmpty()){
            return null;
        }
        Integer rootVal = preOrder.get(0);
        preOrder.remove(0);
        int indexInInorder=getIndexInOrder(rootVal,inOrder,start,end);
        TreeNode root=new TreeNode(rootVal);
        root.left=construct(preOrder,inOrder,start,indexInInorder-1);
        root.right=construct(preOrder,inOrder,indexInInorder+1,end);
        return root;
    }

    private int getIndexInOrder(int root,ArrayList<Integer> inOrder,int start,int end) {
      int maxIndex=-1;
        for (int i = start; i <= end; i++) {
            if(inOrder.get(i)==root){
               maxIndex=i;
                break;
            }
        }
        return maxIndex;
    }
}
