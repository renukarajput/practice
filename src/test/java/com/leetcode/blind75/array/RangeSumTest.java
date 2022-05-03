package com.leetcode.blind75.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RangeSumTest {
    @Test
    public void sumRange() {
        RangeSum obj = new RangeSum(new int[]{1,2,3,4});
        assertThat(obj.getSumForGivenIndex(1,3), is(9));
    }

    @Test
    public void sumRange_1() {
        RangeSum obj = new RangeSum(new int[]{-2, 0, 3, -5, 2, -1});
        assertThat(obj.getSumForGivenIndex(0,2), is(1));
    }

    @Test
    public void sumRange_2() {
        RangeSum obj = new RangeSum(new int[]{-2, 0, 3, -5, 2, -1});
        assertThat(obj.getSumForGivenIndex(2, 5), is(-1));
    }
    @Test
    public void sumRange_3() {
        RangeSum obj = new RangeSum(new int[]{-2, 0, 3, -5, 2, -1});
        assertThat(obj.getSumForGivenIndex(0, 5), is(-3));
    }
}