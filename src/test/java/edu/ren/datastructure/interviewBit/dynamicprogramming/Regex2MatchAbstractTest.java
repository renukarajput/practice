package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public abstract class Regex2MatchAbstractTest {

    Regex2Match regex2Match = getRegex2Match();

    protected abstract Regex2Match getRegex2Match();

    @Test
    public void isMatch() {
        assertThat(regex2Match.isMatch("aa", "aa"), is(true));
    }

    @Test
    public void isMatch_1() {
        assertThat(regex2Match.isMatch("aaa", "aa"), is(false));
    }

    @Test
    public void isMatch_2() {
        assertThat(regex2Match.isMatch("aab", "c*a*b"), is(true));
    }

    @Test
    public void isMatch_3() {
        assertThat(regex2Match.isMatch("ccccd", "c*d"), is(true));
    }


    @Test
    public void isMatch_4() {
        assertThat(regex2Match.isMatch("ccccdegghhi", "c*deg*h*i"), is(true));
    }

    @Test
    public void isMatch_5() {
        assertThat(regex2Match.isMatch("ccccdegghhi", "c*degh*i"), is(false));
    }

    @Test
    public void isMatch_6() {
        assertThat(regex2Match.isMatch("", "c*"), is(true));
    }

    @Test
    public void isMatch_06() {
        assertThat(regex2Match.isMatch("", ".*"), is(true));
    }

    @Test
    public void isMatch_7() {
        assertThat(regex2Match.isMatch("a", "ac*"), is(true));
    }

    @Test
    public void isMatch_8() {
        assertThat(regex2Match.isMatch("ab", "a*"), is(false));
    }

    @Test
    public void isMatch_9() {
        assertThat(regex2Match.isMatch("a", "a*"), is(true));
    }

    @Test
    public void isMatch_10() {
        assertThat(regex2Match.isMatch("abbbbccccdefffg", "ab*c*def*g"), is(true));
    }
      @Test
    public void isMatch_11() {
        assertThat(regex2Match.isMatch("abbbbccccdefffg", "ab*c*defg"), is(false));
    }

    @Test
    public void isMatch_12() {
        assertThat(regex2Match.isMatch("abbbbccccdefffg", "ab*c*df*g"), is(false));
    }

    @Test
    public void isMatch_13() {
        assertThat(regex2Match.isMatch("abcbcd", "a.*c.*d"), is(true));
    }

    @Test
    public void isMatch_14() {
        assertThat(regex2Match.isMatch("a", "a.*"), is(true));
    }
}