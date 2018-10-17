package edu.ren.datastructure.interviewBit.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal2 extends PostOrderTraversal{

    @Override
    List<Integer> postOrder(BinarySearchTree binarySearchTree) {
        return postOrder(binarySearchTree.root);
    }

    private List<Integer> postOrder(TreeNode root) {
        final ArrayList<Integer> postOrderList = new ArrayList<>();
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        TreeNode lastRemoved = null;
        while (!stack.isEmpty()||root!=null) {
           if(root!=null){
               stack.addLast(root);
               root=root.left;
           }else {
               TreeNode top = stack.getLast();
               if (top.right != null && top.right != lastRemoved) {
                   root=top.right;
               } else {
                   lastRemoved = stack.removeLast();
                   postOrderList.add(lastRemoved.val);

               }
           }
        }
        return postOrderList;
    }
}
