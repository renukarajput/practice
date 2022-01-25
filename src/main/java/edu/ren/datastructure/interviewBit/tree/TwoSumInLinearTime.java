package edu.ren.datastructure.interviewBit.tree;

import java.util.ArrayList;
import java.util.List;

public class TwoSumInLinearTime extends TwoSumInBST{
    
    @Override
    boolean twoSum(BinarySearchTree binarySearchTree, int sum) {
      return twoSum(inorder(binarySearchTree.root),sum);
    }

    boolean twoSum(List<TreeNode> inorderList,int sum){
        int startIndex=0,endIndex=inorderList.size()-1;
        while (startIndex<endIndex){
            if(inorderList.get(startIndex).val+inorderList.get(endIndex).val>sum){
                endIndex--;
            }else if(inorderList.get(startIndex).val+inorderList.get(endIndex).val<sum){
                startIndex++;
            }else {
                System.out.println(inorderList.get(startIndex)+" "+inorderList.get(endIndex)+"="+sum);
                return true;
            }
        }
        return false;
    }

    List<TreeNode> inorder(TreeNode treeNode){
        List<TreeNode> inorderList=new ArrayList<>();
        inorder(treeNode,inorderList);
        return inorderList;
    }

    private void inorder(TreeNode treeNode, List<TreeNode> inorderList) {
        if(treeNode==null){
            return;
        }
        inorder(treeNode.left,inorderList);
        inorderList.add(treeNode);
        inorder(treeNode.right,inorderList);
    }
}
