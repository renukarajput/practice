package com.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomanToIntConversionTest {
    RomanToIntConversion obj = new RomanToIntConversion();
    @Test
    public void input_0(){
        assertThat(obj.romanToInt("III"), is(3));
        assertThat(obj.romanToInt("LVIII"), is(58));
        assertThat(obj.romanToInt("MCMXCIV"), is(1994));
        assertThat(obj.romanToInt("CDIC"), is(499));
    }

}