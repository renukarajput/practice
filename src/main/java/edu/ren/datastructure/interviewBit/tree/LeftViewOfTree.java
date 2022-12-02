package edu.ren.datastructure.interviewBit.tree;

import java.util.ArrayList;
import java.util.List;

public class LeftViewOfTree {
    public List<Integer> leftSideViewRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        leftView(root, result, 0);
        return result;
    }

    private void leftView(TreeNode root, List<Integer> result, int currDepth) {
        if (root == null) {
            return;
        }
        if (currDepth == result.size()) {
            result.add(root.val);
        }
        leftView(root.left , result, currDepth+1);
        leftView(root.right , result, currDepth+1);
    }
}
