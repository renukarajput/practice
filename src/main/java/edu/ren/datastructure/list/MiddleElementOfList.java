package edu.ren.datastructure.list;

public class MiddleElementOfList<T> {

    public Node<T> getMiddleElement(Node<T> node) {
        Node<T> start = node;
        Node<T> slowPtr = start, fastPtr = start;
        while (fastPtr != null && fastPtr.next != null) {
            if (fastPtr.next.next == null)
                break;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }
}
