package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public abstract class IsInterleavingOfTwoStringAbstractTest {
IsInterleavingOfTwoString isInterleavingOfTwoString= getIsInterleavingOfTwoString();

    protected abstract IsInterleavingOfTwoString getIsInterleavingOfTwoString();

    @Test
    public void isInterLeaving_0() {
       assertThat(isInterleavingOfTwoString.matches("AB","CD","ACDB"),is(true));
    }

    @Test
    public void isInterLeaving_1() {
       assertThat(isInterleavingOfTwoString.matches("AB","CD","CABD"),is(true));
    }

    @Test
    public void isInterLeaving_2() {
       assertThat(isInterleavingOfTwoString.matches("XXZXXXY","XXY","XXZ"),is(false));
    }

    @Test
    public void isInterLeaving_3() {
       assertThat(isInterleavingOfTwoString.matches("XY","WZ","WZXY"),is(true));
    }

    @Test
    public void isInterLeaving_4() {
       assertThat(isInterleavingOfTwoString.matches("XY","X","XXY"),is(true));
    }

    @Test
    public void isInterLeaving_5() {
       assertThat(isInterleavingOfTwoString.matches("XXY","YX","X"),is(false));
    }

    @Test
    public void isInterLeaving_6() {
       assertThat(isInterleavingOfTwoString.matches("XXY","XXZ","XXXXZY"),is(true));
    }

    @Test
    public void isInterLeaving_7() {
       assertThat(isInterleavingOfTwoString.matches("XT","XZ","XZXT"),is(true));
    }

    @Test
    public void isInterLeaving_8() {
       assertThat(isInterleavingOfTwoString.matches("eZCHXr0CgsB4O3TCDlitYI7kH38rEElI","UhSQsB6CWAHE6zzphz5BIAHqSWIY24D","eUZCHhXr0SQsCgsB4O3B6TCWCDlAitYIHE7k6H3z8zrphz5EEBlIIAHqSWIY24D"),is(true));
    }
}