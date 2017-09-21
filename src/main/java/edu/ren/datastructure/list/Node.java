package edu.ren.datastructure.list;

/**
 * Created by kumarrak on 21/09/17.
 */
class Node<T> {
    T data;
    protected Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
