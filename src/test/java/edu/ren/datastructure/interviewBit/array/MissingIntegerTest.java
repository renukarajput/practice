package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by rrn3194 on 11/16/18.
 */
public class MissingIntegerTest {
    MissingInteger mi = new MissingInteger();

    @Test
    public void input_1() {
        Integer[] input = {1, 1, 0, -1, -2};
        int output = mi.findFirstMissingInteger(input);
        assertThat(output, is(2));
    }

    @Test
    public void input_loop_break() {
        Integer[] input = {1, 1};
        int output = mi.findFirstMissingInteger(input);
        assertThat(output, is(2));
    }

    @Test
    public void input_2() {
        Integer[] input = {1, 1, 2, 3};
        int output = mi.findFirstMissingInteger(input);
        assertThat(output, is(4));
    }

    @Test
    public void input_3() {
        Integer[] input = {2, 3, -7, 6, 8, 1, -10, 15};
        int output = mi.findFirstMissingInteger(input);
        assertThat(output, is(4));
    }

    @Test
    public void input_4() {
        Integer[] input = {2, 3, 7, 6, 8, -1, -10};
        int output = mi.findFirstMissingInteger(input);
        assertThat(output, is(1));
    }

    @Test
    public void input_5() {
        Integer[] input = {1, 2, 0};
        int output = mi.findFirstMissingInteger(input);
        assertThat(output, is(3));
    }

    @Test
    public void input_6() {
        Integer[] input = {3, 4, -1, 1};
        int output = mi.findFirstMissingInteger(input);
        assertThat(output, is(2));
    }

    @Test
    public void input_7() {
        Integer[] input = {2, 1};
        int output = mi.findFirstMissingInteger(input);
        assertThat(output, is(3));
    }

    @Test
    public void input_8() {
        Integer[] input = {2, 3};
        int output = mi.findFirstMissingInteger(input);
        assertThat(output, is(1));
    }

    @Test
    public void input_9() {
        Integer[] input = {-8, -7, -6};
        int output = mi.findFirstMissingInteger(input);
        assertThat(output, is(1));
    }

    @Test
    public void input_10() {
        Integer[] input = {2, 1, 3, 5, -1, -2};
        int output = mi.findFirstMissingInteger(input);
        assertThat(output, is(4));
    }

    @Test
    public void input_11() {
        Integer[] input = {1, 2, 4, 6, 3, 7, 8};
        int output = mi.findFirstMissingInteger(input);
        assertThat(output, is(5));
    }

    @Test
    public void input_12() {
        Integer[] input = {1, 2, 3, 4, 5};
        int output = mi.findFirstMissingInteger(input);
        assertThat(output, is(6));
    }
}