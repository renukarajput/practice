package com.leetcode.blind75.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestContiguousSegmentTest {
    LongestContiguousSegment obj = new LongestContiguousSegment();

    @Test
    public void input_1() {
        int n=29;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            System.out.println("i = " + i);
            if (n % i == 0) {
                System.out.println(" divisible by 0");
            }
        }
        System.out.println(Math.sqrt(19));
//        System.out.println(Math.sqrt(9));
//        assertFalse(obj.checkZeroOnes("1100"));
    }

    @Test
    public void input_2() {
        assertTrue(obj.checkZeroOnes("110111001"));
    }

    @Test
    public void input_3() {
        assertFalse(obj.checkZeroOnes("1110000"));
    }

    @Test
    public void input_4() {
        assertTrue(obj.checkZeroOnes("1101"));
    }

    @Test
    public void input_5() {
        assertTrue(obj.checkZeroOnes("1"));
        assertTrue(obj.checkZeroOnes("111001111"));
    }

    @Test
    public void input_6() {
        assertFalse(obj.checkZeroOnes("0001101"));

    }

}