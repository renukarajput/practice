package edu.ren.datastructure.interviewBit.tree;


public class TwoSumInBST {
    boolean twoSum(BinarySearchTree binarySearchTree, int sum) {
        return twoSum(binarySearchTree.root,binarySearchTree.root, sum);
    }

   private boolean twoSum(TreeNode treeNode,final TreeNode root, int sum) {
        if(treeNode==null){
            return false;
        }
        int remainingSum = sum - treeNode.val;
        TreeNode node=search(root,treeNode, remainingSum);
        if(node!=null){
            System.out.println(treeNode.val+" + "+node.val+" = "+sum);
            return true;
        }

        if(twoSum(treeNode.left,root,sum))
            return true;
        if( twoSum(treeNode.right,root,sum))
            return true;
        return false;
    }

   private TreeNode search(TreeNode rootNode, final TreeNode pair,int num) {
        if (rootNode == null) {
            return null;
        }
        if (rootNode.val == num && rootNode!=pair) {
            return rootNode;
        }
        if (rootNode.val < num) {
            return search(rootNode.right,rootNode, num);
        }
        return search(rootNode.left,rootNode, num);
    }

}
