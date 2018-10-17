package edu.ren.datastructure.interviewBit;

public class SwapListNodesInPairs {

    ListNode swapAlternateNodes(ListNode listNode) {
        //12 34 5
        ListNode first = listNode, second = listNode.next, prev = null, head = listNode;
        while (second != null) {
            if (prev != null) {
                prev.next = second;
            } else {
                head = second;
            }
            ListNode nextNode = second.next;
            second.next = first;
            first.next = nextNode;
            prev = first;
            first = nextNode;

            if (nextNode != null) {
                second = nextNode.next;
            }else {
                second=null;
            }
        }
        return head;
    }
}