package edu.ren.datastructure.interviewBit.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class PreOrderIterative {

    ArrayList<Integer> preOrder(TreeNode root){

        if(root==null){
            return new ArrayList<>();
        }

        final ArrayList<Integer> arrayList=new ArrayList<>();
        final Deque<TreeNode> stack=new ArrayDeque<>();
        while (true){

            while (root!=null){
                arrayList.add(root.val);
                stack.add(root);
                root=root.left;
            }
            if(stack.isEmpty()){
                break;
            }
            TreeNode top=stack.removeLast();
            if(top.right!=null){
                root=top.right;
            }
        }
        return arrayList;
    }
}
