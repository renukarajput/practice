package edu.ren.datastructure.interviewBit.backtracking;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class KthPermutationTest {
KthPermutation kthPermutation=new KthPermutation();
    @Test
    public void get() {
        assertThat(kthPermutation.get(3,2),is("132"));
    }
    @Test
    public void get_2() {
        assertThat(kthPermutation.get(3,4),is("231"));
    }
    @Test
    public void get_1() {
        assertThat(kthPermutation.get(2,2),is("21"));
    }

    @Test
    public void get_3() {
        assertThat(kthPermutation.get(3,5),is("312"));
    }
}