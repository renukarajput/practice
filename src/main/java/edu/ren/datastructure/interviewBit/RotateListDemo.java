package edu.ren.datastructure.interviewBit;

/**
 * Created by rrn3194 on 8/6/18.
 */

// Rotate list k times https://www.interviewbit.com/problems/rotate-list/
public class RotateListDemo {
    class SizeInfo {

        public SizeInfo(int size, ListNode lastNode) {
            this.size = size;
            this.lastNode = lastNode;
        }

        int size;
        ListNode lastNode;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        System.out.println(new RotateListDemo().rotateRight(listNode, 2));
    }

    // 1 2 3 4 5 ===> 4 5 1 2 3
    public ListNode rotateRight(ListNode A, int B) {
        ListNode newHead = A;
        SizeInfo sizeinfo = size(A);
        int nThFromStart = sizeinfo.size - (B%sizeinfo.size);
        ListNode oldHead = A;

        for (int i = 1; i < nThFromStart; i++){
            A = A.next;
        }
        if(A.next != null) {
            newHead = A.next;
            A.next = null;
            ListNode lastNode = sizeinfo.lastNode;
            lastNode.next = oldHead;
        }
        return newHead;
    }

    private SizeInfo size(ListNode A){
        int length = 0;
        while(A.next != null){
            length++;
            A = A.next;
        }
        return new SizeInfo(length+1, A);
    }
}
