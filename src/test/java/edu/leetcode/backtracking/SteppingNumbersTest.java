package edu.leetcode.backtracking;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SteppingNumbersTest {

    @Test
    public void countSteppingNumbers() {
        List<Integer> nums = new SteppingNumbers().countSteppingNumbers(0, 21);
        assertThat(nums,is(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 21)));

    }

    @Test
    public void countSteppingNumbers_higherThan6() {
        List<Integer> nums = new SteppingNumbers().countSteppingNumbers(6, 21);
        assertThat(nums,is(Arrays.asList(6, 7, 8, 9, 10, 12, 21)));

    }
}