package edu.ren.geeks.string;

import org.junit.Test;
import java.util.Set;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class UncommonCharsUsingSortTest {
    UncommonCharsUsingSort uncommonChars = new UncommonCharsUsingSort();

    @Test
    public void findUncommonChars_1() {
        Set<Character> actual = uncommonChars.findUncommonChars("hello", "world");
        Character[] expected = {'e', 'h', 'd', 'r', 'w'};
        assertThat(actual.size(), is(expected.length));
        assertThat(actual, hasItems(expected));
    }

    @Test
    public void findUncommonChars_2() throws Exception {
        Set<Character> actual = uncommonChars.findUncommonChars("apple", "staple");
        Character[] expected = {'s', 't'};
        assertThat(actual.size(), is(expected.length));
        assertThat(actual, hasItems(expected));
    }

    @Test
    public void findUncommonChars_3() {
        Set<Character> actual = uncommonChars.findUncommonChars("characters", "alphabets");
        Character[] expected = {'b', 'c', 'l', 'p', 'r'};
        assertThat(actual.size(), is(expected.length));
        assertThat(actual, hasItems(expected));
    }

    @Test
    public void findUncommonChars_4() {
        Set<Character> actual = uncommonChars.findUncommonChars("geeksforgeeks", "geeksquiz");
        Character[] expected = {'f', 'i', 'o', 'q', 'r', 'u', 'z'};
        assertThat(actual.size(), is(expected.length));
        assertThat(actual, hasItems(expected));
    }

    @Test
    public void findUncommonChars_5() {
        Set<Character> actual = uncommonChars.findUncommonChars("geeksgeeksfor", "geeksquiz");
        Character[] expected = {'f', 'i', 'o', 'q', 'r', 'u', 'z'};
        assertThat(actual.size(), is(expected.length));
        assertThat(actual, hasItems(expected));
    }

    @Test
    public void findUncommonChars_6() {
        Set<Character> actual = uncommonChars.findUncommonChars("geeks", "geeksforquiz");
        Character[] expected = {'f', 'i', 'o', 'q', 'r', 'u', 'z'};
        assertThat(actual.size(), is(expected.length));
        assertThat(actual, hasItems(expected));
    }

    @Test
    public void findUncommonChars_7() {
        Set<Character> actual = uncommonChars.findUncommonChars("andhadhun", "dhun");
        Character[] expected = {'a'};
        assertThat(actual.size(), is(expected.length));
        assertThat(actual, hasItems(expected));
    }

    @Test
    public void findUncommonChars_8() {
        Set<Character> actual = uncommonChars.findUncommonChars("abcd", "");
        Character[] expected = {'a', 'b', 'c', 'd',};
        assertThat(actual.size(), is(expected.length));
        assertThat(actual, hasItems(expected));
    }

    @Test
    public void findUncommonChars_9() {
        Set<Character> actual = uncommonChars.findUncommonChars("abcd", "a");
        Character[] expected = {'b', 'c', 'd',};
        assertThat(actual.size(), is(expected.length));
        assertThat(actual, hasItems(expected));
    }

}