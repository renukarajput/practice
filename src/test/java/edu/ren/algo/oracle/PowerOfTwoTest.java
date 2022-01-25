package edu.ren.algo.oracle;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfTwoTest {
    PowerOfTwo p = new PowerOfTwo();

    @Test
    public void input_0() {
        assertTrue(p.isPowerOfTwo(4));
    }

    @Test
    public void input_1() {
        assertTrue(p.isPowerOfTwo(1));
    }

    @Test
    public void input_2() {
        assertFalse(p.isPowerOfTwo(98));
    }

    @Test
    public void input_3() {
        assertFalse(p.isPowerOfTwo(0));
    }

    @Test
    public void input_4() {
        assertTrue(p.isPowerOfTwo(32));
    }



}