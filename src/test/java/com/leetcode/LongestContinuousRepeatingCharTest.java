package com.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LongestContinuousRepeatingCharTest {
    LongestContinuousRepeatingChar obj = new LongestContinuousRepeatingChar();
    @Test
    public void findLongestContinuousRepeatingSubstring() {
        assertThat(obj.findLongestContinuousRepeatingSubstring("abb"), is("bb"));
        assertThat(obj.findLongestContinuousRepeatingSubstring("abbccc"), is("ccc"));
        assertThat(obj.findLongestContinuousRepeatingSubstring("abbbeedddd"), is("dddd"));
        assertThat(obj.findLongestContinuousRepeatingSubstring("fffffabbbeedddd"), is("fffff"));
    }
}