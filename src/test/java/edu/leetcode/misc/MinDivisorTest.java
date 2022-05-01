package edu.leetcode.misc;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MinDivisorTest {
MinDivisor minDivisor=new MinDivisor();
    @Test
    public void smallestDivisor() {
       assertThat(minDivisor.smallestDivisor(new int[]{1,2,5,9},6),is(5));
    }

    @Test
    public void smallestDivisor_1() {
        assertThat(minDivisor.smallestDivisor(new int[]{44,22,33,11,1},5),is(44));
    }

    @Test
    public void smallestDivisor_2() {
        assertThat(minDivisor.smallestDivisor(new int[]{200,100,14},10),is(34));
    }

    @Test
    public void smallestDivisor_3() {
        assertThat(minDivisor.smallestDivisor(new int[]{200,100,14},5),is(100));
    }


}
