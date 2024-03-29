package com.leetcode;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NextGreaterPermutationTest {
    NextGreaterPermutation obj = new NextGreaterPermutation();

    @Test
    public void input_0() {
        int[] input = {5, 4, 1, 2, 3}; // 54132
        NextGreaterPermutation.nextPermutation(input);
        int[] expected = {5, 4, 1, 3, 2};
        assertThat(input, is(expected));
    }

    @Test
    public void input_1() {
        int[] input = {1, 2};
        NextGreaterPermutation.nextPermutation(input);
        int[] expected = {2, 1};
        assertThat(input, is(expected));
    }

    @Test
    public void input_2() {
        int[] input = {3, 2, 1};
        NextGreaterPermutation.nextPermutation(input);
        int[] expected = {1,2,3};
        assertThat(input, is(expected));
    }

    @Test
    public void input_3() {
        int[] input = {5, 3, 2, 4, 5, 7};
        NextGreaterPermutation.nextPermutation(input);
        int[] expected = {5, 3, 2, 4, 7,5};
        assertThat(input, is(expected));
    }
    @Test
    public void input_4() {
        int[] input = {5,4,7,5,3,2};
        NextGreaterPermutation.nextPermutation(input);
        int[] expected = {5,5,2,3,4,7};
        assertThat(input, is(expected));
    }
    @Test
    public void input_5() {
        int[] input = {5};
        NextGreaterPermutation.nextPermutation(input);
        int[] expected = {5};
        assertThat(input, is(expected));
    }
}