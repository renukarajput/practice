package edu.leetcode.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DeleteCharactersTest {
    DeleteCharacters obj = new DeleteCharacters();
    @Test
    public void makeFancyString() {
        assertThat(obj.makeFancyString("leeetcode"), is("leetcode"));
        assertThat(obj.makeFancyString("aaabaaaa"), is("aabaa"));
        assertThat(obj.makeFancyString("aab"), is("aab"));
    }

    @Test
    public void makeFancyString_1() {
        assertThat(obj.makeFancyString("aaaaabbbccccc"), is("aabbcc"));
    }
}