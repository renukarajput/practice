package edu.ren.datastructure.interviewBit.backtracking;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class KthSequenceTest {
    KthSequence kthSequence = new KthSequence();

    @Test
    public void getKth() {
        assertThat(kthSequence.getKth("abc", 4), is("aa"));
    }
    @Test
    public void getKth_0() {
        for (int i = 1; i <29 ; i++) {
            System.out.println(i+" = "+kthSequence.getKth("abc", i));
        }
    }
}