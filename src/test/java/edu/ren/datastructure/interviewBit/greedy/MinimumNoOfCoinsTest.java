package edu.ren.datastructure.interviewBit.greedy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumNoOfCoinsTest {
    MinimumNoOfCoins minimumNoOfCoins = new MinimumNoOfCoins();

    @Test
    public void getMinNoOfCoins_1() {
        int[] arr = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        assertEquals(2, minimumNoOfCoins.getMinNoOfCoins(arr, 70));
    }
    @Test
    public void getMinNoOfCoins_2() {
        int[] arr = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        assertEquals(3, minimumNoOfCoins.getMinNoOfCoins(arr, 121));
    }
    @Test
    public void getMinNoOfCoins_3() {
        int[] arr = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        assertEquals(5, minimumNoOfCoins.getMinNoOfCoins(arr, 93));
    }
    @Test
    public void getMinNoOfCoins_4() {
        int[] arr = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        assertEquals(5, minimumNoOfCoins.getMinNoOfCoins(arr, 87));
    }

    @Test
    public void getMinNoOfCoins_5() {
        int[] arr = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        assertEquals(6, minimumNoOfCoins.getMinNoOfCoins(arr, 1136));
    }

    @Test
    public void getMinNoOfCoins_6() {
        int[] arr = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        assertEquals(5, minimumNoOfCoins.getMinNoOfCoins(arr, 5000));
    }
}