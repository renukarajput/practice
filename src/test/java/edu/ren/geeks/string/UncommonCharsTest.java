package edu.ren.geeks.string;

import org.junit.Test;
import java.util.Set;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class UncommonCharsTest {
    UncommonChars uncommonChars = new UncommonChars();

    @Test
    public void findUncommonCharacters_1() {
        Set<Character> actual = uncommonChars.findUncommonCharacters("hello", "world");
        Character[] expected = {'w', 'r', 'd', 'h', 'e'};
        assertThat(actual.size(),is(expected.length));
        assertThat(actual, hasItems(expected));
    }

    @Test
    public void findUncommonCharacters_2() {
        Set<Character> actual = uncommonChars.findUncommonCharacters("characters", "alphabets");
        Character[] expected = {'b', 'c', 'l', 'p', 'r'};
        assertThat(actual.size(),is(expected.length));
        assertThat(actual, hasItems(expected));
    }

    @Test
    public void findUncommonCharacters_3() {
        Set<Character> actual = uncommonChars.findUncommonCharacters("geeksforgeeks", "geeksquiz");
        Character[] expected = {'f', 'i', 'o', 'q', 'r', 'u', 'z'};
        assertThat(actual.size(),is(expected.length));
        assertThat(actual, hasItems(expected));
    }

}