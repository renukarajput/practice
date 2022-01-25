package edu.ren.datastructure.leetcode.dp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BreakIntegerMaxProductTest {
BreakIntegerMaxProduct breakIntegerMaxProduct=new BreakingIntegerMaxProductDP();
    @Test
    public void get() {
        assertThat(breakIntegerMaxProduct.integerBreak(10),is(36));
    }

    @Test
    public void get_1() {
        assertThat(breakIntegerMaxProduct.integerBreak(2),is(1));
    }

    @Test
    public void get_8() {
        assertThat(breakIntegerMaxProduct.integerBreak(8),is(18));
    }
    @Test
    public void get_6() {
        assertThat(breakIntegerMaxProduct.integerBreak(6),is(9));
    }
}