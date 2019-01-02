package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaximumDifferenceTest {
    MaximumDifference maximumDiff = new MaximumDifference();

    @Test
    public void input_1() {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int output = maximumDiff.getPairOfMaxDiff(arr);
        assertThat(output, is(7));
    }

    @Test
    public void input_2() {
        int[] arr = {4, 3, 9, 11, 15, 13};
        int output = maximumDiff.getPairOfMaxDiff(arr);
        assertThat(output, is(12));
    }

    @Test
    public void input_3() {
        int[] arr = {4, 3, 1, 9, 11, 15, 13};
        int output = maximumDiff.getPairOfMaxDiff(arr);
        assertThat(output, is(14));
    }

    @Test
    public void input_4() {
        int[] arr = {9, 4, 7, 3, 6, 1, 2};
        int output = maximumDiff.getPairOfMaxDiff(arr);
        assertThat(output, is(3));
    }

    @Test
    public void input_5() {
        int[] arr = {-9, -4, 7, 3, -6, 1, -2};
        int output = maximumDiff.getPairOfMaxDiff(arr);
        assertThat(output, is(16)); // 7-(-9)=16
    }

}