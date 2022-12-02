package edu.ren.datastructure.interviewBit.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class RightViewOfTree {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = 0;
            for (int i = 0; i < queue.size(); i++) {
                TreeNode top = queue.poll();
                if(size < 1) {
                    result.add(top.val);
                    size++;
                }
                if (top.right != null) {
                    queue.add(root.right);
                }
                if (top.left != null) {
                    queue.add(root.left);
                }
            }
        }
        return result;
    }

    public List<Integer> rightSideViewRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        rightView(root, result, 0);
        return result;
    }

    public void rightView(TreeNode curr, List<Integer> result, int currDepth){
        if (curr == null) {
            return;
        }
        if (currDepth == result.size()) {
            result.add(curr.val);
        }
        rightView(curr.right, result, currDepth + 1);
        rightView(curr.left, result, currDepth + 1);
    }
}
