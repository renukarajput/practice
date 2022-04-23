package com.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LongestCommonPrefixTest {
    LongestCommonPrefix obj = new LongestCommonPrefix();

    @Test
    public void input_0() {
        assertThat(obj.longestCommonPrefix(new String[]{"flow","flower","flight"}), is("fl"));
        assertThat(obj.longestCommonPrefix(new String[]{"dog","racecar","car"}), is(""));
    }
}