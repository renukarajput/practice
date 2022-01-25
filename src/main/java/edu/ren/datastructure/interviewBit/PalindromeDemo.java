package edu.ren.datastructure.interviewBit;

/**
 * Created by rrn3194 on 8/6/18.
 */

// https://www.interviewbit.com/problems/palindrome-list/

public class PalindromeDemo {

    public int isListPalindrome(ListNode listNode) {

        int len = size(listNode);
        int midPos = getMidPosition(len);
        int endPositionOfFirst = 0;

        ListNode startOfSecond = null;
        if (len % 2 == 0)
            endPositionOfFirst = midPos;
        else
            endPositionOfFirst = midPos - 1;


        ListNode endNodeOfFirstList = getNodeAtPosition(listNode, endPositionOfFirst);
        if (len % 2 == 0)
            startOfSecond = endNodeOfFirstList.next;
        else
            if (endNodeOfFirstList.next != null)
                startOfSecond = endNodeOfFirstList.next.next;

        ListNode reverseHead = reverseList(startOfSecond);

        while (listNode != null && reverseHead != null) {
            if (listNode.val == reverseHead.val) {
                listNode = listNode.next;
                reverseHead = reverseHead.next;
            } else {
                return 0;
            }
        }
        return 1;
    }

    private ListNode reverseList(ListNode midNode) {
        ListNode prev = null;
        ListNode nextNode = null;

        ListNode curr = midNode;

        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        midNode = prev;
        return midNode;
    }

    private ListNode getNodeAtPosition(ListNode listNode, int position) {
        ListNode startNode = listNode;
        int i = 1;
        while (i < position) {
            i++;
            startNode = startNode.next;
        }
        return startNode;
    }

    private int getMidPosition(int len) {
        int midPos;
        if (len % 2 == 0)
            midPos = len / 2;
        else
            midPos = (len / 2) + 1;
        return midPos;
    }

    private int size(ListNode A) {
        int numElements = 0;
        while (A.next != null) {
            numElements++;
            A = A.next;
        }
        return numElements+1;
    }
}
