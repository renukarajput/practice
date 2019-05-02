package edu.ren.misc.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstRepeatedInArrayTest extends Object {
    FirstRepeatedInArray firstRepeatedInArray = new FirstRepeatedInArray();

    @Test
    public void input_01() {
        int[] arr = {4, 3, 5, 3, 4, 6, 7, 6};
        assertEquals(4, firstRepeatedInArray.getTheElementUsingMap(arr));
    }

    @Test
    public void input_0() {
        int[] arr = {4, 3, 5, 3, 4, 6, 7, 6};
        assertEquals(4, firstRepeatedInArray.getTheElementUsingMap(arr));
    }

    @Test
    public void input_1() {
        int[] arr = {1, 2, 3, 2, 1, 3};
        assertEquals(1, firstRepeatedInArray.getTheElementUsingMap(arr));
    }

    @Test
    public void input_2() {
        int[] arr = {4, 3, 4, 5, 3, 4, 6, 7, 6};
        assertEquals(4, firstRepeatedInArray.getTheElementUsingMap(arr));
    }

    @Test
    public void input_3() {
        int[] arr = {5, 3, 4, 6, 7, 5, 3};
        assertEquals(5, firstRepeatedInArray.getTheElementUsingMap(arr));
    }

    @Test
    public void input_4() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(-1, firstRepeatedInArray.getTheElementUsingMap(arr));
    }

    @Test
    public void input_5() {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        assertEquals(5, firstRepeatedInArray.getTheElementUsingMap(arr));
    }

    @Test
    public void input_6() {
        int[] arr = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        assertEquals(6, firstRepeatedInArray.getTheElementUsingMap(arr));
    }

    @Test
    public void input_7() {
        int[] arr = {4, 3, 5, 3, 6, 7, 6, 4};
        assertEquals(4, firstRepeatedInArray.getTheElementUsingMap(arr));
    }

    @Test
    public void input_8() {
        int[] arr = {2, 5, 6, 4, 5, 4, 9, 3, 5, 7};
        assertEquals(5, firstRepeatedInArray.getTheElementUsingMap(arr));
    }
}