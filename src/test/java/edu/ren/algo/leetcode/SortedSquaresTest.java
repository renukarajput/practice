package edu.ren.algo.leetcode;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SortedSquaresTest {
    SortedSquares sortedSquares = new SortedSquares();

    @Test
    public void input_1() {
        int[] actual = sortedSquares.getSquaresInSortedOrder(new int[]{-4, -1, 0, 3, 10});
        assertThat(actual, is(new int[]{0, 1, 9, 16, 100}));
    }

    @Test
    public void input_2() {
        int[] actual = sortedSquares.getSquaresInSortedOrder(new int[]{-7, -3, 2, 3, 11});
        assertThat(actual, is(new int[]{4, 9, 9, 49, 121}));
    }
}