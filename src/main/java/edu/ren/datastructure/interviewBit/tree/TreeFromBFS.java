package edu.ren.datastructure.interviewBit.tree;

import java.util.HashMap;
import java.util.Map;

public class TreeFromBFS {
    BinarySearchTree createFromArray(int[] arr) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.root = create(arr);
        return binarySearchTree;
    }

   private TreeNode create(int[] arr) {
        Map<Integer, TreeNode> nodes = new HashMap<>();
        TreeNode root = null;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] == -1) {
                continue;
            }

            TreeNode treeNode = getNode(nodes, arr, i);
            if (i == 0) {
                root = treeNode;
            }
            TreeNode leftChildNode = getNode(nodes, arr, 2 * i + 1);
            TreeNode rightChildNode = getNode(nodes, arr, 2 * i + 2);
            treeNode.left = leftChildNode;
            treeNode.right = rightChildNode;
        }
        return root;
    }

    private TreeNode getNode(Map<Integer, TreeNode> nodes, int[] arr, int i) {
        if (arr[i] == -1 || i > arr.length - 1) {
            return null;
        }
        if (!nodes.containsKey(i)) {
            nodes.put(i, new TreeNode(arr[i]));
        }
        return nodes.get(i);
    }
}
