package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MaxProductSubArrayTest {
    MaxProductSubArray maxProductSubArray = new MaxProductSubArray();

    @Test
    public void testMaxProductSubArray() {
        int[] arr = {2, 3, -2, 4};
        assertThat(maxProductSubArray.getMaxContigiousProduct(arr), is(6));
    }

    @Test
    public void testMaxProductSubArray_1() {
        int[] arr = {-2, 3, -2, 4};
        assertThat(maxProductSubArray.getMaxContigiousProduct(arr), is(48));
    }

    @Test
    public void testMaxProductSubArray_2() {
        int[] arr = {-2, 30, -3};
        assertThat(maxProductSubArray.getMaxContigiousProduct(arr), is(180));
    }

    @Test
    public void testMaxProductSubArray_3() {
        int[] arr = {-2, 5, -3};
        assertThat(maxProductSubArray.getMaxContigiousProduct(arr), is(30));
    }

    @Test
    public void testMaxProductSubArray_4() {
        int[] arr = {-4, 0, -5, 0};
        assertThat(maxProductSubArray.getMaxContigiousProduct(arr), is(0));
    }

    @Test
    public void testMaxProductSubArray_5() {
        int[] arr = {1, -5, 0};
        assertThat(maxProductSubArray.getMaxContigiousProduct(arr), is(1));
    }

    @Test
    public void testMaxProductSubArray_6() {
        int[] arr = {1, -5, 0, -3, 0, 0, -3, -2, 0, -3, 0};
        assertThat(maxProductSubArray.getMaxContigiousProduct(arr), is(6));
    }

    @Test
    public void testMaxProductSubArray_7() {
        int[] arr = {2, -5, -3, 0, 0, -3, -2, 0, -3, 0};
        assertThat(maxProductSubArray.getMaxContigiousProduct(arr), is(30));
    }

}