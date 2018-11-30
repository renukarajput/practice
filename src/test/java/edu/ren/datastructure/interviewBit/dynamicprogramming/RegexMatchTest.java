package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class RegexMatchTest {
    RegexMatch regexMatch=new RegexMatch();

    @Test
    public void match() {
       assertThat(regexMatch.isMatch("ab","ab"),is(true));
    }

    @Test
    public void match_1() {
       assertThat(regexMatch.isMatch("abbb","ab*"),is(true));
    }

    @Test
    public void match_2() {
       assertThat(regexMatch.isMatch("abcb","ab*c"),is(false));
    }

    @Test
    public void match_3() {
       assertThat(regexMatch.isMatch("abcbc","ab*c"),is(true));
    }

    @Test
    public void match_4() {
       assertThat(regexMatch.isMatch("abcbcdf","ab*c?f"),is(true));
    }

    @Test
    public void match_5() {
       assertThat(regexMatch.isMatch("abcbcdf","ab*c?g"),is(false));
    }

    @Test
    public void match_6() {
       assertThat(regexMatch.isMatch("aaa","aa****"),is(true));
    }

    @Test
    public void match_7() {
       assertThat(regexMatch.isMatch("bbbcbcb","**b"),is(true));
    }

    @Test
    public void match_8() {
       assertThat(regexMatch.isMatch("bbbcbcbc","**bc"),is(true));
    }

    @Test
    public void match_9() {
       assertThat(regexMatch.isMatch("bbbcbcbc","**bd"),is(false));
    }

    @Test
    public void match_10() {
       assertThat(regexMatch.isMatch("bacb","b**c*?*"),is(true));
    }
    //a*b*bc
    //a*bc*b   a*bc*
}