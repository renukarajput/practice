package edu.ren.datastructure.interviewBit.tree;

import java.util.ArrayList;
import java.util.List;

//log n space and linear time
public class TwoSumInLinearTimeSpaceOpimized extends TwoSumInLinearTime {
    @Override
    boolean twoSum(BinarySearchTree binarySearchTree, int sum) {
        return twoSum(binarySearchTree.root, sum);
    }

    private boolean twoSum(TreeNode root, int sum) {
        return twoSum(root,sum,new ArrayList<>(),new ArrayList<>());
    }

    private boolean twoSum(TreeNode root, int sum, List<TreeNode> inorderList, List<TreeNode> revInorderList) {
        TreeNode inOrderTempRoot = root;
        TreeNode reverseInOrderTempRoot = root;
        while (true) {
            while (inOrderTempRoot != null) {
                inorderList.add(inOrderTempRoot);
                inOrderTempRoot = inOrderTempRoot.left;
            }
            while (reverseInOrderTempRoot != null) {
                revInorderList.add(reverseInOrderTempRoot);
                reverseInOrderTempRoot = reverseInOrderTempRoot.right;
            }
            if (inorderList.isEmpty() || revInorderList.isEmpty()) {
                break;
            }
            TreeNode one = inorderList.get(inorderList.size() - 1);
            TreeNode two = revInorderList.get(revInorderList.size() - 1);
            if(one==two){
                break;
            }
            if (one != two && one.val + two.val == sum) {
                System.out.println(one.val+"+"+two.val+"="+sum);
                return true;
            }
            if (one.val + two.val > sum) {
                revInorderList.remove(revInorderList.size() - 1);
                if (two.left != null) {
                    reverseInOrderTempRoot=two.left;
                }
            } else if (one.val + two.val < sum) {
                inorderList.remove(inorderList.size()-1);
                if (one.right != null) {
                    inOrderTempRoot = one.right;
                }
            }
        }
        return false;
    }
}
