package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaximumProductTest {
    MaximumProduct maximumProduct = new MaximumProduct();

    @Test
    public void input_0() {
        int[] arr = {1, 4, 3, 6, 7, 0};
        int[] output = maximumProduct.getPairOfMaxProductFrom(arr);
        assertThat(output, is(new int[]{6,7}));
    }

    @Test
    public void input_1() {
        int[] arr = {1, 4, 3, 6, 7, 0};
        int[] output = maximumProduct.getPairOfMaxProductFrom(arr);
        assertThat(output, is(new int[]{6,7}));
    }

    @Test
    public void input_2() {
        int[] arr = {6, -3, -10, 0, 2};
        int[] output = maximumProduct.getPairOfMaxProductFrom(arr);
        assertThat(output, is(new int[]{-3,-10}));
    }

    @Test
    public void input_3() {
        int[] arr = {6, -3, 10, 0, 2};
        int[] output = maximumProduct.getPairOfMaxProductFrom(arr);
        assertThat(output, is(new int[]{6,10}));
    }
    @Test
    public void input_4() {
        int[] arr = {6, -5, 10, -8, -2};
        int[] output = maximumProduct.getPairOfMaxProductFrom(arr);
        assertThat(output, is(new int[]{6,10}));
    }
}