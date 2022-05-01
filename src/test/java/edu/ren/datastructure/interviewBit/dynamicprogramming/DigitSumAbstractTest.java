package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public abstract class DigitSumAbstractTest {
    DigitSum digitSum = getDigitSum();
private void f(){}
    protected abstract DigitSum getDigitSum();

    @Test
    public void getNumWays() {
        assertThat(digitSum.getNumberOfWays(2, 4), is(4));
    }

    @Test
    public void getNumWays_1() {
        assertThat(digitSum.getNumberOfWays(2, 9), is(9));
    }

    @Test
    public void getNumWays_2() {
        assertThat(digitSum.getNumberOfWays(2, 2), is(2));
    }

    @Test
    public void getNumWays_3() {
        assertThat(digitSum.getNumberOfWays(4, 32), is(35));
    }

    @Test
    public void getNumWays_4() {
        assertThat(digitSum.getNumberOfWays(4, 35), is(4));
    }

    @Test
    public void getNumWays_5() {
        assertThat(digitSum.getNumberOfWays(4, 36), is(1));
    }

    @Test
    public void getNumWays_6() {
        assertThat(digitSum.getNumberOfWays(75, 22), is(478432066));
    }

}