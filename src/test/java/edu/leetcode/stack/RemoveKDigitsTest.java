package edu.leetcode.stack;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class RemoveKDigitsTest {
    RemoveKDigitsToMinimizeNumber removeKdigitsToMinimizeNumber = new RemoveKDigitsToMinimizeNumber();

    @Test
    public void removeKdigits() {
        assertThat(removeKdigitsToMinimizeNumber.removeKdigits("149", 1), is("14"));
    }

    @Test
    public void removeKdigits01() {
//        assertThat(removeKdigitsToMinimizeNumber.removeKdigits("1432219", 3), is("1219"));
//        assertThat(removeKdigitsToMinimizeNumber.removeKdigits("1431229", 3), is("1122"));
        assertThat(removeKdigitsToMinimizeNumber.removeKdigits("123456789", 3), is("0000"));
    }

    @Test
    public void removeKdigits02() {
        assertThat(removeKdigitsToMinimizeNumber.removeKdigits("10200", 1), is("200"));
    }
    @Test
    public void removeKdigits03() {
        assertThat(removeKdigitsToMinimizeNumber.removeKdigits("9", 1), is("0"));
    }
}