package edu.leetcode.backtracking;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FlipGameTest {

    @Test
    public void canWin() {
        assertThat(new FlipGame().canWin("++++"),is(true));
    }

    @Test
    public void canWin_1() {
        assertThat(new FlipGame().canWin("++-++"),is(false));
    }


    @Test
    public void canWin_2() {
        assertThat(new FlipGame().canWin("++"),is(true));
    }


    @Test
    public void canWin_3() {
        assertThat(new FlipGame().canWin("++++++"),is(true));
    }


    @Test
    public void canWin_4() {
        assertThat(new FlipGame().canWin("++-++++-++"),is(true));
    }


    @Test
    public void canWin_5() {
        assertThat(new FlipGame().canWin("++---------++"),is(false));
    }


    @Test
    public void canWin_6() {
        assertThat(new FlipGame().canWin("++-----++--++"),is(true));
    }


    @Test
    public void canWin_7() {
        assertThat(new FlipGame().canWin("++--++--++---++"),is(false));
    }

    @Test
    public void canWin_8() {
        assertThat(new FlipGame().canWin("+++++++++"),is(false));
    }
}