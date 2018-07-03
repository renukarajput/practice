package edu.ren.heap;

/**
 * Created by rrn3194 on 6/10/18.
 */
public class ArrayHeap<T extends Comparable<T>> implements Heap<T> {

    Object[] heapArray;
    int size;
    private static final int DEFAULT_INITIAL_CAPACITY = 11;

    public ArrayHeap() {
        this.heapArray = new Object[DEFAULT_INITIAL_CAPACITY];
        size = 0;
    }

    public void buildMaxHeap(Integer[] input) {
        int len = input.length;
        for (int i = len / 2 - 1; i >= 0; i--) {
            heapify(input, i);
        }
        size = input.length;
    }

    public void heapify(Integer[] input, int i) {
        System.out.println("heapify a[" + i + "] = " + input[i]);
        int left = 2 * i + 1; //5 <= len-1
        int right = 2 * i + 2; //8
        int largest = i;

        //10 5 8 3 2 4 1

        if (left < input.length && input[left] > input[i]) {
            largest = left;
        } else {
            largest = i;
        }

        if (right < input.length && input[right] > input[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = input[i];
            input[i] = input[largest];
            input[largest] = temp;
            heapify(input, largest);
        }
    }


    @Override
    public boolean add(T e) {
        heapArray[size] = e;
        return false;
    }

    @Override
    public boolean remove() {
        return false;
    }

    @Override
    public T peek() {
        return null;
    }
}
