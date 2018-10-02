package edu.ren.datastructure.interviewBit;

import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

/**
 * Created by rrn3194 on 8/7/18.
 */
public class ListNodeProxy {
    public static ListNode getNodeAtPosition(ListNode listNode, int position) {
        ListNode startNode = listNode;
        int i = 1;
        while (i < position) {
            i++;
            startNode = startNode.next;
        }
        return startNode;
    }


    public static void insertAtIndex(ListNode listNode, int index, int val) {
        ListNode head = listNode;
        if (index == 0) {
            ListNode oldHead = getNode(listNode, 0);
            ListNode newHead = new ListNode(val);
            newHead.next = oldHead;
            head = newHead;
            return;
        }
        ListNode prevNode = getNode(listNode, index - 1);
        ListNode nextNode = getNode(listNode, index);
        ListNode newNode = new ListNode(val);
        prevNode.next = newNode;
        newNode.next = nextNode;

    }


    public static void insertAtEnd(ListNode listNode, int val) {
        ListNode head = listNode;
        if (head == null) {
            head = new ListNode(val);
            return;
        }
        ListNode start = listNode;
        ListNode newNode = new ListNode(val);
        while (start.next != null) {
            start = start.next;
        }
        start.next = newNode;
    }

    //1-2-3-4-5
    public static ListNode removeNode(ListNode headNode, ListNode node) {
        ListNode prev = headNode;
        if (node == headNode) {
            ListNode newHead = headNode.next;
            headNode.next = null;
            return newHead;
        }
        while (headNode.next != node) {
            prev = prev.next;
            headNode = headNode.next;
        }
        ListNode nextNode = node.next;
        prev.next = nextNode;
        return headNode;
    }

    public static ListNode removeAtIndex(ListNode listNode, int position) {
        if (position == 1) {
            ListNode next = listNode.next;
            listNode.next = null;
            return next;
        }
        ListNode prev = getNodeAtPosition(listNode, position - 1);
        ListNode curr = prev.next;
        ListNode next = curr.next;
        prev.next = next;

        return listNode;
    }

    void add(ListNode listNode, ListNode newNode) {
        listNode = getLastNode(listNode);
        listNode.next = newNode;
    }

    public static ListNode getLastNode(ListNode listNode) {
        while (listNode.next != null) {
            listNode = listNode.next;
        }
        return listNode;
    }

    public static ListNode fromArray(int[] values) {
        ListNode head = new ListNode(values[0]);
        ListNode node = head;
        for (int i = 1; i < values.length; i++) {
            node.next = new ListNode(values[i]);
            node = node.next;
        }
        return head;
    }

    public static void createCycle(ListNode listNode, int positionOfCycle) {
        ListNode startNodeOfCycle = getNodeAtPosition(listNode, positionOfCycle);
        ListNode lastNode = getLastNode(listNode);
        lastNode.next = startNodeOfCycle;
    }

    //1-2-3
    public static String stringFromListNode(ListNode node) {
        StringJoiner stringJoiner = new StringJoiner("->");
        Set<ListNode> listNodes = new HashSet<>();
        while (node != null) {
            if (listNodes.contains(node.next)) {
                //cycle
                stringJoiner.add(String.valueOf(node.val));
                stringJoiner.add("-~~->" + node.next.val);
                break;
            }
            listNodes.add(node);
            stringJoiner.add(String.valueOf(node.val));
            node = node.next;
        }
        return stringJoiner.toString();
    }

    public static int get(ListNode listNode, int index) {
        return getNode(listNode, index).val;
    }

    public static ListNode getNode(ListNode listNode, int index) {
        ListNode start = listNode;
        int i = 0;
        int size = size(listNode);
        if (index >= size) {
            throw new IllegalArgumentException("index is out of bound");
        }
        while (i != index) {
            start = start.next;
            i++;
        }
        return start;
    }

    public static int size(ListNode listNode) {
        int size = 0;
        ListNode start = listNode;
        while (start != null) {
            start = start.next;
            size++;
        }
        return size;
    }

}
