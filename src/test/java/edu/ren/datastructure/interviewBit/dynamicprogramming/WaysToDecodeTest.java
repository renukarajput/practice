package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class WaysToDecodeTest {
    WaysToDecode waysToDecode = new WaysToDecode();

    @Test
    public void numberOfWays() {
        assertThat(waysToDecode.numberOfWays("12"), is(2));
    }

    @Test
    public void numberOfWays_1() {
        assertThat(waysToDecode.numberOfWays("123"), is(3));
    }

    @Test
    public void numberOfWays_2() {
        assertThat(waysToDecode.numberOfWays("261105"), is(2));
    }

    @Test
    public void numberOfWays_3() {
        assertThat(waysToDecode.numberOfWays("105"), is(1));
    }

    @Test
    public void numberOfWays_4() {
        assertThat(waysToDecode.numberOfWays("10"), is(1));
    }
}