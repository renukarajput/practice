package edu.ren.datastructure.tree;

public class Node<T> {
    private T val;
    Node<T> leftChild, rightChild;

    public Node(T value){
        setVal(value);
        leftChild = rightChild = null;
    }

    @Override
    public String toString() {
        T left,right;
        left=right=null;
        if(leftChild!=null){
            left= leftChild.getVal();
        }

        if(rightChild!=null){
            right= rightChild.getVal();
        }
        return "Node{" +
                "val=" + getVal() +
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

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }
}
