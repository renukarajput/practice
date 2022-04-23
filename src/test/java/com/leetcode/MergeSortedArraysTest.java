package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class MergeSortedArraysTest {

    MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();

    @Test
    public void input_1() {
        int[] actual = {1, 2, 3, 0, 0, 0};
        mergeSortedArrays.mergeArr(actual, 3, new int[]{2, 5, 6}, 3);
        Assert.assertThat(actual, is(new int[]{1, 2, 2, 3, 5, 6}));
    }

    @Test
    public void input_2() {
        int[] actual = {0};
        mergeSortedArrays.mergeArr(actual, 0, new int[]{1}, 1);
        Assert.assertThat(actual, is(new int[]{1}));
    }

    @Test
    public void input_3() {
        int[] actual = {1};
        mergeSortedArrays.mergeArr(actual, 1, new int[]{}, 0);
        Assert.assertThat(actual, is(new int[]{1}));
    }
}