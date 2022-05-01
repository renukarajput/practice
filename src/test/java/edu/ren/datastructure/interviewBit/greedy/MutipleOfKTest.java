package edu.ren.datastructure.interviewBit.greedy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MutipleOfKTest {
    MutipleOfK mutipleOfK = new MutipleOfK();

    @Test
    public void modify_1() {
        int arr[] = {4, 5, 6};
        assertEquals(2, mutipleOfK.modify(arr, 5));
    }

    @Test
    public void modify_2() {
        int arr[] = {4, 9, 6};
        assertEquals(3, mutipleOfK.modify(arr, 5));
    }

    @Test
    public void modify_3() {
        int arr[] = {4, 8, 6};
        assertEquals(3, mutipleOfK.modify(arr, 5));
    }

    @Test
    public void modify_4() {
        int arr[] = {4, 5, 6, 7, 10, 15, 9};
        assertEquals(4, mutipleOfK.modify(arr, 5));
    }
}