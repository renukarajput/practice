package edu.leetcode.misc;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class NumberOfLasersInBankTest {
NumberOfLasersInBank numberOfLasersInBank=new NumberOfLasersInBank();
    @Test
    public void numberOfBeams() {
      assertThat(numberOfLasersInBank.numberOfBeams(new String[]{"011001","000000","010100","001000"}),is(8));
    }
}