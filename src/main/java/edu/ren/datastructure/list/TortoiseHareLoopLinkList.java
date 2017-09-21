package edu.ren.datastructure.list;

/**
 * uses floyd's tortoise and hare algorithm to detect loop
 */

public class TortoiseHareLoopLinkList<T> extends LoopLinkList<T> {

    public TortoiseHareLoopLinkList(LinkedList<T> linkedList) {
        super(linkedList);
    }

    public TortoiseHareLoopLinkList(LinkedList<T> linkedList, int index) {
        super(linkedList, index);
    }

    @Override
    public boolean hasLoop() {
        Node<T> tortoiseSlowIndex, hareFastIndex;
        tortoiseSlowIndex = hareFastIndex = linkedList.head;
        while (hareFastIndex != null) {
            if (tortoiseSlowIndex == hareFastIndex) {
                return true;
            }
            if (hareFastIndex.next != null) {
                hareFastIndex = hareFastIndex.next.next;
            }
            tortoiseSlowIndex = tortoiseSlowIndex.next;
        }
        return false;
    }

    public boolean hasLoopUsingPtr(){
        Node<T> slowPtr = linkedList.head, fastPtr = linkedList.head;
        while(true) {
            if (slowPtr == null || fastPtr == null) {
                return false;
            }
            slowPtr = slowPtr.next;

            if (fastPtr.next != null) {
                fastPtr = fastPtr.next.next;
            }
            else {
                return false;
            }

            if (slowPtr == fastPtr)
                return true;
        }
    }

    @Override
    public Node<T> getStartOfLoop() {
        //TODO


        return null;
    }
}
