package edu.leetcode.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class LongestStringWithMaxTwoDistinctCharTest {
    @Test
    public void lengthOfLongestSubstringTwoDistinct(){
      int len=  new LongestStringWithMaxTwoDistinctChar().lengthOfLongestSubstringTwoDistinct("eceba");
     assertThat(len,is(3));
    }

    @Test
    public void lengthOfLongestSubstringTwoDistinct_1(){
        int len=  new LongestStringWithMaxTwoDistinctChar().lengthOfLongestSubstringTwoDistinct("abcdabcdabcd");
        assertThat(len,is(2));
    }

    @Test
    public void lengthOfLongestSubstringTwoDistinct_2(){
        int len=  new LongestStringWithMaxTwoDistinctChar().lengthOfLongestSubstringTwoDistinct("abababc");
        assertThat(len,is(6));
    }

    @Test
    public void lengthOfLongestSubstringTwoDistinct_3(){
        int len=  new LongestStringWithMaxTwoDistinctChar().lengthOfLongestSubstringTwoDistinct("abaabcab");
        assertThat(len,is(5));
    }

    @Test
    public void lengthOfLongestSubstringTwoDistinct_4(){
        int len=  new LongestStringWithMaxTwoDistinctChar().lengthOfLongestSubstringTwoDistinct("abc");
        assertThat(len,is(2));
    }

}