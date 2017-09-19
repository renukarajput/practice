package com.datastructure.list;

import java.util.Comparator;

public class Tree<T extends Comparable<T>> implements Comparable<T> {

    private Node<T> root;
    private Comparator<T> nodeComparator;

    public Tree(T value) {
        root = new Node<>(value);
    }

    public Tree(T value, Comparator<T> comparator) {
        this.root = new Node<>(value);
        this.nodeComparator = comparator;
    }

    public void insert(T value) {
        insert(root, value);
    }

    public void insert(Node<T> tempRoot, T value) {
        int difference = 0;
        if (nodeComparator != null) {
            difference = nodeComparator.compare(tempRoot.value, value);
        } else {
            difference = tempRoot.value.compareTo(value);
        }
        if (difference > 0) {
            if (tempRoot.left != null) {
                insert(tempRoot.left, value);
            } else {
                tempRoot.left = new Node<>(value);
            }
        } else {
            if (tempRoot.right != null) {
                insert(tempRoot.right, value);
            } else {
                tempRoot.right = new Node<>(value);
            }
        }
    }

    public void add(T value) {
        Node<T> tempRoot = root;
        if (tempRoot.value == null) {
            tempRoot.value = value;
            return;
        }

        while (true) {
            int difference = 0;
            if (nodeComparator != null) {
                difference = nodeComparator.compare(tempRoot.value, value);
            } else {
                difference = tempRoot.value.compareTo(value);
            }
            if (difference > 0) {
                if (tempRoot.left != null) {
                    tempRoot = tempRoot.left;
                } else {
                    tempRoot.left = new Node<>(value);
                    break;
                }

            } else if (tempRoot.right != null) {
                tempRoot = tempRoot.right;
            } else {
                tempRoot.right = new Node<>(value);
                break;
            }
        }

    }

    public void inorder() {
        inorder(root);
    }

    public void inorder(Node<T> tempRoot) {
        if (tempRoot == null) {
            return;
        }
        inorder(tempRoot.left);
        System.out.print(tempRoot.value + " ");
        inorder(tempRoot.right);
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }

    private static class Node<T extends Comparable<T>> {
        Node<T> left;
        Node<T> right;
        T value;

        Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            if (value != null) {
                return value.toString();
            }
            return "";
        }
    }

    public boolean isMirrorTree(Tree<T> t2) {
        Tree<T> t1 = this;
        if (t2 == null)
            return false;
        return isMirrorTree(t1.root, t2.root);
    }

    private boolean isMirrorTree(Node<T> nodeOne, Node<T> nodeTwo) {
        if (!isSameNode(nodeOne, nodeTwo)) {
            return false;
        }
        if (nodeOne == null && nodeTwo == null)
            return true;
        if ((nodeOne == null && nodeTwo != null) || (nodeOne != null && nodeTwo == null))
            return false;

        return (isMirrorTree(nodeOne.right, nodeTwo.left) && isMirrorTree(nodeOne.left, nodeTwo.right));
    }

    boolean isSameNode(Node<T> root1, Node<T> root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 != null && root2 != null) {
            if (root1.value == root2.value) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
