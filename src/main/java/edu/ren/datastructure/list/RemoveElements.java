package edu.ren.datastructure.list;

//1 1 1 6 5 1
//1 1 1 2 1 1 3 4 1 2
// 1 2 3 4 5 4 6
public class RemoveElements {
    public void removeElements(LinkedList list, Integer val) {
        Node newHead = removeElements(list.head, val);
        list.head = newHead;
    }

    public Node removeElements(Node head, Integer val) {
        Node curr = head, prev = null, newHead = head;
        boolean headAssigned = false, isPendingRemove = false;
        while (curr != null) {
            if (curr.data != val) {
                if (!headAssigned) {
                    newHead = curr;
                    headAssigned = true;
                } else {
                    prev.next = curr;
                }
                prev = curr;
                isPendingRemove = false;
            } else {
                isPendingRemove = true;
            }
            curr = curr.next;
        }
        if (isPendingRemove) {
            prev.next = null;
        }
        return newHead;
    }
}
