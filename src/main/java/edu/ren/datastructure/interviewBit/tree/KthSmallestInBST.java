package edu.ren.datastructure.interviewBit.tree;

public class KthSmallestInBST {

    int getKthSmallest(BinarySearchTree binarySearchTree, int k) {
        int[] res = new int[1];

        getKthSmallest(binarySearchTree.root, new int[]{k}, res);
        return res[0];
    }

    void getKthSmallest(TreeNode node, int[] k, int[] res) {
        if (node == null) {
            return;
        }
        if (node.left != null)
            getKthSmallest(node.left, k, res);
        k[0]--;
        if (k[0] == 0) {
            res[0] = node.val;
            return;
        }
        getKthSmallest(node.right, k, res);
    }

    int kthLargest(TreeNode root, int k) {
        int[] res = new int[1];
        kthLargestUtil(root, new int[]{k - 1}, res);
        return res[0];
    }

    void kthLargestUtil(TreeNode root, int[] k, int[] res) {
        // System.out.println("k="+k[0]);

        if (root == null)
            return;
        kthLargestUtil(root.right, k, res);

        if (root != null)
            System.out.println(root.val + " k=" + k[0]);

        if (k[0] == 0)
            res[0] = root.val;
        k[0] = k[0] - 1;
        kthLargestUtil(root.left, k, res);
    }

    int kthLargestUtil_(TreeNode root, int k) {
        if (root.right != null)
            return kthLargestUtil_(root.right, k - 1);

        System.out.println("-->" + root.val);

        if (k == 0) {
            if (root.left == null && root.right == null)
                System.out.println(root.val);
            return root != null ? root.val : -1;
        }


        if (root.left != null)
            return kthLargestUtil_(root.left, k - 1);

        System.out.println("k=" + k);
        return 1;
    }
}

