package edu.ren.hackerrank.dp;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public abstract class CandiesAbstractTest {
    Candies candies = getCandies();

    protected abstract Candies getCandies();

    @Test
    public void getMin() {
        int[] arr = {4, 6, 4, 5, 6, 2};
        assertThat(candies.getMin(arr), is(10));
    }

    @Test
    public void getMin_1() {
        int[] arr = {1, 2, 2};
        assertThat(candies.getMin(arr), is(4));
    }

    @Test
    public void getMin_01() {
        int[] arr = {5};
        assertThat(candies.getMin(arr), is(1));
    }

    @Test
    public void getMin_001() {
        int[] arr = {1, 2};
        assertThat(candies.getMin(arr), is(3));
    }


    @Test
    public void getMin_2() {
        int[] arr = {2, 4, 2, 6, 1, 7, 8, 9, 2, 1};
        assertThat(candies.getMin(arr), is(19));
    }
}