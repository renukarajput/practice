package edu.ren.datastructure.interviewBit.tree;

import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Deque;

public class SumRootToLeaf {
    public int getSum(BinarySearchTree binarySearchTree) {
        return getSum(binarySearchTree.root);
    }

    private int getSum(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        BigInteger sum = new BigInteger("0");
        StringBuilder numberAsString = new StringBuilder();
        while (true) {
            while (root != null) {
                stack.add(root);
                numberAsString.append(root.val);
                root = root.left;
            }
            if (stack.isEmpty()) {
                break;
            }
            TreeNode top = stack.removeLast();

            if (top.right != null) {
                root = top.right;
            } else { //is a leaf or whose subtree is already visited
                if (top.left == null && top.right == null) {
                    String val = numberAsString.toString();
                    System.out.println(val);
                    BigInteger pathSum = new BigInteger(val);
                    sum = sum.add(pathSum);
                }
                numberAsString.deleteCharAt(numberAsString.length() - 1);
            }
        }
        BigInteger[] bigIntegers = sum.divideAndRemainder(BigInteger.valueOf(1003l));
        return bigIntegers[1].intValue();
    }


}
