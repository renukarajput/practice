package edu.ren.datastructure.list;

public class SortableLinkedList<T extends Comparable<T>> extends LinkedList<T> {


    public SortableLinkedList(Node<T> head) {
        this.head=head;
    }

    public void mergeSortInPlace(){
        mergeSortInPlaceUtil(this,0,this.size()-1);
    }

    private void mergeSortInPlaceUtil(LinkedList<T>  list, int start, int end) {
        int mid=(start+end)/2;
        if (start == end) {
            return;
        }
        mergeSortInPlaceUtil(list,start,mid);
        mergeSortInPlaceUtil(list,mid+1,end);
        mergeInPlace(list,start,mid,end);
    }


    private void mergeInPlace(LinkedList<T> list, int start, int mid, int end) {
        int leftIndex=start,rightIndex=mid+1;
        while (leftIndex<=mid && rightIndex<=end){
            if(list.get(leftIndex).compareTo(list.get(rightIndex))>0){
                Node<T> smallerNodeOnRight = list.deleteElementAtIndex(rightIndex);
                list.insertAtIndex(leftIndex,smallerNodeOnRight.data);
                mid++; //since a element from right is moved to left  2-4-6-1-7-9 mid is 6 at index 2 ,left is index 0-2 ,right is index 3-5
                //1-2-4-6-7-9 ,the mid node 6 is now at index 3 ,left is index 0-3 right is index 4-5
                rightIndex++;
            }else{
                leftIndex++;
            }
        }
    }



    public LinkedList<T> mergeSort(Node head) {
        if(head == null || head.next == null)
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


    // 3 1 4 2
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
}
