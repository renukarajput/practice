package edu.ren.heap;

/**
 * Created by rrn3194 on 6/10/18.
 */
public class ArrayHeap<T extends Comparable<T>> implements Heap<T> {

    Integer[] heapArray;
    int size;
    private static final int DEFAULT_INITIAL_CAPACITY = 11;

    public ArrayHeap() {
        this.heapArray = new Integer[DEFAULT_INITIAL_CAPACITY];
        size = 0;

    }

    public ArrayHeap(Integer[] elements) {
        this.heapArray = new Integer[elements.length];
        System.arraycopy(elements, 0, heapArray, 0, elements.length);
        size = elements.length;
        buildMaxHeap(heapArray);
    }

    private void buildMaxHeap(Integer[] input) {
        size = input.length;
        int len = input.length;
        for (int i = len / 2 - 1; i >= 0; i--) {
            heapify(input, i);
        }
    }

    /*
    When MAX-HEAPIFY is called, it is assumed that the binary trees rooted at LEFT(i) and RIGHT(i) are max-heaps,
    but that A[i] may be smaller than its children, thus violating the max-heap property.
    The function of MAX-HEAPIFY is to let the value at A[i] "float down"
    in the max-heap so that the subtree rooted at index i becomes a max-heap.
     */
    private void heapify(Integer[] input, int i) {
        System.out.println("heapify a[" + i + "] = " + input[i]);
        int left = 2 * i + 1; //5 <= len-1
        int right = 2 * i + 2; //8
        int largest = i;

        //10 5 8 3 2 4 1

        if (left < size && input[left] > input[i]) {
            largest = left;
        } else {
            largest = i;
        }

        if (right < size && input[right] > input[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = input[i];
            input[i] = input[largest];
            input[largest] = temp;
            heapify(input, largest);
        }
    }

    //starting from index, move up till property is violated
    private void shiftUp(Integer[] input, int index) {
        int parentIndex = getParentIndex(index);
        while (index > 0) {
            if (input[index] > input[parentIndex]) {
                int temp = input[index];
                input[index] = input[parentIndex];
                input[parentIndex] = temp;
            } else {
                break;
            }
            index = parentIndex;
            parentIndex = getParentIndex(index);
        }
    }

    @Override
    public boolean add(Integer elm) {
        ensureCapacity();
        int indexOfInsert = size;
        size++;
        heapArray[indexOfInsert] = elm;
        // Integer parentIndex = getParentIndex(indexOfInsert);
        // heapify(this.heapArray, parentIndex);
        shiftUp(heapArray, indexOfInsert);
        return true;
    }

    private void ensureCapacity() {
        if (size == heapArray.length) {
            Integer[] newHeapArray = new Integer[size * 2];
            System.arraycopy(heapArray, 0, newHeapArray, 0, size);
            heapArray = newHeapArray;
        }
    }

    @Override
    public boolean removeAtIndex(int index) {
        this.heapArray[size] = this.heapArray[index];
        heapify(this.heapArray, size);
        size--;
        return true;
    }

    @Override
    public T peek() {
        return null;
    }

    private Integer getParentIndex(int childIndex) {
        int parentIndex = (childIndex - 1) / 2;

        return parentIndex;
    }

    public Integer[] getInternalArray() {
        Integer[] result = new Integer[size];
        System.arraycopy(heapArray, 0, result, 0, size);
        return result;
    }
}
