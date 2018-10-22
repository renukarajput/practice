package edu.ren.datastructure.interviewBit.tree;

public class BinaryTreeEquals {

    int isEqual(BinarySearchTree treeOne, BinarySearchTree treeTwo) {
        return isEqual(treeOne.root, treeTwo.root);
    }

    private int isEqual(TreeNode nodeOne, TreeNode nodeTwo) {
        if (nodeOne == null && nodeTwo == null) {
            return 1;
        }

        if (nodeOne == null && nodeTwo != null || nodeOne != null && nodeTwo == null) {
            return 0;
        }

        if (nodeOne.val != nodeTwo.val) {
            return 0;
        }
       if(isEqual(nodeOne.left, nodeTwo.left)==1 && isEqual(nodeOne.right, nodeTwo.right)==1){
            return 1;
       }
       return 0;
    }

    public int isSameTree(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null)
            return 1;

        if ((node1.left == null && node2.left == null) && (node1.right == null && node2.right == null))
            return 1;

        if (node1 != null && node2 != null)
            if ((node1.left == null && node2.left == null ||
                    node1.left != null && node2.left != null) && (
                    node1.right == null && node2.right == null ||
                            node1.right != null && node2.right != null)) {

                int left = isSameTree(node1.left, node2.left);
                int right = isSameTree(node1.right, node2.right);
                if (left == 1 && right == 1)
                    return 1;
            }
        return 0;
    }
}
