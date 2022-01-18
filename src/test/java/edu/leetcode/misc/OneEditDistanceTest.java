package edu.leetcode.misc;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class OneEditDistanceTest {
OneEditDistance oneEditDistance=new OneEditDistance();

    @Test
    public void isOneEditDistance() {
        assertThat(oneEditDistance.isOneEditDistance("",""),is(false));
    }

    @Test
    public void isOneEditDistanceWithEmpty() {
        assertThat(oneEditDistance.isOneEditDistance("","a"),is(true));
    }

    @Test
    public void isOneEditDistanceWithEmpty01() {
        assertThat(oneEditDistance.isOneEditDistance("a",""),is(true));
    }

    @Test
    public void isOneEditDistance01() {
        assertThat(oneEditDistance.isOneEditDistance("a","ac"),is(true));
    }

    @Test
    public void isOneEditDistance_insert() {
        assertThat(oneEditDistance.isOneEditDistance("acd","abcd"),is(true));
    }
    @Test
    public void isOneEditDistance_delete() {
        assertThat(oneEditDistance.isOneEditDistance("abcd","acd"),is(true));
    }

    @Test
    public void isOneEditDistance03() {
        assertThat(oneEditDistance.isOneEditDistance("ad","ac"),is(true));
    }

    @Test
    public void isOneEditDistance04() {
        assertThat(oneEditDistance.isOneEditDistance("ad","cd"),is(true));
    }
    @Test
    public void isOneEditDistance05() {
        assertThat(oneEditDistance.isOneEditDistance("ad","ad"),is(false));
    }

    @Test
    public void isOneEditDistance06() {
        assertThat(oneEditDistance.isOneEditDistance("aaaaaaaaa","aaaaaaaaaa"),is(true));
    }

    @Test
    public void isOneEditDistance07() {
        assertThat(oneEditDistance.isOneEditDistance("aa","aaa"),is(true));
    }

    @Test
    public void isOneEditDistance08() {
        assertThat(oneEditDistance.isOneEditDistance("ab","abb"),is(true));
    }


}