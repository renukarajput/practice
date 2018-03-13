package edu.ren.datastructure.tree;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BinarySearchTree<T extends Comparable<? super T>> {
    Node<T> root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(T val) {
        root = insertionInBst(root, val);
    }

    private Node insertionInBst(Node<T> root, T val) {

        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val.compareTo(root.val) > 0)
            root.rightChild = insertionInBst(root.rightChild, val);
        else
            root.leftChild = insertionInBst(root.leftChild, val);

        return root;
    }

    protected void inOrderTraversal() {
        inOrder(root);
    }

    protected void inOrder(Node root) {
        if (root != null) {
            inOrder(root.leftChild);
            System.out.print(root.val + " - ");
            inOrder(root.rightChild);
        }
    }

    public T kThSmallest(int k) {
        int[] cnt = new int[1];
        cnt[0] = 0;
        return getKThSmallest(root, cnt, k);
    }

    private T getKThSmallest(Node<T> root, int[] cnt, int k) {
        T kThSmallest = null;
        if (root == null) {
            return null;
        }
        if (cnt[0] == k) {
            System.out.print("root val = " + root.val + " k : " + cnt[0]);
            return root.val;
        } else {
            kThSmallest = getKThSmallest(root.leftChild, cnt, k);
            cnt[0]++;
            if (kThSmallest == null)
                kThSmallest = getKThSmallest(root.rightChild, cnt, k);
        }
        return kThSmallest;
    }

    public void deleteTree() {
        delete(root);
        root = null;
    }

    private void delete(Node<T> root) {
        if (root == null)
            return;
        delete(root.leftChild);
        delete(root.rightChild);
        System.out.println("deleting node -> " + root.val);
        root.leftChild = null;
        root.rightChild = null;
        root.val = null;
    }


    public void isBST() {
        if (isBstUtil(root) == true)
            System.out.println("BST");
        else
            System.out.println("Not BST");
    }

    private boolean isBstUtil(Node root) {
        if (root == null)
            return true;
//        if (root.leftChild != null && getMaxValue().compareTo(root)){
//
//        }
        return false;
    }


    public Boolean searchInBst(Node<T> root, T value) {
        if (value.compareTo(root.val) == 0)
            return true;
        else if (value.compareTo(root.val) < 0) {
            if (root.leftChild == null)
                return false;
            else
                return searchInBst(root.leftChild, value);
        } else {
            if (root.rightChild == null)
                return false;
            else
                return searchInBst(root.rightChild, value);
        }
    }

    public T getMinValue() {
        return getMinOfBst(root).val;
    }

    private Node<T> getMinOfBst(Node<T> root) {
        while (root.leftChild != null) {
            root = root.leftChild;
        }
        return root;
    }

    public T getMaxValue() {
        return getMaxOfBst(root).val;
    }

    private Node<T> getMaxOfBst(Node<T> root) {
        while (root.rightChild != null) {
            root = root.rightChild;
        }
        return root;
    }

    public List<Node<T>> search(T val) {
        Node<T> rootNode = this.root;
        List<Node<T>> list = new LinkedList<>();
        list.add(rootNode);
        search(rootNode, val, list);
        if (list.get(list.size() - 1) == val) {
            return list;
        } else {
            return Collections.EMPTY_LIST;
        }
    }

    private void search(Node<T> root, T value, List<Node<T>> list) {
        if (root == null)
            return;

        if (value.compareTo(root.val) == 0) {
            return;
        } else if (value.compareTo(root.val) < 0) {
            if (root.leftChild != null) {
                list.add(root.leftChild);
                search(root.leftChild, value, list);
            } else
                return;
        } else {
            if (root.rightChild != null) {
                list.add(root.rightChild);
                search(root.rightChild, value, list);
            } else
                return;
        }
    }

}
