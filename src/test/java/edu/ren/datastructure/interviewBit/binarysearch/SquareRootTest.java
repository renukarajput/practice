package edu.ren.datastructure.interviewBit.binarysearch;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SquareRootTest {

    private final SquareRoot squareRoot = new SquareRoot();

    @Test
    public void sqrt() {
        assertThat(squareRoot.sqrt(11), is(3));
    }

    @Test
    public void sqrt_1() {
        assertThat(squareRoot.sqrt(26), is(5));
    }

    @Test
    public void sqrt_2() {
        assertThat(squareRoot.sqrt(3), is(1));
    }
    @Test
    public void sqrt_4() {
        assertThat(squareRoot.sqrt(4), is(2));
    }

    @Test
    public void sqrt_3() {
        assertThat(squareRoot.sqrt(1), is(1));
    }

    @Test
    public void sqrt_large() {
        assertThat(squareRoot.sqrt(930675566), is(30506));
    }

    @Test
    public void sqrt_0() {
        assertThat(squareRoot.sqrt(0), is(0));
    }


}