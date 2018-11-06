package edu.ren.datastructure.interviewBit.string;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StringPalindromeTest {
    @Test
    public void isPalindrome_0() {
        int output = StringPalindrome.isPalindrome("nitin");
        assertThat(output, is(1));
    }

    @Test
    public void isPalindrome_1() {
        int output = StringPalindrome.isPalindrome("the sky is blue");
        assertThat(output, is(0));
    }

    @Test
    public void isPalindrome_2() {
        int output = StringPalindrome.isPalindrome("A man, a plan, a canal: Panama");
        assertThat(output, is(1));
    }

    @Test
    public void isPalindrome_3() {
        int output = StringPalindrome.isPalindrome("race a car");
        assertThat(output, is(0));
    }

    @Test
    public void isPalindrome_4() {
        int output = StringPalindrome.isPalindrome("1a2");
        assertThat(output, is(0));
    }

}