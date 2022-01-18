package edu.ren.datastructure.interviewBit.tree;

public class TreeNode {
    public int val;

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                '}';
    }

    public int getVal() {
        return val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public TreeNode left;
    public TreeNode right;

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

//candidate code
    public void zigzag(TreeNode head,int i) {
        int j = i;
        TreeNode temp = head;
        System.out.print(temp.val+" ");
        while (temp!= null){
            if (i%2==0){
                if (temp.right != null)
                    System.out.print(temp.right.val+" ");
                if (temp.left != null)
                    System.out.print(temp.left.val+" ");
            i++;
            temp = temp.right;
            zigzag(temp,i);
            } else {
                if (temp.right != null)
                    System.out.print(temp.left.val+" ");
                if (temp.left != null)
                    System.out.print(temp.right.val+ " ");
                i++;
                temp = temp.left;
                zigzag(temp,i);
            }
        }
    }
}
