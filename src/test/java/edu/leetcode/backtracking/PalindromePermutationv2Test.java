package edu.leetcode.backtracking;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PalindromePermutationv2Test {

    private PalindromePermutation getPalindromePermutation() {
        return new PalindromePermutationv2();
    }


    @Test
    public void generatePermutePalindrome_true1() {
        assertThat(getPalindromePermutation().generatePalindromes("aab"),is(Arrays.asList("aba")));
    }

    @Test
    public void generatePermutePalindrome_true2() {
        assertThat(getPalindromePermutation().generatePalindromes("aabbcc"),hasItems("baccab", "cbaabc", "cabbac", "acbbca", "abccba", "bcaacb"));
    }

    @Test
    public void generatePermutePalindrome_true3() {
        assertThat(getPalindromePermutation().generatePalindromes("a"),is(Arrays.asList("a")));
    }


    @Test
    public void generatePermutePalindrome_true4() {
        assertThat(getPalindromePermutation().generatePalindromes("aaa"),is(Arrays.asList("aaa")));
    }


    @Test
    public void generatePermutePalindrome_false2() {
        assertThat(getPalindromePermutation().generatePalindromes("aabbccde"),is(Arrays.asList()));
    }

    @Test
    public void generatePermutePalindrome_false3() {
        assertThat(getPalindromePermutation().generatePalindromes("book"),is(Arrays.asList()));
    }


    @Test
    public void generatePermutePalindrome_false4() {
        assertThat(getPalindromePermutation().generatePalindromes("bbookde"),is(Arrays.asList()));
    }


}