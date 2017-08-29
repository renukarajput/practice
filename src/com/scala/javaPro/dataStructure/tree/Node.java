package com.scala.javaPro.dataStructure.tree;

public class Node<T> {
    T val;
    Node leftChild, rightChild;

    public Node(T value){
        val = value;
        leftChild = rightChild = null;
    }
}
