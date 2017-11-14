package edu.ren.datastructure.list;

public class SortableLinkedList<T> extends LinkedList<T> {
    LinkedList<T> resultList = new LinkedList<>();

    public SortableLinkedList(LinkedList<T> linkedList) {
        this.head = linkedList.head;
    }

    public LinkedList<T> mergeSort(Node head) {
        if(head == null || head.next == null)
            return new LinkedList<>(head);

        Node<T> midNode = getMiddle(head);
        Node<T> nextOfMid = midNode.next;
        midNode.next = null;
        LinkedList<T> left = mergeSort(head);
        LinkedList<T> right = mergeSort(nextOfMid);
        return merge(left, right, resultList);
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
        }
            return slowPtr;
        }


    // 3 1 4 2
    private LinkedList<T> merge(LinkedList<T> first, LinkedList<T> second, LinkedList<T> resultList) {
        int i = 0, j = 0;
        int firstLen = first.size();
        int secondLen = second.size();
        while (i < firstLen && j < secondLen) {
            if (((Comparable) first.get(i)).compareTo(second.get(j)) < 0) {
                resultList.insertAtEnd(first.get(i));
                i++;
            } else {
                resultList.insertAtEnd(second.get(j));
                j++;
            }
        }

        while (i < firstLen){
            resultList.insertAtEnd(first.get(i));
            i++;
        }

        while (j < secondLen){
            resultList.insertAtEnd(second.get(j));
            j++;
        }

        return resultList;
    }
}
