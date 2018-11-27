package edu.ren.datastructure.interviewBit.math;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by rrn3194 on 11/21/18.
 */
public class ReverseNumberTest {
    ReverseNumber reverseNumber = new ReverseNumber();

    @Test
    public void reverse_1() {
        assertThat(reverseNumber.reverse(123), is(321));
    }

    @Test
    public void reverse_2() {
        assertThat(reverseNumber.reverse(575), is(575));
    }

    @Test
    public void reverse_3() {
        assertThat(reverseNumber.reverse(12345), is(54321));
    }

    @Test
    public void reverse_4() {
        assertThat(reverseNumber.reverse(-123), is(-321));
    }

    @Test
    public void reverse_5() {
        assertThat(reverseNumber.reverse(1), is(1));
    }

    @Test
    public void reverse_6() {
        assertThat(reverseNumber.reverse(986543612), is(216345689));
    }

    @Test
    public void reverse_7() {
        assertThat(reverseNumber.reverse(2147483647), is(0));
    }

}