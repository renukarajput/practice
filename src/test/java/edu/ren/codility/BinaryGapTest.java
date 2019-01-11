package edu.ren.codility;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BinaryGapTest {
    //    BinaryGap binaryGap = new BinaryGap();
    BinaryGapUsingStack binaryGap = new BinaryGapUsingStack();

    @Test
    public void input_1() {
        int[] input = {1, 0, 0, 0, 1}; // 17
        int output = binaryGap.maximumSequenceOFZero(input);
        assertThat(output, is(3));
    }

    @Test
    public void input_2() {
        int[] input = {1, 0, 0, 0, 1, 0, 0, 1}; // 137
        int output = binaryGap.maximumSequenceOFZero(input);
        assertThat(output, is(3));
    }

    @Test
    public void input_3() {
        int[] input = {1, 1, 1, 1}; //15
        int output = binaryGap.maximumSequenceOFZero(input);
        assertThat(output, is(0));
    }

    @Test
    public void input_4() {
        int[] input = {1, 0, 0, 0}; //8
        int output = binaryGap.maximumSequenceOFZero(input);
        assertThat(output, is(0));
    }

    @Test
    public void input_5() {
        int[] input = {0, 1, 1, 1, 0}; //14
        int output = binaryGap.maximumSequenceOFZero(input);
        assertThat(output, is(0));
    }


    @Test
    public void input_6() {
        int[] input = {0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0}; // 908
        int output = binaryGap.maximumSequenceOFZero(input);
        assertThat(output, is(3));
    }

    @Test
    public void input_7() {
        String input = Integer.toBinaryString(529);
        System.out.println(input);
        int[] inputArr = {1, 0, 0, 0, 0, 1, 0, 0, 0, 1};
        int output = binaryGap.maximumSequenceOFZero(inputArr);
        assertThat(output, is(4));
    }

    @Test
    public void input_8() {
        String input = Integer.toBinaryString(328);
        System.out.println(input);
        int[] inputArr = {1, 0, 1, 0, 0, 1, 0, 0, 0};
        int output = binaryGap.maximumSequenceOFZero(inputArr);
        assertThat(output, is(2));
    }

    @Test
    public void input_9() {
        String input = Integer.toBinaryString(42);
        System.out.println(input);
        int[] inputArr = {1, 0, 1, 0, 1, 0};
        int output = binaryGap.maximumSequenceOFZero(inputArr);
        assertThat(output, is(1));
    }

    @Test
    public void input_10() {
        String input = Integer.toBinaryString(20);
        System.out.println(input);
        int[] inputArr = {1, 0, 1, 0, 0};
        int output = binaryGap.maximumSequenceOFZero(inputArr);
        assertThat(output, is(1));
    }

    @Test
    public void input_11() {
        String input = Integer.toBinaryString(51712);
        System.out.println(input);
        int[] inputArr = {1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0};
        int output = binaryGap.maximumSequenceOFZero(inputArr);
        assertThat(output, is(2));
    }
}