package edu.ren.datastructure.interviewBit.stack;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class LargestRectangeInHistogramTest {
    LargestRectangeInHistogram largestRectangeInHistogram = new LargestRectangeInHistogram();

    @Test
    public void getMaxArea() {
        int[] arr = {1, 5, 6, 4, 8, 9, 7, 2};
        assertThat(largestRectangeInHistogram.getMaxArea(arr), is(24));
    }

    @Test
    public void getMaxArea_1() {
        int[] arr = {6, 2, 5, 4, 5, 1, 6};
        assertThat(largestRectangeInHistogram.getMaxArea(arr), is(12));
    }


    @Test
    public void nearestSmallestElementsOnRight() {
        int[] arr = {1, 5, 6, 4, 8, 9, 7, 2};
        int[] nearestSmallerOnRight = largestRectangeInHistogram.indexOfNearestSmallestElementsOnRight(arr);
        int[] expected = {-1, 4, 4, 2, 7, 7, 2, -1};
        transformIndexesToElements(arr, nearestSmallerOnRight);
        assertThat(nearestSmallerOnRight, is(expected));
    }

    protected void transformIndexesToElements(int[] arr, int[] nearestSmallerIndexes) {
        for (int i = 0; i < nearestSmallerIndexes.length; i++) {
            if (nearestSmallerIndexes[i] != -1)
                nearestSmallerIndexes[i] = arr[nearestSmallerIndexes[i]];
        }
    }

    @Test
    public void nearestSmallestElementsOnRight_increasing() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] nearestSmallersOnRight = largestRectangeInHistogram.indexOfNearestSmallestElementsOnRight(arr);
        transformIndexesToElements(arr, nearestSmallersOnRight);
        int[] expected = {-1, -1, -1, -1, -1};
        assertThat(nearestSmallersOnRight, is(expected));
    }

    @Test
    public void nearestSmallestElementsOnRight_decreasing() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] nearestSmallersOnRight = largestRectangeInHistogram.indexOfNearestSmallestElementsOnRight(arr);
        transformIndexesToElements(arr, nearestSmallersOnRight);
        int[] expected = {4, 3, 2, 1, -1};
        assertThat(nearestSmallersOnRight, is(expected));
    }

    @Test
    public void nearestSmallestElementsOnLeft_decreasing() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] nearestSmallersOnLeft = largestRectangeInHistogram.indexOfNearestSmallestElementsOnLeft(arr);
        transformIndexesToElements(arr, nearestSmallersOnLeft);
        int[] expected = {-1, -1, -1, -1, -1};
        assertThat(nearestSmallersOnLeft, is(expected));
    }

    @Test
    public void nearestSmallestElementsOnLeft_increasing() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] nearestSmallersOnLeft = largestRectangeInHistogram.indexOfNearestSmallestElementsOnLeft(arr);
        transformIndexesToElements(arr, nearestSmallersOnLeft);
        int[] expected = {-1, 1, 2, 3, 4};
        assertThat(nearestSmallersOnLeft, is(expected));
    }

    @Test
    public void nearestSmallestElementsOnLeft() {
        int[] arr = {1, 5, 6, 4, 8, 9, 7, 2};
        int[] nearestSmallersOnLeft = largestRectangeInHistogram.indexOfNearestSmallestElementsOnLeft(arr);
        transformIndexesToElements(arr, nearestSmallersOnLeft);
        int[] expected = {-1, 1, 5, 1, 4, 8, 4, 1};
        assertThat(nearestSmallersOnLeft, is(expected));
    }
}