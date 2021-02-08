package edu.leetcode.tree;

import edu.ren.datastructure.interviewBit.tree.BinarySearchTree;
import edu.ren.datastructure.interviewBit.tree.BinaryTree;
import edu.ren.datastructure.interviewBit.tree.BinaryTreePrinter;
import edu.ren.datastructure.interviewBit.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

public class SplitTree {
    public static void main(String[] args) {
        int[] arr = {10, 7, 9, 18, 3, 8, 11, 23, 15, 20, 25, 19, 21, 13, 17, 12, 14};
        TreeNode root = BinarySearchTree.fromArray(arr).getRoot();
        BinaryTreePrinter.printNode(root);
    }

    public TreeNode[] splitBST(TreeNode root, int value) {
        TreeNode[] result = new TreeNode[2];
        TreeNode currentNode = root;
        Deque<TreeNode> path = new LinkedBlockingDeque<>();
        TreeNode leftSubtreeBoundaryNode = null, rightSubtreeBoundaryNode = null;
        while (currentNode != null) {
            if (currentNode.val < value) {
                if (path.isEmpty() || path.getLast().val < value) {

                } else if (path.getLast().val > value) { //prev was greater but current is smaller
                    //1.move currentNode(along with it's left subtree) in smaller subtree
                    //2. cut it's right subtree where value is larger for first time
                    path.getLast().left = null;
                    if (result[0] == null) {
                        result[0] = currentNode;
                        leftSubtreeBoundaryNode = currentNode;
                    } else {
                        leftSubtreeBoundaryNode.right = currentNode;
                        //find split node in right subtree of currentNode,1st node larger than value
                        TreeNode larger = splitFirstLargerNode(currentNode.right, value);
                        if (result[1] == null) {
                            result[1] = path.getFirst(); //??
                            rightSubtreeBoundaryNode = larger;
                        } else
                            rightSubtreeBoundaryNode.left = larger;
                    }
                }
            }
            if (currentNode.val == value) {

            }
            path.addLast(currentNode);
        }
        return null;
    }

    TreeNode splitFirstLargerNode(TreeNode node, int value) {
        TreeNode parent = null;
        while (node != null) {
            if (node.val <= value) {
                node = node.right;
                parent = node;
            } else if (node.val > value) {
                if (parent != null) {
                    parent.right = null;
                }
                return node;
            }
        }
        return null;

    }

    private void cutFromParent(TreeNode Node, TreeNode parent) {
        if (parent.left == Node) parent.left = null;
        else parent.right = null;
    }

    TreeNode min(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    TreeNode max(TreeNode root) {
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }
}

