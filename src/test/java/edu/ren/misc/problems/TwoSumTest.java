package edu.ren.misc.problems;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TwoSumTest {
    TwoSum twoSum = new TwoSum();

    @Test
    public void indicesOfTwoNum_1() {
        int[] arr = {2, 7, 11, 15};
        int[] expected = {2, 7};
        assertArrayEquals(expected, twoSum.twoNums(arr, 9));
    }

    @Test
    public void indicesOfTwoNumForSortedArray() {
        int[] arr = {1,2,3,4,5};
        int[] expected = {4,5};
        assertArrayEquals(expected, twoSum.getTwoNumbers(arr, 9));
    }

    @Test
    public void indicesOfTwoNum_2() {
        int[] arr = {2, 7, 11, 15};
        int[] expected = {7, 15};
        assertArrayEquals(expected, twoSum.twoNums(arr, 22));
    }

    @Test
    public void indicesOfTwoNum_3() {
        int[] arr = {2, 7, 11, 15};
        int[] expected = {7, 11};
        assertArrayEquals(expected, twoSum.twoNums(arr, 18));
    }

    @Test
    public void indicesOfTwoNum_01() {
        int[] arr = {2, 7, 11, 15};
        int[] expected = {0,1};
        assertArrayEquals(expected, twoSum.indicesOfTwoNum(arr, 9));
    }

    @Test
    public void indicesOfTwoNum_02() {
        int[] arr = {2, 7, 11, 15};
        int[] expected = {1,3};
        assertArrayEquals(expected, twoSum.indicesOfTwoNum(arr, 22));
    }

    @Test
    public void indicesOfTwoNum_03() {
        int[] arr = {2, 7, 11, 15};
        int[] expected = {1,2};
        assertArrayEquals(expected, twoSum.indicesOfTwoNum(arr, 18));
    }
}