package edu.ren.algo.oracle;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class IntegerPalindromeTest {
    IntegerPalindrome ip = new IntegerPalindrome();

    @Test
    public void input_1() {
        assertTrue(ip.isPalindromeRec(7557));
    }
    @Test
    public void input_0() {
        assertTrue(ip.isPalindromeRec(7));
    }

    @Test
    public void input_2() {
        assertFalse(ip.isPalindromeRec(578));
    }
    @Test
    public void input_3() {
        assertFalse(ip.isPalindromeRec(7679));
    }

    @Test
    public void input_4() {
        assertThat(ip.isPalindromeRec(89767998),is(false));
    }

    @Test
    public void input_5() {
        assertThat(ip.isPalindromeRec(89766798),is(true));
    }
}