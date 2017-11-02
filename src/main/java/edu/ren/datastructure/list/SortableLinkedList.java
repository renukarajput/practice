package edu.ren.datastructure.list;

public class SortableLinkedList<T> extends LinkedList<T> {
    private int size;

    public SortableLinkedList(LinkedList<T> linkedList) {
        this.head = linkedList.head;
        this.size = linkedList.size();
    }
    // 10 5 8 7 4 3 1 2 9 6

    public Node<T> mergeSort(Node head) {
        if(head == null || head.next == null)
            return head;

        Node<T> midNode = getMiddle(head);
        Node<T> nextOfMid = midNode.next;
        midNode.next = null;
        Node<T> left = mergeSort(head);
        Node<T> right = mergeSort(nextOfMid);
        return merge(left, right);
    }

    private Node<T> getMiddle(Node head) {
        if (head == null)
            return head;
        Node<T> slowPtr = head, fastPtr = head.next;
        while (fastPtr != null) {
            fastPtr = fastPtr.next;
            if (fastPtr != null) {
                fastPtr = fastPtr.next;
                slowPtr = slowPtr.next;
            }
            System.out.println("mid = "+slowPtr);
        }
            return slowPtr;
        }

    private Node<T> merge(Node<T> first, Node<T> second) {
        Node<T> curr = null;
        if (first == null)
            return second;
        if (second == null)
            return first;

        if(((Comparable)first.data).compareTo(second.data) < 0) {
            curr = first;
            curr.next = merge(first.next, second);
        }
        else {
            curr = second;
            curr.next = merge(second.next, first);
        }
        return curr;
    }
}
