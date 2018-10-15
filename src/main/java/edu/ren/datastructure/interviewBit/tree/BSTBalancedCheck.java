package edu.ren.datastructure.interviewBit.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BSTBalancedCheck {

    boolean isBalanced(BinarySearchTree binarySearchTree) {
      return isBalanced(binarySearchTree.root,new HashMap<>());
    }


    private boolean isBalanced_(TreeNode root) {
        if(root==null){
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        int leftHeight = new MaximumDepthOfBST().maxDepth(root.left);
        int rightHeight = new MaximumDepthOfBST().maxDepth(root.right);
        boolean isBalanced = false;
        if (Math.abs(leftHeight - rightHeight) <= 1) {
            isBalanced = true;
        }
        return isBalanced && isBalanced_(root.left) && isBalanced_(root.right);
    }

    private boolean isBalanced(TreeNode root, Map<TreeNode,Integer> nodeMaxHeightMap) {
        if(root==null){
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        int leftHeight=0,rightHeight=0;
        if(root.left!=null) {
            if(nodeMaxHeightMap.containsKey(root.left)) {
                nodeMaxHeightMap.get(root.left);
            }else {
                leftHeight = new MaximumDepthOfBST().maxDepth(root.left);
            }
        }
        if(root.right!=null) {
            if(nodeMaxHeightMap.containsKey(root.right)) {

            }else{
                rightHeight = new MaximumDepthOfBST().maxDepth(root.right);
            }
        }
        int maxHeight=Math.max(leftHeight,rightHeight);
        nodeMaxHeightMap.put(root,maxHeight);
        boolean isBalanced = false;
        if (Math.abs(leftHeight - rightHeight) <= 1) {
            isBalanced = true;
        }
        return isBalanced && isBalanced(root.left,nodeMaxHeightMap) && isBalanced(root.right,nodeMaxHeightMap);
    }
}
