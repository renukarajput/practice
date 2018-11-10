package edu.ren.geeks.string;

import org.junit.Test;

import java.util.Set;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class UncommonCharsUsingHashTest {
    UncommonCharsUsingHash uncommonChars = new UncommonCharsUsingHash();

    @Test
    public void findUncommonChars_1() {
        Set<Character> actual = uncommonChars.findUncommonChars("hello", "world");
        Character[] expected = {'e', 'h', 'd', 'r', 'w'};
        assertThat(actual.size(),is(expected.length));
        assertThat(actual, hasItems(expected));
    }

    @Test
    public void findUncommonCharacters_2() {
        Set<Character> actual = uncommonChars.findUncommonChars("characters", "alphabets");
        Character[] expected = {'b', 'c', 'l', 'p', 'r'};
        assertThat(actual.size(),is(expected.length));
        assertThat(actual, hasItems(expected));
    }

    @Test
    public void findUncommonCharacters_3() {
        Set<Character> actual = uncommonChars.findUncommonChars("geeksforgeeks", "geeksquiz");
        Character[] expected = {'f', 'i', 'o', 'q', 'r', 'u', 'z'};
        assertThat(actual.size(),is(expected.length));
        assertThat(actual, hasItems(expected));
    }

    @Test
    public void findUncommonCharacters_4() {
        Set<Character> actual = uncommonChars.findUncommonChars("apple", "staple");
        Character[] expected = {'s', 't'};
        assertThat(actual.size(),is(expected.length));
        assertThat(actual, hasItems(expected));
    }

}