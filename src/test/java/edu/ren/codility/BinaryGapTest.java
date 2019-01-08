package edu.ren.codility;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BinaryGapTest {
    BinaryGap binaryGap = new BinaryGap();

    @Test
    public void input_1() {
        int[] input = {1, 0, 0, 0, 1};
        int output = binaryGap.maximumSequenceOFZero(input);
        assertThat(output, is(3));
    }

    @Test
    public void input_2() {
        int[] input = {1, 0, 0, 0, 1, 0, 0, 1};
        int output = binaryGap.maximumSequenceOFZero(input);
        assertThat(output, is(3));
    }

    @Test
    public void input_3() {
        int[] input = {1, 1, 1, 1};
        int output = binaryGap.maximumSequenceOFZero(input);
        assertThat(output, is(0));
    }

    @Test
    public void input_4() {
        int[] input = {1,0,0,0,0,1,0,0,0,1};
        int output = binaryGap.maximumSequenceOFZero(input);
        assertThat(output, is(4));
    }

    @Test
    public void input_5() {
        int[] input = {0,1,1,1,0};
        int output = binaryGap.maximumSequenceOFZero(input);
        assertThat(output, is(0));
    }


    @Test
    public void input_6() {
        int[] input = {0,1,1,1,0,0,0,1,1,0,0};
        int output = binaryGap.maximumSequenceOFZero(input);
        assertThat(output, is(3));
    }
    @Test
    public void input_07() {
        int[] input = {1,0,0,0};
        int output = binaryGap.maximumSequenceOFZero(input);
        assertThat(output, is(0));
    }

    @Test
    public void input_7() {
        String input = Integer.toBinaryString(529);
        System.out.println(input);
        int output = binaryGap.maximumSequenceOFZero(input.toCharArray());
        assertThat(output, is(4));
    }
    @Test
    public void input_8() {
        String input = Integer.toBinaryString(328);
        System.out.println(input);
        int output = binaryGap.maximumSequenceOFZero(input.toCharArray());
        assertThat(output, is(2));
    }
}