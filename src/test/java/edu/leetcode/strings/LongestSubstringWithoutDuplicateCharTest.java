package edu.leetcode.strings;

import org.junit.Test;

import java.util.HashMap;
import java.util.TreeSet;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class LongestSubstringWithoutDuplicateCharTest {

    @Test
    public void lengthOfLongestSubstring() {
        int len=new LongestSubstringWithoutDuplicateChar().lengthOfLongestSubstring("abcabcbb");
        assertThat(len,is(3));
    }

    @Test
    public void lengthOfLongestSubstring_1() {
        int len=new LongestSubstringWithoutDuplicateChar().lengthOfLongestSubstring("");
        assertThat(len,is(0));
    }

    @Test
    public void lengthOfLongestSubstring_2() {
        int len=new LongestSubstringWithoutDuplicateChar().lengthOfLongestSubstring("pwwkew");
        assertThat(len,is(3));
    }

    @Test
    public void lengthOfLongestSubstring_3() {
        int len=new LongestSubstringWithoutDuplicateChar().lengthOfLongestSubstring("aab");
        assertThat(len,is(2));
    }

    @Test
    public void lengthOfLongestSubstring_4() {
        int len=new LongestSubstringWithoutDuplicateChar().lengthOfLongestSubstring("dvdf");
        assertThat(len,is(3));
    }

    @Test
    public void lengthOfLongestSubstring_5() {
        int len=new LongestSubstringWithoutDuplicateChar().lengthOfLongestSubstring("ababababc");
        assertThat(len,is(3));
    }

    @Test
    public void lengthOfLongestSubstring_6() {
        int len=new LongestSubstringWithoutDuplicateChar().lengthOfLongestSubstring("abababab");
        assertThat(len,is(2));
    }

    @Test
    public void lengthOfLongestSubstring_7() {
        int len=new LongestSubstringWithoutDuplicateChar().lengthOfLongestSubstring("abc");
        assertThat(len,is(3));
    }


    @Test
    public void lengthOfLongestSubstring_8() {
        int len=new LongestSubstringWithoutDuplicateChar().lengthOfLongestSubstring("cdd");
        assertThat(len,is(2));
    }

    @Test
    public void lengthOfLongestSubstring_9() {
        int len=new LongestSubstringWithoutDuplicateChar().lengthOfLongestSubstring("tmmzuxt");
        assertThat(len,is(5));
    }

    @Test
    public void lengthOxfLongestSubstring_10() {
        int len=new LongestSubstringWithoutDuplicateChar().lengthOfLongestSubstring("aabaab!bb");
        assertThat(len,is(3));
        HashMap<Character, Integer> rightMost = new HashMap<Character, Integer>();
        TreeSet<Character> chars = new TreeSet<Character>((a, b) -> rightMost.get(a) - rightMost.get(b));
    }


}