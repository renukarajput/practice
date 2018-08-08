package edu.ren.datastructure.interviewBit;

/**
 * Created by rrn3194 on 8/7/18.
 */

//Removing duplicates from sorted list
public class DuplicateElements {

    public void removeDuplicates(ListNode listNode) {
        ListNode headNode = listNode;
        ListNode start = headNode;

        while (listNode != null) {
            ListNode node = listNode.next;
            if (node == null)
                return;
            if (start.val == node.val) {
                ListNodeProxy.removeNode(headNode, node);
            } else {
                start = start.next;
                listNode = listNode.next;
            }
        }

    }
}
