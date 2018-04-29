package edu.ren.algo.bsearch;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RangeBinarySearchTest {

    @Test
    public void binSearch() {
        Integer[] a={2,4,6,7,9,12,13,17};
       assertThat(new RangeBinarySearch<Integer>().getIndexUsingBinarySearch(a,7).get(),is(3));
        assertThat(new RangeBinarySearch<Integer>().getIndexUsingBinarySearch(a,12).get(),is(5));
        assertThat(new RangeBinarySearch<Integer>().getIndexUsingBinarySearch(a,1).isPresent(),is(false));
    }
    @Test
    public void binSearchWithSingleElement() {
        Integer[] a={2};
        assertThat(new RangeBinarySearch<Integer>().getIndexUsingBinarySearch(a,2).get(),is(0));
    }

    @Test
    public void binSearchRangeIndexForAnElement() {
        Integer[] a={5,7,7,8,8,10};
        int[] rangeIndexUsingBinarySearch = new RangeBinarySearch<Integer>().getRangeIndexUsingBinarySearch(a, 8);
        assertThat(rangeIndexUsingBinarySearch[0],is(3));
        assertThat(rangeIndexUsingBinarySearch[1],is(4));
    }

    @Test
    public void binSearchRangeIndexForAnElement2() {
        Integer[] a={5,7,7,8,8,10,12,12,12,12,13,14};
        int[] rangeIndexUsingBinarySearch = new RangeBinarySearch<Integer>().getRangeIndexUsingBinarySearch(a, 12);
        assertThat(rangeIndexUsingBinarySearch[0],is(6));
        assertThat(rangeIndexUsingBinarySearch[1],is(9));
    }
}