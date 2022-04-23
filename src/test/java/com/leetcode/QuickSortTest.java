package com.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QuickSortTest {
    QuickSort obj = new QuickSort();

    @Test
    public void test() {
        int[] arr = new int[]{12, 9, 7, 15, 10};
        final int[] res = obj.sortArray(arr);
        System.out.println(Arrays.toString(res));
        assertThat(obj.sortArray(arr), is(res));
    }

    @Test
    public void test_1() {
        int[] arr = new int[]{15,14,9,4,2,3};
        final int[] res = obj.sortArray(arr);
        System.out.println(Arrays.toString(res));
        assertThat(obj.sortArray(arr), is(res));
    }
}