package edu.ren.datastructure.tree;

import java.util.*;

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

        if (val.compareTo(root.getVal()) > 0)
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
            System.out.print(root.getVal() + " - ");
            inOrder(root.rightChild);
        }
    }

    public void preOrder() {
        Stack<Node<T>> stack = new Stack<>();
        Set<Node<T>> visitedNodes = new HashSet<>();

        preOrder(root, stack, visitedNodes);
    }

    private void preOrder(Node root, Stack<Node<T>> stack, Set<Node<T>> visitedNodes) {
        if (root != null) {
            stack.push(root);
            if (root.leftChild == null && root.rightChild == null) {
                System.out.println(Arrays.toString(stack.stream().map(n -> n.getVal()).toArray()));
                visitedNodes.add(root);
                if (!stack.isEmpty()) {
                    stack.pop();
                    Node<T> top = stack.peek();
                    while ((top.leftChild == null || visitedNodes.contains(top.leftChild)) &&
                            (top.rightChild == null || visitedNodes.contains(top.rightChild))) {
                        if (stack.isEmpty())
                            break;
                        Node<T> nodeToRemove = stack.pop();
                        visitedNodes.remove(nodeToRemove.leftChild);
                        visitedNodes.remove(nodeToRemove.rightChild);
                        top = stack.peek();
                        visitedNodes.add(top);
                    }
                }
            }
            preOrder(root.leftChild, stack, visitedNodes);
            preOrder(root.rightChild, stack, visitedNodes);
        }
    }

    // print path using loop
    public void printPath() {

        Node<T> current = this.root;
        Stack<Node<T>> stack = new Stack<>();

        while (true) {
            if (current != null) {
                stack.push(current);
                current = current.leftChild;
            } else {


            }
            if (current.leftChild == null && root.rightChild == null) {
                System.out.println(Arrays.toString(stack.toArray()));
                stack.pop();
            }
        }
    }

    public T kThSmallest(int k) {
        int[] cnt = new int[1];
        cnt[0] = 1;
        return getKThSmallest(root, cnt, k);
    }

    private T getKThSmallest(Node<T> root, int[] cnt, int k) {
        T kThSmallest = null;
        if (root == null) {
            return null;
        }

        if (root.leftChild != null)
            kThSmallest = getKThSmallest(root.leftChild, cnt, k);

        if (cnt[0] == k) {
            System.out.print("root val = " + root.getVal() + " k : " + cnt[0]);
            return root.getVal();
        }

        cnt[0]++;
        if (kThSmallest == null)
            if (root.leftChild != null)
                kThSmallest = getKThSmallest(root.rightChild, cnt, k);

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
        System.out.println("deleting node -> " + root.getVal());
        root.leftChild = null;
        root.rightChild = null;
        root.setVal(null);
    }


    public Boolean searchInBst(Node<T> root, T value) {
        if (value.compareTo(root.getVal()) == 0)
            return true;
        else if (value.compareTo(root.getVal()) < 0) {
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
        return getMinOfBst(root).getVal();
    }

    private Node<T> getMinOfBst(Node<T> root) {
        while (root.leftChild != null) {
            root = root.leftChild;
        }
        return root;
    }

    public T getMaxValue() {
        return getMaxOfBst(root).getVal();
    }

    private Node<T> getMaxOfBst(Node<T> root) {
        while (root.rightChild != null) {
            root = root.rightChild;
        }
        return root;
    }

    public int heightOfTree(Node<T> root){
        if (root == null)
            return 0;
        else
            return 1 + Math.max(heightOfTree(root.leftChild), heightOfTree(root.rightChild));
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

        if (value.compareTo(root.getVal()) == 0) {
            return;
        } else if (value.compareTo(root.getVal()) < 0) {
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
