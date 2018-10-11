package edu.ren.datastructure.interviewBit.tree;

public class TreeNode {
    int val;

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                '}';
    }

    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    void insert(int val){
        if(this.val >val){
            if(left!=null){
                left.insert(val);
            }else {
                left=new TreeNode(val);
            }
        }else {
            if(right!=null){
                right.insert(val);
            }else {
                right=new TreeNode(val);
            }
        }
    }
}
