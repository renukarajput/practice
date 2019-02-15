package edu.ren.misc.problems;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ArrayUpdateTest {
    ArrayUpdate arrayUpdate = new ArrayUpdate();

    @Test
    public void input_1() {
        int[] arr = {1, 2, 3, 4, 5};
        int actual = arrayUpdate.getX(arr);
        assertThat(actual, is(4));
    }

    @Test
    public void input_2() {
        int[] arr = {6, 8, 1, 4, 2, 5};
        int actual = arrayUpdate.getX(arr);
        assertThat(actual, is(5));
    }

    @Test
    public void input_3() {
        int[] arr = {6, 8, 1, 4, 2, 5, 10};
        int actual = arrayUpdate.getX(arr);
        assertThat(actual, is(6));
    }
}