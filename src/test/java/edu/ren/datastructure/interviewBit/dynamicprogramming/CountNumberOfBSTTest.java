package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CountNumberOfBSTTest {
CountNumberOfBST countNumberOfBST=new CountNumberOfBST();
    @Test
    public void get() {
        assertThat(countNumberOfBST.get(3),is(5));
    } @Test
    public void get1() {
        assertThat(countNumberOfBST.get(4),is(5));
    }
}