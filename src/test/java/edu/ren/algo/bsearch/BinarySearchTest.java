package edu.ren.algo.bsearch;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void input1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(BinarySearch.indexOfInsertInArray(arr, 9), is(8));
    }

    @Test
    public void input2() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(BinarySearch.indexOfInsertInArray(arr, 4), is(3));
    }

    @Test
    public void input3() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(BinarySearch.indexOfInsertInArray(arr, 12), is(10));
    }

    @Test
    public void input4() {
        int[] arr = {2, 5, 8, 12, 15};  //s0 e4 m2, s3 e4 m3 , s0 e3 m1,
        assertThat(BinarySearch.indexOfInsertInArray(arr, 9), is(3));
    }

    @Test
    public void input5() {
        int[] arr = {2, 5, 8, 12, 15};  //s0 e4 m2, s3 e4 m3 , s0 e3 m1,
        assertThat(BinarySearch.indexOfInsertInArray(arr, 3), is(1));
    }
    @Test
    public void input6() {
        int[] arr = {2, 5, 8, 12, 15};  //s0 e4 m2, s3 e4 m3 , s0 e3 m1,
        assertThat(BinarySearch.indexOfInsertInArray(arr, 1), is(0));
    }

}