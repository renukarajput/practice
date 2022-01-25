package edu.ren.datastructure.stack;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NearestSmallerTest {
    NearestSmaller nearestSmaller = new NearestSmaller();

    @Test
    public void input_1() {
        //s ={2,8}
        //4 6 5
        int[] input = {4, 5, 2, 10, 8};
        int[] expected = {-1, 4, -1, 2, 2};
        int[] actual = nearestSmaller.fromLeft(input);
        assertThat(actual, is(expected));
    }

    @Test
    public void input_2() {
        int[] input = {1, 6, 4, 10, 2, 5};
        int[] expected = {-1, 1, 1, 4, 1, 2};
        int[] actual = nearestSmaller.fromLeft(input);
        assertThat(actual, is(expected));
    }

    @Test
    public void input_3() {
        int[] input = {1, 3, 0, 2, 5};
        int[] expected = {-1, 1, -1, 0, 2};
        int[] actual = nearestSmaller.fromLeft(input);
        assertThat(actual, is(expected));
    }
}