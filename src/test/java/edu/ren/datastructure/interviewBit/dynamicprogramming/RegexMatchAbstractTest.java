package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public abstract class RegexMatchAbstractTest {
    RegexMatch regexMatch= getRegexMatch();

    protected abstract RegexMatch getRegexMatch();

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

    @Test
    public void match_11() {
       assertThat(regexMatch.isMatch("cc","?"),is(false));
    }

    @Test
    public void match_12() {
       assertThat(regexMatch.isMatch("a","?"),is(true));
    }

    @Test
    public void match_13() {
       assertThat(regexMatch.isMatch("aabbaaabbbaa","a*bbb*aaa"),is(false));
    }

    @Test
    public void match_14() {
       assertThat(regexMatch.isMatch("cbcacacabac","c"),is(false));
    }

    @Test
    public void match_15() {
       assertThat(regexMatch.isMatch("bcaccbabaa","bb*c?c*?"),is(false));
    }
    //a*b*bc
    //a*bc*b   a*bc*
}