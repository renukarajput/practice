package edu.ren.misc.problems;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SumOfRangeTest {
    SumOfRange sum = new SumOfRange();
    int[] input = {1, 2, 4, 3, 5, 7, 6};

    @Test
    public void input_1() {
        int[][] actual = sum.getSumForGivenRange(input);
        assertThat(actual[2][5], is(19));
    }

    @Test
    public void input_2() {
        int[][] actual = sum.getSumForGivenRange(input);
        assertThat(actual[1][4], is(14));
    }

    @Test
    public void input_3() {
        int[][] actual = sum.getSumForGivenRange(input);
        assertThat(actual[2][3], is(7));
    }

    @Test
    public void input_4() {
        int[] input = {1, 2, 4, 3};
        int[][] actual = sum.getSumForGivenRange(input);
        assertThat(actual[0][3], is(10));
    }

    @Test
    public void input_01() {
        int[] input = {1, 2, 4, 3, 5, 6};
        assertThat(sum.sumOfGivenRange(input, 2, 4), is(12));
    }

    @Test
    public void input_02() {
        int[] input = {1, 2, 4, 3};
        assertThat(sum.sumOfGivenRange(input, 0, 3), is(9));
    }
}