package edu.ren.datastructure.interviewBit.tree;

import java.util.List;

public class TreeFromInorderAndPostOrder {

    public BinaryTree buildFrom(List<Integer> inorder, List<Integer> postOrder) {
        return BinaryTree.withRoot(buildFrom(inorder, postOrder, 0, inorder.size() - 1));
    }

    TreeNode buildFrom(List<Integer> inorder, List<Integer> postOrder, int start, int end) {
        if(start>end){
            return null;
        }
        Integer rootVal = postOrder.get(postOrder.size() - 1);

        postOrder.remove(postOrder.size()-1);
        TreeNode root = new TreeNode(rootVal);
        int indexInOrder = TreeFromInorderAndPreOrder.getIndexInOrder(rootVal, inorder, start, end);
        root.right = buildFrom(inorder, postOrder, indexInOrder + 1, end);
        root.left = buildFrom(inorder, postOrder, start, indexInOrder - 1);
        return root;
    }
}
