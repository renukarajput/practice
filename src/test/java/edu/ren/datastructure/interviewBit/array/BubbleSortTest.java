package edu.ren.datastructure.interviewBit.array;

/**
 * Created by rrn3194 on 9/11/18.
 */
public class BubbleSortTest extends ArraySorterTest {

    @Override
    protected ArraySorter getSorter() {
        return new BubbleSort();
    }
}