package edu.ren.datastructure.interviewBit.tree;

public class FlattenBinaryTree {
    TreeNode flatten(BinaryTree binaryTree) {
        TreeNode root = binaryTree.root;
         flatten(root);
         return root;
    }

    private TreeNode flatten(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root;
        }
        final TreeNode existingLeft = root.left;
        final TreeNode existingRight = root.right;

        TreeNode leftResult = null, rightResult = null;
        if (existingLeft != null) {
            leftResult = flatten(existingLeft);
            root.left = null;
            root.right = existingLeft;
        }
        if (existingRight != null) {
            if(leftResult!=null) {
                leftResult.right = existingRight;
            }
            rightResult = flatten(existingRight);
        }

        if (rightResult != null) {
           // rightResult.right=existingRight;
            return rightResult;
        }
        return leftResult;
    }

}
