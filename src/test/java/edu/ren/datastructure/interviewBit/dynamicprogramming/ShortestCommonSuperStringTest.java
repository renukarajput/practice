package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ShortestCommonSuperStringTest {
    ShortestCommonSuperString shortestCommonSuperString = new ShortestCommonSuperString();

    @Test
    public void getLength() {
        assertThat(shortestCommonSuperString.getLength(Arrays.asList("abcd", "cdef", "fgh", "de")), is(8));
    }
}