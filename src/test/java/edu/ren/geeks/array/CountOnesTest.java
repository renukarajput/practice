package edu.ren.geeks.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CountOnesTest {
    @Test
    public void countNoOfOne_1() {
        int[] input = {1, 1, 1, 1, 1, 1, 0, 0, 0};
        int output = CountOnes.countNoOfOne(input, 0, input.length - 1);
        assertThat(output, is(6));
    }

    @Test
    public void countNoOfOne_2() {
        int[] input = {1, 1, 1, 0, 0, 0};
        int output = CountOnes.countNoOfOne(input, 0, input.length - 1);
        assertThat(output, is(3));
    }

    @Test
    public void countNoOfOne_3() {
        int[] input = {1, 1, 1, 1, 0};
        int output = CountOnes.countNoOfOne(input, 0, input.length - 1);
        assertThat(output, is(4));
    }

    @Test
    public void countNoOfOne_4() {
        int[] input = {1, 0, 0, 0, 0};
        int output = CountOnes.countNoOfOne(input, 0, input.length - 1);
        assertThat(output, is(1));
    }

}