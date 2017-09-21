package edu.ren.datastructure.list;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by rrn3194 on 9/14/17.
 */
public class LoopLinkList<T> {
    LinkedList<T> linkedList;
    private int size;


    public LoopLinkList(LinkedList<T> linkedList, int index) {
        this.linkedList = linkedList; //TODO copy
        size = linkedList.size();
        Node<T> existingNode = linkedList.getNode(index);
        int size = linkedList.size();
        Node<T> lastNode = linkedList.getNode(size - 1);
        lastNode.next = existingNode;
    }


    public boolean hasLoop() {
        return getStartOfLoop() != null;
    }

    public Node<T> getStartOfLoop() {
        return getLastNodeInLoop() == null ? null : getLastNodeInLoop().next;
    }

    public Node<T> getLastNodeInLoop() {
        Node<T> node = linkedList.head;
        Node<T> previousNode=null;
        Set<Node<T>> set = new HashSet();
        int size = size();
        for (int i = 0; i <= size; ++i) {
            if (node!=null && !set.contains(node)) {
                set.add(node);
                previousNode=node;
                node = node.next;
            } else {
                return previousNode;
            }
        }
        return null;
    }

    public void removeLoop(){
        getLastNodeInLoop().next=null;

    }
    public int size() {
        Node<T> node = linkedList.head;
        Set<T> set = new HashSet();

        for (int i = 0; i <= size; ++i) {
            if (node!=null && !set.contains(node.data)) { //if loop is removed ,node can become null during iteration
                set.add(node.data);
                node = node.next;
            } else {
                return i;
            }

        }
       // return size; //no loop
        throw new IllegalStateException("no loop");
    }

}
