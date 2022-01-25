package edu.ren.heap;

/**
 * Created by rrn3194 on 6/10/18.
 */
public interface Heap<T extends Comparable<T>> {

    boolean add(Integer e);
    boolean removeAtIndex(int index);
    T peek();

}
