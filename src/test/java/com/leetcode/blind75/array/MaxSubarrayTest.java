package com.leetcode.blind75.array;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaxSubarrayTest {
    MaxSubarray obj = new MaxSubarray();

    @Test
    public void maximumContiguousProduct() {
        assertThat(obj.maximumContiguousProduct(new int[]{2, 3, -2, 4}), is(6));
        assertThat(obj.maximumContiguousProduct(new int[]{-2, 0, -1}), is(0));
        assertThat(obj.maximumContiguousProduct(new int[]{2, 0, 1, 6, 3}), is(18));
    }

    @Test
    public void maximumContiguousProduct_1() {
        assertThat(obj.maximumContiguousProduct(new int[]{-2}), is(-2));
    }

    @Test
    public void maximumContiguousProduct_2() {
        assertThat(obj.maximumContiguousProduct(new int[]{-2, -3}), is(6));
    }

    @Test
    public void maximumContiguousProduct_3() {
        assertThat(obj.maximumContiguousProduct(new int[]{-2, 3, -4}), is(24));
    }

    @Test
    public void testMaxProductSubArray() {
        int[] arr = {2, 3, -2, 4};
        assertThat(obj.maximumContiguousProduct(arr), Matchers.is(6));
    }

    @Test
    public void testMaxProductSubArray_1() {
        int[] arr = {-2, 3, -2, 4};
        assertThat(obj.maximumContiguousProduct(arr), Matchers.is(48));
    }

    @Test
    public void testMaxProductSubArray_2() {
        int[] arr = {-2, 30, -3};
        assertThat(obj.maximumContiguousProduct(arr), Matchers.is(180));
    }

    @Test
    public void testMaxProductSubArray_3() {
        int[] arr = {-2, 5, -3};
        assertThat(obj.maximumContiguousProduct(arr), Matchers.is(30));
    }

    @Test
    public void testMaxProductSubArray_4() {
        int[] arr = {-4, 0, -5, 0};
        assertThat(obj.maximumContiguousProduct(arr), Matchers.is(0));
    }

    @Test
    public void testMaxProductSubArray_5() {
        int[] arr = {1, -5, 0};
        assertThat(obj.maximumContiguousProduct(arr), Matchers.is(1));
    }

    @Test
    public void testMaxProductSubArray_6() {
        int[] arr = {1, -5, 0, -3, 0, 0, -3, -2, 0, -3, 0};
        assertThat(obj.maximumContiguousProduct(arr), Matchers.is(6));
    }

    @Test
    public void testMaxProductSubArray_7() {
        int[] arr = {2, -5, -3, 0, 0, -3, -2, 0, -3, 0};
        assertThat(obj.maximumContiguousProduct(arr), Matchers.is(30));
    }
    @Test
    public void testMaxProductSubArray_8() {
        int[] arr = {2, -5, -3, 0,};
        assertThat(obj.maximumContiguousProduct(arr), Matchers.is(30));
    }
}