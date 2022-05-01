package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaximumConsecutiveGapTest {
MaximumConsecutiveGap maximumConsecutiveGap=new MaximumConsecutiveGap();
    @Test
    public void get() {
        Integer[] arr={1,10,5};
       assertThat(maximumConsecutiveGap.get(listOf(arr)),is(5));
    }

    @Test
    public void get_1() {
        Integer[] arr={1,7,4,2};
        assertThat(maximumConsecutiveGap.get(listOf(arr)),is(3));
    }

    @Test
    public void get_2() {
        Integer[] arr={1,3,15,17};
        assertThat(maximumConsecutiveGap.get(listOf(arr)),is(12));
    }

     @Test
    public void get_3() {
        Integer[] arr={15,3,17,12,1};
        assertThat(maximumConsecutiveGap.get(listOf(arr)),is(9));
    }

    @Test
    public void get_4() {
        Integer[] arr={3,7,9,13};
        assertThat(maximumConsecutiveGap.get(listOf(arr)),is(4));
    }

    @Test
    public void get_5() {
        Integer[] arr = {1, 1, 4, 1, 6};
        assertThat(maximumConsecutiveGap.get(listOf(arr)), is(3));
    }

    @Test
    public void get_6() {
        Integer[] arr = {100, 100, 100, 100};
        assertThat(maximumConsecutiveGap.get(listOf(arr)), is(0));
    }

    @Test
    public void get_7() {
        Integer[] arr = {1, 1, 2};
        assertThat(maximumConsecutiveGap.get(listOf(arr)), is(1));
    }
        public static ArrayList<Integer> listOf(Integer[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }
}