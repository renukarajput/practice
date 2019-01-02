package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
public abstract class LongestArithmeticProgressionAbstractTest {
    LongestArithmeticProgression longestProgression = getLongestArithmeticProgression();

    protected abstract LongestArithmeticProgression getLongestArithmeticProgression();

    @Test
    public void len() {
        Integer[] arr = {9, 4, 7, 2, 10};
        expectLengthIs(arr, 3);
    }


    @Test
    public void len_1() {
        Integer[] arr = {1, 4, 7, 10, 12};
        expectLengthIs(arr, 4);
    }

    @Test
    public void len_2() {
        Integer[] arr = {1, 4, 7, 5,10, 12,14,13,8,16,20};
        expectLengthIs(arr, 6);
    }

    @Test
    public void len_3() {
    Integer[] arr={1, 7, 10, 15, 27, 29};
    expectLengthIs(arr, 3);
    }

    @Test
    public void len_4() {
    Integer[] arr={5, 10, 15, 20, 25, 30};
    expectLengthIs(arr, 6);
    }

    protected void expectLengthIs(Integer[] arr, int len) {
      //  System.out.println(Arrays.toString(arr));
        assertThat(longestProgression.len(arr), is(len));
    }
}