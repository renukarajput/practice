package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RearrangeArrayTest {

    @Test
    public void inputForExtraSpace1() {
        int[] input = {5, 3, 0, 0, 0, 7, 2, 0, 1, 0, 8};
        int[] output = new RearrangeArray().rearrangeArray(input);
        int[] arrangedArr = {0, 0, 0, 0, 0, 5, 3, 7, 2, 1, 8};
        assertArrayEquals(output, arrangedArr);
    }

    @Test
    public void inputForExtraSpace2() {
        int[] input = {1, 3, 0, 0, 0};
        int[] output = new RearrangeArray().rearrangeArray(input);
        int[] arrangedArr = {0, 0, 0, 1, 3};
        assertArrayEquals(output, arrangedArr);
    }

    @Test
    public void inputForExtraSpace3() {
        int[] input = {1, 0, 3, 5, 0};
        int[] output = new RearrangeArray().rearrangeArray(input);
        int[] arrangedArr = {0, 0, 1, 3, 5};
        assertArrayEquals(output, arrangedArr);
    }

    @Test
    public void inputForExtraSpace4() {
        int[] original = {1, 0, 3, 4, 0};
        int[] output = new RearrangeArray().rearrangeArray(original);
        int[] arrangedArr = {0, 0, 1, 3, 4};
        assertArrayEquals(output, arrangedArr);
    }

    @Test
    public void inputForExtraSpace5() {
        int[] original = {1, 2, 3, 0, 4, 5};
        int[] output = new RearrangeArray().rearrangeArray(original);
        int[] arrangedArr = {0, 1, 2, 3, 4, 5};
        assertArrayEquals(output, arrangedArr);
    }

    @Test
    public void pushZerosToStartInput_1() {
        int[] input = {1, 3, 0, 0, 0};
        new RearrangeArray().pushZerosToStart(input);
        int[] arrangedArr = {0, 0, 0, 1, 3};
        assertArrayEquals(input, arrangedArr);
    }

    @Test
    public void pushZerosToStartInput_2() {
        int[] original = {1, 0, 3, 4, 0};
        new RearrangeArray().pushZerosToStart(original);
        int[] arrangedArr = {0, 0, 1, 3, 4};
        assertArrayEquals(original, arrangedArr);
    }

    @Test
    public void pushZerosToStartInput_3() {
        int[] original = {5, 3, 0, 0, 0, 7, 2, 0, 1, 0, 8};
        new RearrangeArray().pushZerosToStart(original);
        int[] arrangedArr = {0, 0, 0, 0, 0, 5, 3, 7, 2, 1, 8};
        assertArrayEquals(original, arrangedArr);
    }

    @Test
    public void pushZerosToEndInput_1() {
        int[] input = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        new RearrangeArray().pushZerosToEnd(input, input.length);
        int[] arrangedArr = {1, 9, 8, 4, 2, 7, 6, 9, 0, 0, 0, 0};
        assertArrayEquals(input, arrangedArr);
    }
    @Test
    public void pushZerosToEndInput_2() {
        int[] input = {1, 9, 8, 4, 0, 0, 2, 7};
        new RearrangeArray().pushZerosToEnd(input, input.length);
        int[] arrangedArr = {1, 9, 8, 4, 2, 7, 0, 0};
        assertArrayEquals(input, arrangedArr);
    }

    @Test
    public void pushZerosToEndInput_3() {
        int[] input = {5, 3, 0, 0, 0, 7, 2, 0, 1, 0, 8};
        new RearrangeArray().pushZerosToEnd(input, input.length);
        int[] arrangedArr = {5, 3, 7, 2, 1, 8, 0, 0, 0, 0, 0};
        assertArrayEquals(input, arrangedArr);
    }
}