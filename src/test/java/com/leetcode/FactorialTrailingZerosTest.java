package com.leetcode;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FactorialTrailingZerosTest {
    FactorialTrailingZeros obj = new FactorialTrailingZeros();

    @Test
    public void input_0(){
        assertThat(obj.trailingZeroes(5), is(1));
    }
    @Test
    public void input_1(){
        assertThat(obj.trailingZeroes(3), is(0));
    }
    @Test
    public void input_2(){
        assertThat(obj.trailingZeroes(100), is(24));
    }
    @Test
    public void input_3(){
        assertThat(obj.trailingZeroes(1000), is(249));
    }
}