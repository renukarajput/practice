package edu.leetcode.practice2021;

import edu.leetcode.array.MonotonicArray;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonotonicArrayTest {

    MonotonicArray obj = new MonotonicArray();

    @Test
    public void input_1() {
        int arr[] = {1, 2, 2, 3};
        assertTrue(obj.isMonotonic(arr));
    }

    @Test
    public void input_2() {
        int arr[] = {1, 2, 3, 4, 5};
        assertTrue(obj.isMonotonic(arr));
    }

    @Test
    public void input_3() {
        int arr[] = {6, 5, 4, 4};
        assertTrue(obj.isMonotonic(arr));
    }

    @Test
    public void input_4() {
        int arr[] = {1, 3, 2};
        assertFalse(obj.isMonotonic(arr));
    }
    @Test
    public void input_5() {
        int arr[] = {1, 1, 1};
        assertTrue(obj.isMonotonic(arr));
    }
}