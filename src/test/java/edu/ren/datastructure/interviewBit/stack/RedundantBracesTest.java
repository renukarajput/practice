package edu.ren.datastructure.interviewBit.stack;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class RedundantBracesTest {
    RedundantBraces redundantBraces = new RedundantBraces();

    @Test
    public void hasRedundant() {
        assertThat(redundantBraces.hasReduntant("((a + b))"), is(true));
    }

    @Test
    public void hasRedundant_1() {
        assertThat(redundantBraces.hasReduntant("(a + (a + b))"), is(false));
    }

    @Test
    public void hasRedundant_2() {
        assertThat(redundantBraces.hasReduntant("a+b"), is(false));
    }
    @Test
    public void hasRedundant_3() {
        assertThat(redundantBraces.hasReduntant("(a)"), is(true));
    }
    @Test
    public void hasRedundant_4() {
        assertThat(redundantBraces.hasReduntant("(a+(a))"), is(true));
    }
}