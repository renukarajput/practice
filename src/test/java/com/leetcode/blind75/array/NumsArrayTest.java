package com.leetcode.blind75.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class NumsArrayTest {
    @Test
    public void sumRange() {
        NumsArray obj = new NumsArray(new int[]{1,2,3,4});
        assertThat(obj.sumRange(1,3), is(9));
    }

    @Test
    public void sumRange_1() {
        NumsArray obj = new NumsArray(new int[]{-2, 0, 3, -5, 2, -1});
        assertThat(obj.sumRange(0,2), is(1));
    }

    @Test
    public void sumRange_2() {
        NumsArray obj = new NumsArray(new int[]{-2, 0, 3, -5, 2, -1});
        assertThat(obj.sumRange(2, 5), is(-1));
    }
    @Test
    public void sumRange_3() {
        NumsArray obj = new NumsArray(new int[]{-2, 0, 3, -5, 2, -1});
        assertThat(obj.sumRange(0, 5), is(-3));
    }
}