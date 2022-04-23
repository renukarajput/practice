package com.leetcode;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MinimumMovesInArrayTest {

    @Test
    public void input_0() {
        List<Integer> list = Arrays.asList(3, 4, 6, 6, 3);
        assertThat(MinimumMovesInArray.countMoves(list), is(7L));
    }

    @Test
    public void input_1() {
        List<Integer> list = Arrays.asList(5, 6, 8, 8, 5);
        assertThat(MinimumMovesInArray.countMoves(list), is(7L));
    }

    @Test
    public void input_2() {
        List<Integer> list = Arrays.asList(2, 2, 2);
        assertThat(MinimumMovesInArray.countMoves(list), is(0L));
    }

    @Test
    public void input_3() {
        assertThat(MinimumMovesInArray.minMovesToEqualArrElements(new int[]{1,2,3}), is(3));
        assertThat(MinimumMovesInArray.minMovesToEqualArrElements(new int[]{5, 6, 8, 8, 5}), is(7));
        assertThat(MinimumMovesInArray.minMovesToEqualArrElements(new int[]{3, 4, 6, 6, 3}), is(7));
        assertThat(MinimumMovesInArray.minMovesToEqualArrElements(new int[]{2, 2, 2}), is(0));
    }
}