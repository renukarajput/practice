package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public abstract class WaysToMatchSubSequenceAbstractTest {
    WaysToMatchSubSequence waysToMatchSubSequence= getWaysToMatchSubSequence();

    protected abstract WaysToMatchSubSequence getWaysToMatchSubSequence();

    @Test
    public void waysToMatch_0() {
        assertThat(waysToMatchSubSequence.get("a","a"),is(1));
    }

     @Test
    public void waysToMatch() {
        assertThat(waysToMatchSubSequence.get("abbc","abc"),is(2));
    }

    @Test
    public void waysToMatch_1() {
        assertThat(waysToMatchSubSequence.get("rabbbit","rabbit"),is(3));
    }

    @Test
    public void waysToMatch_2() {
        assertThat(waysToMatchSubSequence.get("aaaababbababbaabbaaababaaabbbaaabbb","bbababa"),is(22113));
    }
}