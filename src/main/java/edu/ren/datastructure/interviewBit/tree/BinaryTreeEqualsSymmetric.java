package edu.ren.datastructure.interviewBit.tree;

public class BinaryTreeEqualsSymmetric {


    int isEqual(BinarySearchTree tree) {
        return isEqual(tree.root);
    }

    private int isEqual_(TreeNode nodeOne){
        if(nodeOne==null){
            return 0;
        }
        return isEqual(nodeOne.left,nodeOne.right);
    }

    private int isEqual(TreeNode nodeOne, TreeNode nodeTwo) {
        if (nodeOne == null && nodeTwo == null) {
            return 1;
        }

        if (nodeOne == null && nodeTwo != null || nodeOne != null && nodeTwo == null) {
            return 0;
        }


        if(isEqual(nodeOne.left, nodeTwo.left)==1 && isEqual(nodeOne.right, nodeTwo.right)==1){
            return 1;
        }
        return 0;
    }

    public int isEqual(TreeNode node) {
        if (node == null)
            return 0;

        return isMirrorImage(node.left, node.right);
    }

    private int isMirrorImage(TreeNode node1, TreeNode node2){
        if (node1 == null && node2 == null)
            return 1;
        if (node1 == null || node2 == null)
            return 0;

        if (node1.val != node2.val)
            return 0;

        int left = isMirrorImage(node1.left, node2.right);
        int right = isMirrorImage(node1.right, node2.left);

        if (left == 1 && right == 1)
            return 1;
        return 0;
    }
}
