package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CountNumberOfBSTTest {
CountNumberOfBST countNumberOfBST=new CountNumberOfBST();
    @Test
    public void get() {
        assertThat(countNumberOfBST.get(3),is(5));
    }
}