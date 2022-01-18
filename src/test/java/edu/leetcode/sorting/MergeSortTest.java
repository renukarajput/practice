package edu.leetcode.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void merge() {
        int[] nums = {1, 4, 7, 2, 6, 8};
        new MergeSort().merge(nums,0,2,5);
        System.out.println(Arrays.toString(nums));
    }
}
//{1, 4, 7, 2, 6, 8}
//{1, 2, 7, 4, 6, 8}
//{1, 2, 4, 7, 6, 8}