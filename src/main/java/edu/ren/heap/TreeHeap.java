package edu.ren.heap;

import edu.ren.datastructure.tree.BinaryTree;
import edu.ren.datastructure.tree.Node;

/**
 * Created by rrn3194 on 6/10/18.
 */
public class TreeHeap<T extends Comparable<T>> implements Heap<T> {
    BinaryTree<T> treeHeap;

    public TreeHeap fromHeapArray(T[] elements) {
        int length = elements.length - 1;
        Node<T>[] nodeArray = convert(elements);
        for (int i = 0; i < length; i++) {
            if ((2 * i + 1) > length) {
                break;
            }
            Node<T> current = nodeArray[i];
            Node<T> left = nodeArray[2 * i + 1];
            current.setLeftChild(left);

            if ((2 * i + 2) > length) {
                break;
            }
            Node<T> right = nodeArray[2 * i + 2];
            current.setRightChild(right);
        }
        this.treeHeap = new BinaryTree<>(nodeArray[0]);
        return this;
    }

    private Node<T>[] convert(T[] input) {
        Node<T>[] output = new Node[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = new Node(input[i]);
        }
        return output;
    }

    @Override
    public boolean add(Integer e) {
        return false;
    }

    @Override
    public boolean removeAtIndex(int index) {
        return false;
    }

    @Override
    public T peek() {
        return null;
    }

    public  BinaryTree<T> getTree(){
        return treeHeap;
    }

}
