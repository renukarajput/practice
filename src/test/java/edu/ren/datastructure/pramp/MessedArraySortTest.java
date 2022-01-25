package edu.ren.datastructure.pramp;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MessedArraySortTest {

    MessedArraySort m = new MessedArraySort();

    @Test
    public void input_1() {
        int[] input = {1, 4, 5, 2, 3, 7, 8, 6, 10, 9};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] actual = m.sortKMessedArray_(input, 2);
        System.out.println("======= "+ Arrays.toString(actual));
        assertThat(actual, is(expected));
    }

    @Test
    public void input_2() {
        int[] input = {6, 5, 3, 2, 8, 10, 9};
        int[] expected = {2, 3, 5, 6, 8, 9, 10};
        int[] actual = m.sortKMessedArray_(input, 3);
        assertThat(actual, is(expected));
    }

    @Test
    public void input_3() {
        int[] input = {6, 5, 3, 2, 8, 10, 9};
        int[] expected = {2, 3, 5, 6, 8, 9, 10};
        int[] actual = m.sortKMessedArray(input, 3);
        assertThat(actual, is(expected));
    }
}