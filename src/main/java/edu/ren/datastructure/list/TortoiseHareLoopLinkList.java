package edu.ren.datastructure.list;

/**
 * uses floyd's tortoise and hare algorithm to detect loop
 */
public class TortoiseHareLoopLinkList<T> extends LoopLinkList<T> {

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

    @Override
    public Node<T> getStartOfLoop() {
        //TODO


        return null;
    }
}
