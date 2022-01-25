package edu.leetcode.tree;

import edu.ren.datastructure.interviewBit.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

//4(2(3)(1))(6(5))
public class TreeFromString {
    int start;

    public TreeNode str2tree(String s){
        Deque<TreeNode> stack=new ArrayDeque<>();
        TreeNode root=null;
        boolean isNegative;
        for (int i = 0; i <s.length() ; i++) {
            isNegative=false;
            if(s.charAt(i)=='-'){
                isNegative=true;
                i++;
            }
            if (Character.isDigit(s.charAt(i))){
                int num = Character.getNumericValue(s.charAt(i));
                if(isNegative)
                    num=num*-1;
                TreeNode node = new TreeNode(num);
                stack.addLast(node);
                if(!isNegative&& i==0||isNegative && i==1){
                    root=node;
                }
            }else if(s.charAt(i)==')'){
                TreeNode popped = stack.removeLast();
                TreeNode top = stack.getLast();
                if(top.left==null){
                    top.left=popped;
                }else if(top.right==null){
                    top.right=popped;
                }
            }

        }
        return root;
    }

    TreeNode str2tree(String s,int balance) {
        start++;
        if (start >= s.length()||balance==0)
            return null;
        if (s.charAt(start) == '(')
            return str2tree(s,balance+1);
        if (s.charAt(start) == ')')
            return str2tree(s,balance+1);

        TreeNode node = new TreeNode(Character.getNumericValue(s.charAt(start)));
        TreeNode leftChild = str2tree(s,balance);
        TreeNode rightChild = str2tree(s,balance);
        node.left = leftChild;
        node.right = rightChild;
        return node;

    }
}
