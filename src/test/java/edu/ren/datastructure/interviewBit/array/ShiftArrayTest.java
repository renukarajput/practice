package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class ShiftArrayTest {

    @Test
    public void shiftArrayBy1() {
        int[] original = {1, 2, 3, 0, 4, 5};
        new ShiftArray().shiftRightArrayBy1(original);
        assertArrayEquals(new int[]{5, 1, 2, 3, 0, 4},original);
    }

    @Test
    public void shiftArrayKTimes() {
        int[] original = {1, 2, 3, 4, 5};
        new ShiftArray().shiftRightKTimes(original,2);
        assertArrayEquals(new int[]{4, 5, 1, 2, 3},original);
    }

    @Test
    public void shiftArrayKTimesRecursively() {
        int[] original = {1, 2, 3, 4, 5};
        new ShiftArray().shiftRightKRecursive(original,2);
        assertArrayEquals(new int[]{4, 5, 1, 2, 3},original);
    }

    @Test
    public void shiftRightArrayByOne() {
        int[] original = {1, 2, 3, 0, 4, 5};
        new ShiftArray().shiftRightArrayByOne(original);
        System.out.println(Arrays.toString(original));
        assertArrayEquals(new int[]{5, 1, 2, 3, 0, 4},original);
    }

    @Test
    public void shiftArrayUsingArrayCopyInput2() {
        int[] original = {1, 2, 3, 4, 5};
        new ShiftArray().shiftArrayUsingArrayCopy(original,2);
        assertArrayEquals(new int[]{4, 5, 1, 2, 3},original);
    }

    @Test
    public void shiftArrayUsingArrayCopyInput3() {
        int[] original = {1, 2, 3, 4, 5};
        new ShiftArray().shiftArrayUsingArrayCopy(original,3);
        assertArrayEquals(new int[]{3, 4, 5, 1, 2},original);
    }

    @Test
    public void shiftArrayUsingArrayCopyInput1() {
        int[] original = {1, 2, 3, 4, 5};
        new ShiftArray().shiftArrayUsingArrayCopy(original,1);
        assertArrayEquals(new int[]{5, 1, 2, 3, 4},original);
    }

    @Test
    public void shiftArrayUsingTemp() {
        int[] original = {1, 2, 3, 4, 5};
        new ShiftArray().shiftArrayUsingTemp(original,1);
        assertArrayEquals(new int[]{5, 1, 2, 3, 4},original);
    }
}