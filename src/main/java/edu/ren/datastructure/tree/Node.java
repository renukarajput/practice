package edu.ren.datastructure.tree;

public class Node<T> {
    T val;
    Node<T> leftChild, rightChild;

    public Node(T value){
        val = value;
        leftChild = rightChild = null;
    }

    @Override
    public String toString() {
        T left,right;
        left=right=null;
        if(leftChild!=null){
            left=leftChild.val;
        }

        if(rightChild!=null){
            right=rightChild.val;
        }
        return "Node{" +
                "val=" + val +
                ", leftChild=" + left +
                ", rightChild=" + right +
                '}';
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }
}
