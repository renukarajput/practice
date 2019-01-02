package edu.ren.datastructure.interviewBit.binarysearch;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PowerFunctionTest {
    PowerFunction powerFunction = new PowerFunction();

    @Test
    public void power() {
        int result = powerFunction.powerMod(2, 3, 2);
        assertThat(result, is(0));
    }

    @Test
    public void power_1() {
        int result = powerFunction.powerMod(2, 3, 3);
        assertThat(result, is(2));
    }

    @Test
    public void power_OddOfNegativeNum() {
        int result = powerFunction.powerMod(-2, 3, 2);
        assertThat(result, is(0));

    }

    @Test
    public void power_evenOfNegativeNum() {
        int result = powerFunction.powerMod(-2, 4, 2);
        assertThat(result, is(0));

    }

    @Test
    public void power_negative_pow() {
        int result = powerFunction.powerMod(2, -3, 2);
        assertThat(result, is(0));
    }

    @Test
    public void power_remainder() {
        int result = powerFunction.powerMod(2, 5, 3);
        assertThat(result, is(2));

    }

    @Test
    public void power_remainder_1() {
        int result = powerFunction.powerMod(3, 4, 2);
        assertThat(result, is(1));

    }

    @Test
    public void power_remainder_2() {
        int result = powerFunction.powerMod(9, 2, 5);
        assertThat(result, is(1));

    }
    @Test
    public void power_remainder_3() {
        int result = powerFunction.powerMod(-1, 1, 20);
        assertThat(result, is(19));

    }
    @Test
    public void power_remainder_large() {
        int result = powerFunction.powerMod(71045970, 41535484, 64735492);
        assertThat(result, is(20805472));

    }

    @Test
    public void testPower_1(){
        long result = powerFunction.power(2,3);
        assertThat(result, is(8L));
    }

    @Test
    public void testPower_2(){
        long result = powerFunction.power(2,50);
        assertThat(result, is(1125899906842624L));
    }

    @Test
    public void testPower_3(){
        long result = powerFunction.power(2,16);
        assertThat(result, is(65536L));
    }
}