package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public abstract class RepeatingSubSequenceAbstractTest {
    RepeatingSubSequence repeatingSubSequence= getRepeatingSubSequence();

    protected abstract RepeatingSubSequence getRepeatingSubSequence();

    @Test
    public void isRepeating() {
       assertThat(repeatingSubSequence.isRepeating("abcdefgamenof"),is(true));
    }

    @Test
    public void isRepeating_1() {
       assertThat(repeatingSubSequence.isRepeating("abcdefgamtnou"),is(false));
    }

   @Test
    public void isRepeating_2() {
       assertThat(repeatingSubSequence.isRepeating("abcda"),is(false));
    }

    @Test
    public void isRepeating_3() {
       assertThat(repeatingSubSequence.isRepeating("abab"),is(true));
    }

    @Test
    public void isRepeating_4() {
       assertThat(repeatingSubSequence.isRepeating("abba"),is(false));
    }

    @Test
    public void isRepeating_5() {
       assertThat(repeatingSubSequence.isRepeating("aabb"),is(true));
    }
}