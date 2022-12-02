package com.leetcode.blind75.binary;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MissingNumberInGivenRangeTest {
    MissingNumberInGivenRange obj = new MissingNumberInGivenRange();

    @Test
    public void missingNumber() {
        assertThat(obj.missingNumber(new int[]{3, 0, 1}), is(2));
    }

    @Test
    public void missingNumber_1() {
        assertThat(obj.missingNumber(new int[]{0, 1}), is(2));
    }

    @Test
    public void missingNumber_2() {
        assertThat(obj.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}), is(8));
    }

    @Test
    public void missingNumber_3() {
        assertThat(obj.missingNumber(new int[]{2, 3, 5, 1, 0}), is(4));
    }

    @Test
    public void missingNumber_4() {
        assertThat(obj.missingNumber(new int[]{2, 3, 1, 4}), is(0));
    }
    @Test
    public void missingNumber_5() {
        assertThat(obj.missingNumber(new int[]{1}), is(0));
    }
}