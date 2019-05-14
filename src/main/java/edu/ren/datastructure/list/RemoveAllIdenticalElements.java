package edu.ren.datastructure.list;

public class RemoveAllIdenticalElements {
    public void removeIdenticalElements(LinkedList list) {
//        removeDuplicates(list.head);
//        printList(list.head);
        Node newHead = removeIdenticalElements(list.head);
        list.head = newHead;
    }

//     1 2 2 3 4 4 5
//     1, 1, 2, 2, 3, 5, 5, 7
//     1, 2, 2, 2, 3, 3, 3, 4, 5
//    1, 2, 2, 3, 3, 4, 4, 5
    public Node removeIdenticalElements(Node head) {
        Node curr = head, prev = null, nextPtr, newHead = head;
        while (curr != null && curr.next != null) {
            nextPtr = curr.next;
            if (curr.data != nextPtr.data) {
                prev = curr;
            } else {
                while (curr.data == nextPtr.data) {
                    nextPtr = nextPtr.next;
                }
                if (prev!= null)
                    prev.next = nextPtr;
                prev = nextPtr;
                curr = nextPtr;
            }
            curr = curr.next;
        }
        return newHead;
    }

    public void removeDuplicates(Node head) {
//        Node curr = head;
//        while (curr != null) {
//            Node node = curr;
//            while (node != null && node.data == curr.data) {
//                node = node.next;
//            }
//            curr.next = node;
//            curr = curr.next;
//        }
        //**************
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
//        return head;
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
}
