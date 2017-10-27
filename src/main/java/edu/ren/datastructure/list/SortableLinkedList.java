package edu.ren.datastructure.list;

public class SortableLinkedList<T> extends LinkedList<T> {
    private int size;

    public SortableLinkedList(LinkedList<T> linkedList) {
        this.head = linkedList.head;
        this.size = linkedList.size();
    }
    // 10 5 8 7 4 3 1 2 9 6

    public void mergeSort(LinkedList<T> linkedList) {
        int start = 0;
        int end = linkedList.size();
        divide(start, end, linkedList);
    }

    public void divide(int start, int end, LinkedList<T> linkedList) {
        if (start > end)
            return;

        int mid = (start + end) / 2;
        divide(start, mid, linkedList);
        divide(mid + 1, end, linkedList);
        conquer(start, mid, end, linkedList);
    }

    private void conquer(int start, int mid, int end, LinkedList<T> linkedList) {
        int i = 0, j = 0, k = 0;

        int[] arr = new int[linkedList.size()];
        int[] left = new int[mid];
        int[] right = new int[end - mid];
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

    }
}
