package edu.leetcode.backtracking;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ConfusingNumber2Test {

    @Test
    public void confusingNumberII() {
       assertThat(new ConfusingNumber2().confusingNumberII(10),is(3));
    }

    @Test
    public void confusingNumberII_20() {
       assertThat(new ConfusingNumber2().confusingNumberII(20),is(6));
    }

    @Test
    public void confusingNumberII_100() {
        assertThat(new ConfusingNumber2().confusingNumberII(100),is(19));
    }
}