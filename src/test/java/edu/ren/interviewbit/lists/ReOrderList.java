package edu.ren.interviewbit.lists;

public class ReOrderList {
    //1 2 3 4  1 4 2 3
    //1 2 3 4 5  1 2 3 5 4  1 5 2 4 3
    ListNode reOrder(ListNode listNode) {

        ListNode midNode = getMidNode(listNode);
        ListNode secondHalfList = midNode.next;
        midNode.next = null;
        ListNode listTwo = reverse(secondHalfList);
        ListNode listOne = listNode;

        while (listTwo != null) {
            ListNode nextInListOne = listOne.next;
            listOne.next = listTwo;
            ListNode nextInListTwo = listTwo.next;
            listTwo.next = nextInListOne;
            listOne = nextInListOne;
            listTwo = nextInListTwo;
        }
        return listNode;
    }

    ListNode getMidNode(ListNode listNode) {
        ListNode fastPointer, slowPointer;
        fastPointer = slowPointer = listNode;
        while (fastPointer != null && fastPointer.next!=null) {
            fastPointer = fastPointer.next.next;
            if(fastPointer==null){
                break;
            }
            slowPointer = slowPointer.next;

        }
        return slowPointer;
    }


    ListNode reverse(ListNode listNode) {
        ListNode prev = null;
        ListNode current = listNode;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
}
