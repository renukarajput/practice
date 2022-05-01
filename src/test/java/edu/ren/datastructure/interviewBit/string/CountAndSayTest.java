package edu.ren.datastructure.interviewBit.string;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CountAndSayTest {
CountAndSay countAndSay=new CountAndSay();

    @Test
    public void nThSequence_1() {
        assertThat(countAndSay.nThSequence(1),is("1"));
    }

    @Test
    public void nThSequence_2() {
        assertThat(countAndSay.nThSequence(2),is("11"));
    }

    @Test
    public void nThSequence_3() {
        assertThat(countAndSay.nThSequence(3),is("21"));
    }

    @Test
    public void nThSequence_4() {
        assertThat(countAndSay.nThSequence(4),is("1211"));
    }
    @Test
    public void nThSequence_5() {
        assertThat(countAndSay.nThSequence(5),is("111221"));
    }
}