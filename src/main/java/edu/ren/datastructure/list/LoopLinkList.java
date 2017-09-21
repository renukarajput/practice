package edu.ren.datastructure.list;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Created by rrn3194 on 9/14/17.
 */
public class LoopLinkList<T> {
    LinkedList<T> linkedList;
    int size;

    public LoopLinkList(LinkedList<T> linkedList) {
        this.linkedList = linkedList;
        size = linkedList.size();
    }

    public LoopLinkList(LinkedList<T> linkedList, int index) {
        this.linkedList = linkedList; //TODO copy
        size = linkedList.size();
        Node<T> existingNode = linkedList.getNode(index);
        int size = linkedList.size();
        Node<T> lastNode = linkedList.getNode(size - 1);
        lastNode.next = existingNode;
    }


    public boolean hasLoop() {
        return getNodeLoopIfPresent() != null;
    }

    private Node<T> getNodeLoopIfPresent() {
        Node<T> node = linkedList.head;
        Set<Node<T>> set = new HashSet();
        int size = size();
        for (int i = 0; i <= size; ++i) {
            if (!set.contains(node)) {
                set.add(node);
                node = node.next;
            } else {
                return node;
            }
        }
        return null;
    }

   public Node<T> getStartOfLoop(){
        return getNodeLoopIfPresent();
    }

    public int size() {
        Node<T> node = linkedList.head;
        Set<T> set = new HashSet();

        for (int i = 0; i <= size; ++i) {
            if (!set.contains(node.data)) {
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
