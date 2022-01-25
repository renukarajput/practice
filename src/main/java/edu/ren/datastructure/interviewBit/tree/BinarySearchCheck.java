package edu.ren.datastructure.interviewBit.tree;

public class BinarySearchCheck {

    public boolean isBinarySearchTree(TreeNode root) {
        if (root == null)
            return true;

        if (root.left == null && root.right == null)
            return true;

        if ((root.left != null && ((Comparable) root.left.val).compareTo(root.val) > 0)) {
            return false;
        }

        if ((root.right != null && ((Comparable) root.right.val).compareTo(root.val) < 0)) {
            return false;
        }

        if (maxOfBst(root.left) > root.val) {
            return false;
        }

        if (minOfBst(root.right) < root.val) {
            return false;
        }
        boolean left = isBinarySearchTree(root.left);
        boolean right = isBinarySearchTree(root.right);
        return left && right;
    }

    public int maxOfBst(TreeNode root) {
        while (root.right != null) {
            root = root.right;
        }
        return root.val;
    }

    public int minOfBst(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.val;
    }

    public boolean isBst(TreeNode root, Integer minVal, Integer maxVal) {
        if (root == null)
            return true;

        if (root.getVal() < minVal || root.getVal() > maxVal)
            return false;

        return isBst(root.getLeft(), minVal, root.getVal()) &&
                isBst(root.getRight(), root.getVal(), maxVal);
    }

}
