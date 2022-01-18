package edu.leetcode.backtracking;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PalindromePermutationTest {

    @Test
    public void canPermutePalindrome() {
       assertThat(new PalindromePermutation().canPermutePalindrome("code"),is(false));
    }


    @Test
    public void canPermutePalindrome_true1() {
        assertThat(new PalindromePermutation().canPermutePalindrome("aab"),is(true));
    }


    @Test
    public void canPermutePalindrome_true2() {
        assertThat(new PalindromePermutation().canPermutePalindrome("abcabcd"),is(true));
    }

    @Test
    public void canPermutePalindrome_1() {
        assertThat(new PalindromePermutation().canPermutePalindrome("c"),is(true));
    }

    @Test
    public void generatePermutePalindrome_true1() {
        assertThat(new PalindromePermutation().generatePalindromes("aab"),is(Arrays.asList("aba")));
    }


    @Test
    public void generatePermutePalindrome_true2() {
        assertThat(new PalindromePermutation().generatePalindromes("aabbcc"),is(Arrays.asList("baccab", "cbaabc", "cabbac", "acbbca", "abccba", "bcaacb")));
    }


    @Test
    public void generatePermutePalindrome_false2() {
        assertThat(new PalindromePermutation().generatePalindromes("aabbccde"),is(Arrays.asList()));
    }

}