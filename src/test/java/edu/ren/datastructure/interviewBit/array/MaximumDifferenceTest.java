package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class MaximumDifferenceTest {
    MaximumDifference maximumDiff = new MaximumDifference();

    @Test
    public void input_1() {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int[] output = maximumDiff.getPairOfMaxDiff(arr);
        assertThat(output, is(new int[]{8, 1}));
    }

    @Test
    public void input_2() {
        int[] arr = {4, 3, 9, 11, 15, 13};
        int[] output = maximumDiff.getPairOfMaxDiff(arr);
        assertThat(output, is(new int[]{15, 3}));
    }

    @Test
    public void input_3() {
        int[] arr = {4, 3, 1, 9, 11, 15, 13};
        int[] output = maximumDiff.getPairOfMaxDiff(arr);
        assertThat(output, is(new int[]{15, 1}));
    }

}