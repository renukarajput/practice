package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaximumProductOptimizedTest {
    MaximumProductOptimized maximumProduct = new MaximumProductOptimized();

    @Test
    public void input_0() {
        int[] arr = {1, 4, 3, 6, 7, 0};
        int output = maximumProduct.getMaxProductUsingPriorityQueue(arr, 2);
        assertThat(output, is(42));
    }

    @Test
    public void input_1() {
        int[] arr = {1, 4, 3, 6, 7, 0};
        int output = maximumProduct.getMaxProductUsingPriorityQueue(arr, 2);
        assertThat(output, is(42));
    }

    @Test
    public void input_2() {
        int[] arr = {6, -3, -10, 0, 2};
        int output = maximumProduct.getMaxProductUsingPriorityQueue(arr, 2);
        assertThat(output, is(30));
    }

    @Test
    public void input_3() {
        int[] arr = {6, -3, 10, 0, 2};
        int output = maximumProduct.getMaxProductUsingPriorityQueue(arr, 2);
        assertThat(output, is(60));
    }

    @Test
    public void input_4() {
        int[] arr = {6, -5, 10, -8, -2};
        int output = maximumProduct.getMaxProductUsingPriorityQueue(arr, 2);
        assertThat(output, is(60));
    }

    @Test
    public void input_5() {
        int[] arr = {6, 5, 4, 8, 2};
        int output = maximumProduct.getMaxProductUsingPriorityQueue(arr, 2);
        assertThat(output, is(48));
    }

    @Test
    public void input_6() {
        int[] arr = {1, 4, 3, 6, 7, 0};
        int output = maximumProduct.getMaxProductUsingPriorityQueue(arr, 2);
        assertThat(output, is(42));
    }

    @Test
    public void input_7() {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int output = maximumProduct.getMaxProductUsingPriorityQueue(arr, 2);
        assertThat(output, is(56));
    }

    @Test
    public void input_07() {
        int[] arr = {8, 7, 6, 5, 4, 3, 2, 1};
        int output = maximumProduct.getMaxProductUsingPriorityQueue(arr, 2);
        assertThat(output, is(56));
    }

    @Test
    public void input_8() {
        int[] arr = {-1, 2, -4, 6, 3, 7, -8};
        int output = maximumProduct.getMaxProductUsingPriorityQueue(arr, 2);
        assertThat(output, is(42));
    }

    @Test
    public void input_9() {
        int[] arr = {-1, -2, -4, -6, -3, -7, -8};
        int output = maximumProduct.getMaxProductUsingPriorityQueue(arr, 2);
        assertThat(output, is(56));
    }

    @Test
    public void input_10() {
        int[] arr = {1, 2, -4, 6, -3, 7, -8, -9};
        int output = maximumProduct.getMaxProductUsingPriorityQueue(arr, 3);
        assertThat(output, is(504));
    }

/*    @Test
    public void input_11() {
        int[] arr = {1, 2, 4, 6, -3, 7, -80, -90};
        int output = maximumProduct.getMaxProductUsingPriorityQueue(arr, 4);
        assertThat(output, is(302400));
    }*/

}