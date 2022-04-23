package com.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IntToRomanConversionTest {
    IntToRomanConversion obj = new IntToRomanConversion();
    @Test
    public void input_0(){
        assertThat(obj.intToRoman(3), is("III"));
        assertThat(obj.intToRoman(58), is("LVIII"));
        assertThat(obj.intToRoman(1994), is("MCMXCIV"));
    }
}