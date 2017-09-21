package edu.ren.datastructure.list;

/**
 * uses floyd's tortoise and hare algorithm to detect loop
 */

public class TortoiseHareLoopLinkList<T> extends LoopLinkList<T> {

    private final Node<T> head;

    public TortoiseHareLoopLinkList(LinkedList<T> linkedList, int index) {
        super(linkedList, index);
        head = linkedList.head;
    }


    @Override
    public boolean hasLoop() {
        return getStartOfLoop() != null;
    }


    @Override
    public Node<T> getLastNodeInLoop() {
        Node<T> slowPtr = head, fastPtr = head;
        while (true) {
            if (fastPtr == null || fastPtr.next == null) { //linear list
                return null;
            }
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if (slowPtr == fastPtr) {
                break;
            }
        }
        if(fastPtr==head){ //case when both meet at head ,this is needed to find last node in loop and not for start of loop as head is the start of loop in this case
            while (slowPtr.next!=head){
                slowPtr=slowPtr.next;
            }
            return slowPtr;
        }

        Node<T> prev=null ;
        slowPtr = head;
        while (slowPtr != fastPtr) {
            prev = fastPtr;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }

        return prev;
    }

}
