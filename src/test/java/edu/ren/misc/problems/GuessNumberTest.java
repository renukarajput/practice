package edu.ren.misc.problems;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class GuessNumberTest {
    @Test
    public void guess_1() {
        GuessNumber gs = new GuessNumber(23);
        assertThat(gs.guessNumber(30), is(23));
    }

    @Test
    public void guess_2() {
        GuessNumber gs = new GuessNumber(8);
        assertThat(gs.guessNumber(20), is(8));
    }

    @Test
    public void guess_3() {
        GuessNumber gs = new GuessNumber(25);
        assertThat(gs.guessNumber(20), is(-1));
    }
    @Test
    public void guess_4() {
        GuessNumber gs = new GuessNumber(6);
        assertThat(gs.guessNumber(10), is(6));
    }
}