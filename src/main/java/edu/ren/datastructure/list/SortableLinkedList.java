package edu.ren.datastructure.list;

import java.util.List;

public class SortableLinkedList<T extends Comparable<T>> extends LinkedList<T> {


    public SortableLinkedList(Node<T> head) {
        this.head = head;
    }

    public void mergeSortInPlace(){
        mergeSortInPlaceUtil(this,0,this.size()-1);
    }

    private void mergeSortInPlaceUtil(LinkedList<T> list, int start, int end) {
        int mid = (start + end) / 2;
        if (start == end) {
            return;
        }
        mergeSortInPlaceUtil(list, start, mid);
        mergeSortInPlaceUtil(list, mid + 1, end);
        mergeInPlace(list, start, mid, end);
    }


    private void mergeInPlace(LinkedList<T> list, int start, int mid, int end) {
        int leftIndex = start, rightIndex = mid + 1;
        while (leftIndex <= mid && rightIndex <= end) {
            if (list.get(leftIndex).compareTo(list.get(rightIndex)) > 0) {
                Node<T> smallerNodeOnRight = list.deleteElementAtIndex(rightIndex);
                list.insertAtIndex(leftIndex, smallerNodeOnRight.data);
                mid++;
                //since a element from right is moved to left  2-4-6-1-7-9 mid is 6 at index 2 ,left is index 0-2 ,right is index 3-5
                //1-2-4-6-7-9 ,the mid node 6 is now at index 3 ,left is index 0-3 right is index 4-5
                rightIndex++;
            } else {
                leftIndex++;
            }
        }
    }


    public static void mergeListsInPlace(List<Integer> list1, List<Integer> list2) {
        int start1 = 0, end1 = list1.size();
        int start2 = 0, end2 = list2.size();

        while(start1 < end1 && start2 < end2){

            if (list1.get(start1) < list2.get(start2)){
                start1++;
            } else {
                list1.add(start1, list2.get(start2));
                list2.remove(start2);
                start1++;
                end1++;
                end2--;
            }
        }

        if(end2 > 0){
            list1.addAll(start1, list2);
        }
    }

    public LinkedList<T> mergeSort(Node head) {
        if (head == null || head.next == null)
            return new LinkedList<>(head);

        Node<T> midNode = getMiddle(head);
        Node<T> nextOfMid = midNode.next;
        midNode.next = null;
        LinkedList<T> left = mergeSort(head);
        LinkedList<T> right = mergeSort(nextOfMid);
        return merge(left, right);
    }

    private Node<T> getMiddle(Node head) {
        if (head == null)
            return head;
        Node<T> slowPtr = head, fastPtr = head.next;
        while (fastPtr != null) {
            fastPtr = fastPtr.next;
            if (fastPtr != null) {
                fastPtr = fastPtr.next;
                slowPtr = slowPtr.next;
            }
        }
        return slowPtr;
    }


    private LinkedList<T> merge(LinkedList<T> first, LinkedList<T> second) {
        LinkedList<T> resultList = new LinkedList<>();
        int i = 0, j = 0;

        while (i < first.size() && j < second.size()) {
            if (((Comparable) first.get(i)).compareTo(second.get(j)) < 0) {
                resultList.insertAtEnd(first.get(i));
                i++;
            } else {
                resultList.insertAtEnd(second.get(j));
                j++;
            }
        }

        while (i < first.size()){
            resultList.insertAtEnd(first.get(i));
            i++;
        }

        while (j < second.size()){
            resultList.insertAtEnd(second.get(j));
            j++;
        }

        return resultList;
    }

    public void reverseK(int k) {
        reverseK(head, k);
    }

    private void reverseK(Node<T> head, int k) {
        boolean headDone = false;
        Node<T> prevSlotEnd=null;
        while (head!= null) {
            Node<T> startOfNextSlot = getEndOfSlot(head, k).next;
            Node<T> newHead = reverseSubList(head, k);
            if(prevSlotEnd!=null){
                prevSlotEnd.next=newHead;
            }
            if (!headDone) {
                this.head = newHead;
                headDone = true;
            }
            prevSlotEnd=head;
            Node<T> nextHead = startOfNextSlot;
            head = nextHead;
        }
    }

    private Node<T> getEndOfSlot(Node<T> head, int k) {
        while (--k > 0 && head.next != null) {
            head = head.next;
        }
        return head;
    }

     Node<T> reverseSubList(Node<T> start, int k) {
        Node<T> prevNode = null;
        Node<T> currentNode = start;
        while (k-- >0) {
            Node<T> nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        return prevNode;
    }
}
