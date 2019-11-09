package edu.ren.datastructure.leetcode.dp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BreakIntegerMaxProductTest {
BreakIntegerMaxProduct breakIntegerMaxProduct=new BreakIntegerMaxProduct();
    @Test
    public void get() {
        assertThat(breakIntegerMaxProduct.get(10),is(36));
    }

    @Test
    public void get_1() {
        assertThat(breakIntegerMaxProduct.get(2),is(1));
    }

    @Test
    public void get_2() {
        assertThat(breakIntegerMaxProduct.get(8),is(18));
    }
}