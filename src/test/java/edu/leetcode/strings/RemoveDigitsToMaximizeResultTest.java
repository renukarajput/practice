package edu.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class RemoveDigitsToMaximizeResultTest {
    RemoveDigitsToMaximizeResult obj = new RemoveDigitsToMaximizeResult();
    @Test
    public void test() {
        assertThat(obj.removeDigit("149", '1'), is("49"));
        assertThat(obj.removeDigit("123", '3'), is("12"));
        assertThat(obj.removeDigit("1231", '1'), is("231"));
        assertThat(obj.removeDigit("551", '5'), is("51"));
        assertThat(obj.removeDigit("14231", '1'), is("4231"));

    }    @Test
    public void test_1() {
        assertThat(obj.removeDigitApproach2("149", '1'), is("49"));
        assertThat(obj.removeDigitApproach2("123", '3'), is("12"));
        assertThat(obj.removeDigitApproach2("1231", '1'), is("231"));
        assertThat(obj.removeDigitApproach2("551", '5'), is("51"));
        assertThat(obj.removeDigitApproach2("14231", '1'), is("4231"));

    }

}