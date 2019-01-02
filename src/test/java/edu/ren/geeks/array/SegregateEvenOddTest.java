package edu.ren.geeks.array;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SegregateEvenOddTest {

    SegregateEvenOdd segregateEvenOdd = new SegregateEvenOdd();

    @Test
    public void input_1() {
        int[] actual = {1, 9, 5, 3, 2, 8, 6, 7, 11};
        int[] output = segregateEvenOdd.segregateEvenOdds(actual);
        int[] expected = {2, 8, 6, 1, 9, 5, 3, 7, 11};
        assertThat(output, is(expected));
    }

    @Test
    public void input_2() {
        int[] actual = {2, 8, 6, 5, 4, 10};
        int[] output = segregateEvenOdd.segregateEvenOdds(actual);
        int[] expected = {2, 8, 6, 4, 10, 5};
        assertThat(output, is(expected));
    }

    @Test
    public void input_3() {
        int[] actual = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] output = segregateEvenOdd.segregateEvenOdds(actual);
        int[] expected = {2, 4, 6, 8, 1, 3, 5, 7};
        assertThat(output, is(expected));
    }

    @Test
    public void input_4() {
        int[] actual = {10, 19, 55, 32, 20, 89, 61, 77};
        int[] output = segregateEvenOdd.segregateEvenOdds(actual);
        int[] expected = {10, 32, 20, 19, 55, 89, 61, 77};
        assertThat(output, is(expected));
    }

    @Test
    public void input_5() {
        int[] actual = {2, 3, 5, 6, 7, 8};
        int[] output = segregateEvenOdd.segregateEvenOdds(actual);
        int[] expected = {2, 6, 8, 3, 5, 7};
        assertThat(output, is(expected));
    }
    @Test
    public void input_6() {
        int[] actual = {2};
        int[] output = segregateEvenOdd.segregateEvenOdds(actual);
        int[] expected = {2};
        assertThat(output, is(expected));
    }
}