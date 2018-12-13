package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaximumProductOptimizedTest {
    MaximumProductOptimized maximumProduct = new MaximumProductOptimized();

    @Test
    public void input_0() {
        int[] arr = {1, 4, 3, 6, 7, 0};
        int[] output = maximumProduct.getPairOfMaxProductFromOptimized(arr);
        assertThat(output, is(new int[]{6,7}));
    }

    @Test
    public void input_1() {
        int[] arr = {1, 4, 3, 6, 7, 0};
        int[] output = maximumProduct.getPairOfMaxProductFromOptimized(arr);
        assertThat(output, is(new int[]{6,7}));
    }

    @Test
    public void input_2() {
        int[] arr = {6, -3, -10, 0, 2};
        int[] output = maximumProduct.getPairOfMaxProductFromOptimized(arr);
        assertThat(output, is(new int[]{-3,-10}));
    }

    @Test
    public void input_3() {
        int[] arr = {6, -3, 10, 0, 2};
        int[] output = maximumProduct.getPairOfMaxProductFromOptimized(arr);
        assertThat(output, is(new int[]{6,10}));
    }
    @Test
    public void input_4() {
        int[] arr = {6, -5, 10, -8, -2};
        int[] output = maximumProduct.getPairOfMaxProductFromOptimized(arr);
        assertThat(output, is(new int[]{6,10}));
    }

    @Test
    public void input_5() {
        int[] arr = {6, 5, 4, 8, 2};
        int[] output = maximumProduct.getPairOfMaxProductUsingPriorityQueue(arr);
        assertThat(output, is(new int[]{6,8}));
    }

    @Test
    public void input_6() {
        int[] arr = {1, 4, 3, 6, 7, 0};
        int[] output = maximumProduct.getPairOfMaxProductUsingPriorityQueue(arr);
        assertThat(output, is(new int[]{6,7}));
    }

    @Test
    public void input_7() {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int[] output = maximumProduct.getPairOfMaxProductUsingPriorityQueue(arr);
        assertThat(output, is(new int[]{7,8}));
    }

    @Test
    public void input_07() {
        int[] arr = {8,7,6,5,4,3,2,1};
        int[] output = maximumProduct.getPairOfMaxProductUsingPriorityQueue(arr);
        assertThat(output, is(new int[]{7,8}));
    }

    @Test
    public void input_8() {
        int[] arr = {-1, 2, -4, 6, 3, 7, -8};
        int[] output = maximumProduct.getPairOfMaxProductUsingPriorityQueue(arr);
        assertThat(output, is(new int[]{6,7}));
    }

    @Test
    public void input_9() {
        int[] arr = {-1, -2, -4, -6, -3, -7, -8};
        int[] output = maximumProduct.getPairOfMaxProductUsingPriorityQueue(arr);
        assertThat(output, is(new int[]{-7,-8}));
    }

}