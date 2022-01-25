package edu.ren.datastructure.interviewBit.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class BSTIterator {
  TreeNode root;
   Deque<TreeNode> stack;

  public BSTIterator(BinarySearchTree binarySearchTree) {
        this.root=binarySearchTree.root;
        stack=new ArrayDeque<>();
  }

    protected void fillLeftBranch() {
        while (root!=null){
            stack.add(root);
            root=root.left;
        }
    }

    boolean hasNext(){
    if(root==null&&stack.isEmpty()){
        return false;
    }
      return true;
    }

    int next(){
      fillLeftBranch();
        TreeNode top = stack.removeLast();
        if(top.right!=null){
            root=top.right;
        }
        return top.val;
    }
}
