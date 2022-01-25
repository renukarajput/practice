package edu.leetcode.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FixPotholesTest {

    private FixPotholes fixPotholes = new FixPotholes();


    @Test
    public void solution() {
        assertThat(fixPotholes.solution("...xxx..x", 5), is(3));

    }

    @Test
    public void solution01() {
        assertThat(fixPotholes.solution("...xxx..x....xxx.", 7), is(5));
    }
}