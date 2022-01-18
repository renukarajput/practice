package edu.leetcode.strings;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

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

    @Test
    public void lengthOfLongestSubstringTwoDistinct_5(){
        int len=  new LongestStringWithMaxTwoDistinctChar().lengthOfLongestSubstringTwoDistinct("aac");
        assertThat(len,is(3));
    }


    @Test
    public void lengthOfLongestSubstringTwoDistinct_6(){
        int len=  new LongestStringWithMaxTwoDistinctChar().lengthOfLongestSubstringTwoDistinct("abaccc");
        assertThat(len,is(4));
    }


    @Test
    public void lengthOfLongestSubstringTwoDistinct_7(){
        int len=  new LongestStringWithMaxTwoDistinctChar().lengthOfLongestSubstringTwoDistinct( "ccaabbb");
        assertThat(len,is(5));
    }

    @Test
    public void lengthOfLongestSubstringKDistinct_1(){
        int len=  new LongestStringWithMaxTwoDistinctChar().lengthOfLongestSubstringKDistinct( "aa",1);
        assertThat(len,is(2));
    }

    @Test
    public void lengthOfLongestSubstringKDistinct_01(){
        int len=  new LongestStringWithMaxTwoDistinctChar().lengthOfLongestSubstringKDistinct( "aba",2);
        assertThat(len,is(2));
    }


    @Test
    public void lengthOfLongestSubstringKDistinct_011(){
        int len=  new LongestStringWithMaxTwoDistinctChar().lengthOfLongestSubstringKDistinct( "ababaacb",3);
        assertThat(len,is(8));
    }
    @Test
    public void lengthOfLongestSubstringKDistinct_02(){
        int len=  new LongestStringWithMaxTwoDistinctChar().lengthOfLongestSubstringKDistinct( "abbcab",3);
        assertThat(len,is(4));
    }

    @Test
    public void lengthOfLongestSubstringKDistinct_2(){
        int len=  new LongestStringWithMaxTwoDistinctChar().lengthOfLongestSubstringKDistinct( "eceba",2);
        assertThat(len,is(3));
    }


    @Test
    public void lengthOfLongestSubstringKDistinct_3(){
        int len=  new LongestStringWithMaxTwoDistinctChar().lengthOfLongestSubstringKDistinct( "",2);
        assertThat(len,is(0));
    }


    @Test
    public void lengthOfLongestSubstringKDistinct_4(){
        int len=  new LongestStringWithMaxTwoDistinctChar().lengthOfLongestSubstringKDistinct( "aa",0);
        assertThat(len,is(0));
    }

    @Test
    public void lengthOfLongestSubstringKDistinct_5(){
        int len=  new LongestStringWithMaxTwoDistinctChar().lengthOfLongestSubstringKDistinct( "ab",1);
        assertThat(len,is(1));
    }

}
