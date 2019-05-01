package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class NoOfWaysToReachEndTest {
    NoOfWaysToReachEnd noOfWaysToReachEnd = new NoOfWaysToReachEnd();

    @Test
    public void get() {
        assertEquals(13, noOfWaysToReachEnd.getRec(5));
    }

    @Test
    public void get_() {
        assertEquals(13, noOfWaysToReachEnd.get_(5));
    }

    @Test
    public void getRec() {
        assertEquals(13, noOfWaysToReachEnd.getRec(5));
    }
}