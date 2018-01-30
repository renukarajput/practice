package edu.ren.datastructure.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BinaryTree<T> extends BinarySearchTree {
    public BinaryTree() {
        root = null;
    }

    public void insert(T val) {
        if (root == null) {
            this.root = new Node<>(val);
            return;
        }
        insert(root, val);
    }

    private boolean insert(Node<T> root, T val) {
        if (root.leftChild == null) {
            root.leftChild = new Node<>(val);
            return true;
        } else if (root.rightChild == null) {
            root.rightChild = new Node<>(val);
            return true;
        }
        boolean isInserted = insert(root.leftChild, val);
        if (!isInserted) {
            isInserted = insert(root.rightChild, val);
        }
        return isInserted;
    }

    public void insertInBinaryTreee(T val) {
        root = insertInBinaryTree(root, val);
    }

    private Node insertInBinaryTree(Node<T> root, T val) {
        if (root == null) {
            root = new Node(val);
            return root;
        } else {
            if (root.leftChild == null) {
                root.leftChild = new Node(val);
                return root;
            } else {
                 insertInBinaryTree(root.leftChild, val);
            }
            if (root.rightChild == null) {
                root.rightChild = new Node(val);
                return root;
            } else {
                 insertInBinaryTree(root.rightChild, val);
            }
        }
        return root;
    }

    public List<T> preOrderValues(){
        List<Node<T>> nodes = preOrder();
        return nodes.stream().map(node->node.val).collect(Collectors.toList());
    }

    public List<Node<T>> preOrder() {
        List<Node<T>> preOrderList = new ArrayList<>();
        preOrder(root, preOrderList);
        return preOrderList;
    }

    private void preOrder(Node<T> root, List<Node<T>> preOrderList) {
        if (root == null) {
            return;
        }
        preOrderList.add(root);
        preOrder(root.leftChild, preOrderList);
        preOrder(root.rightChild, preOrderList);
    }

}
