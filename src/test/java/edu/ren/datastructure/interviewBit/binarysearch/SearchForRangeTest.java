package edu.ren.datastructure.interviewBit.binarysearch;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SearchForRangeTest {
SearchForRange searchForRange=new SearchForRange();

   @Test
    public void rangeOf() {
    Integer[] arr={1,2,2,3,3,3,4,5,6,7,7,7,8,8,9,10};
        assertThat(searchForRange.rangeOf(Arrays.asList(arr), 8),is(new int[]{12,13}));
    }

    @Test
    public void rangeOf_1() {
    Integer[] arr={1,2,2,3};
        assertThat(searchForRange.rangeOf(Arrays.asList(arr), 3),is(new int[]{3,3}));
    }
    @Test
    public void rangeOf_2() {
    Integer[] arr={1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        assertThat(searchForRange.rangeOf(Arrays.asList(arr), 10),is(new int[]{118,133}));
    }

    @Test
    public void rangeOfMissing() {
    Integer[] arr={1,2,2,3,3,3,4,5,6,7,7,7,8,8,9,10};
        assertThat(searchForRange.rangeOf(Arrays.asList(arr), 12),is(new int[]{-1,-1}));
    }
}