package edu.ren.geeks.string;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConsecutiveVowelsTest {
    ConsecutiveVowels cv = new ConsecutiveVowels();

    @Test
    public void removeConsecutiveVowels_1() {
        String actual = cv.removeConsecutiveVowels("your article is in queue");
        String expected = "yor article is in qu";
        assertThat(actual, is(expected));
    }

    @Test
    public void removeConsecutiveVowels_2() {
        String actual = cv.removeConsecutiveVowels("geeks for geeks");
        String expected = "geks for geks";
        assertThat(actual, is(expected));
    }

    @Test
    public void removeConsecutiveVowels_3() {
        String actual = cv.removeConsecutiveVowels("hello world");
        String expected = "hello world";
        assertThat(actual, is(expected));
    }

    @Test
    public void removeConsecutiveVowels_4() {
        String actual = cv.removeConsecutiveVowels("interviewbit");
        String expected = "interviwbit";
        assertThat(actual, is(expected));
    }

    @Test
    public void removeConsecutiveVowels_5() {
        String actual = cv.removeConsecutiveVowels("iiiiiinteeeeervieeeeewbiiiit");
        String expected = "interviwbit";
        assertThat(actual, is(expected));
    }

}