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
}