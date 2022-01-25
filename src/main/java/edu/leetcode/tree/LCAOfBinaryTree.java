package edu.leetcode.tree;
import edu.ren.datastructure.interviewBit.tree.TreeNode;
import edu.ren.datastructure.interviewBit.tree.BinaryTree;
import edu.ren.datastructure.interviewBit.tree.BinaryTreePrinter;

public class LCAOfBinaryTree {
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 6, 2, 0, 8, -1, -1, 7, 4};
        BinaryTree binaryTree = BinaryTree.buildFromLevelOrder(arr);
        TreeNode root = binaryTree.getRoot();
        BinaryTreePrinter.printNode(root);
        TreeNode res = new LCAOfBinaryTree().lowestCommonAncestor(root, root.getLeft(), root.getRight());
        System.out.println(res);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int[] count = new int[]{0};
        TreeNode result = lowestCommonAncestor(root, p, q, count,null);
        return count[0] == 2 ? result : null;
    }

    TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q, int[] count,TreeNode lastFound) {
        if (root == null || root.getVal() == p.getVal() || root.getVal() == q.getVal()) {
            if (root == null) {
                return lastFound;
            }
            count[0]++;
            lastFound=root;
            if (count[0] == 2)
                return root.getVal() == p.getVal() ? q : p;
        }
        TreeNode left = lowestCommonAncestor(root.getLeft(), p, q, count,lastFound);
        TreeNode right = lowestCommonAncestor(root.getRight(), p, q, count,lastFound);
        if (left != null && right != null)
            return root;
        return left == null ? right : left;
    }
}
