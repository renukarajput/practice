package edu.ren.datastructure.interviewBit.math;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class NextLargestPalindromeTest {
    NextLargestPalindrome nextLargestPalindrome = new NextLargestPalindrome();

    @Test
    public void reverse_1() {
        assertThat(nextLargestPalindrome.get(99), is(101));
        assertThat(nextLargestPalindrome.get(323), is(333));
        assertThat(nextLargestPalindrome.get(646), is(656));
    }


}