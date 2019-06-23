package edu.ren.geeks.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class WaysToReachTest {

    WaysToReach ways = new WaysToReach();

    @Test
    public void get_1() {
        assertEquals(8, ways.fibb(5));
    }

    @Test
    public void get_2() {
        assertEquals(1, ways.fibb(1));
    }

    @Test
    public void get_3() {
        assertEquals(2, ways.fibb(2));
    }

    @Test
    public void get_4() {
        assertEquals(5, ways.fibb(4));
    }

}