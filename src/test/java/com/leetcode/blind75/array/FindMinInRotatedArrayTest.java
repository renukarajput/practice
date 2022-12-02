package com.leetcode.blind75.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FindMinInRotatedArrayTest {

    @Test
    public void findMin() {
        assertThat(new FindMinInRotatedArray().findMin(new int[]{3, 4, 5, 1, 2}), is(1));
    }

    @Test
    public void findMin_1() {
        assertThat(new FindMinInRotatedArray().findMin(new int[]{4, 5, 6, 7, 0, 1, 2}), is(0));
    }

    @Test
    public void findMin_2() {
        assertThat(new FindMinInRotatedArray().findMin(new int[]{4, 5, 6, 7, 2, 3}), is(2));
    }

    @Test
    public void findMin_3() {
        assertThat(new FindMinInRotatedArray().findMin(new int[]{11, 13, 15, 17}), is(11));
    }

    @Test
    public void findMin_4() {
        assertThat(new FindMinInRotatedArray().findMin(new int[]{1, 2}), is(1));
        assertThat(new FindMinInRotatedArray().findMin(new int[]{2,1}), is(1));
    }
}