package edu.leetcode.tree;

import edu.ren.datastructure.interviewBit.tree.TreeNode;

public class CountOfUniValueSubTrees {
    public int countUnivalSubtrees(TreeNode root) {
        int[] sum={0};
        countUnivalSubtrees(root,sum);
        return sum[0];
    }

     TreeNode countUnivalSubtrees(TreeNode root,int[]sum) {
        if(root==null)
            return null;
        if(root.left==null && root.right==null){
            sum[0]+=1;
            return root;
        }
        TreeNode left=countUnivalSubtrees(root.left,sum);
        TreeNode right=countUnivalSubtrees(root.right,sum);

        boolean isLeft=false;
        if(root.left==null || left!=null && left.val==root.val){
            isLeft=true;
        }
        boolean isUni=false;
        if(root.right==null ||right!=null && right.val==root.val){
            if(isLeft){
                sum[0]+=1;
                isUni=true;
            }
        }
        return isUni?root:null;
    }
}
