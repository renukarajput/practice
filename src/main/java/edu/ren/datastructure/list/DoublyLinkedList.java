package edu.ren.datastructure.list;

public class DoublyLinkedList {
    LLNode head;

    public DoublyLinkedList() {
    }

    // add to last
    public void add(Integer elm) {
        if (head == null) {
            head = new LLNode(elm);
            return;
        }
        LLNode start = this.head;
        while (start.next != null) {
            start = start.next;
        }
        LLNode newNode = new LLNode(elm);
        start.next = newNode;
        newNode.prev = start;
    }

    // 1 2 3 4
    public void reverse(LLNode node) {
        LLNode curr = node;
        LLNode prev = null, next = null, temp = null;
        while (curr != null) {
            temp = curr.prev;
            next = curr.next;
            curr.prev = next;
            curr.next = temp;
            prev = curr;
            curr = curr.prev;
        }
        this.head = prev;
    }


}

class LLNode {
    Integer elm;
    LLNode prev;
    LLNode next;

    public LLNode(Integer elm) {
        this.elm = elm;
        this.prev = null;
        this.next = null;
    }

    @Override
    public String toString() { // null-1-2-3
        return "LLNode{" +
                "elm=" + elm +
                ", next=" + next +
                '}';
    }
}
