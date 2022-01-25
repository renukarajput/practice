package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MedianOfSortedArraysOfEqualSizeTest {
    MedianOfSortedArraysOfEqualSize medianOfSortedArraysOfEqualSize = new MedianOfSortedArraysOfEqualSize();

    @Test
    public void median() {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        assertThat(medianOfSortedArraysOfEqualSize.median(arr1, arr2), is(4));
    }

    @Test
    public void median_1() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {10, 20, 30, 40, 50};
        assertThat(medianOfSortedArraysOfEqualSize.median(arr1, arr2), is(7));
    }
}