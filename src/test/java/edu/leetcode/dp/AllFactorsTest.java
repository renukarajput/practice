package edu.leetcode.dp;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class AllFactorsTest {
    @Test
    public void getFactors() {
        assertThat(new AllFactors().getFactors(6).toString(),is("[[2, 3]]"));
    }

    @Test
    public void getFactors_2() {
       assertThat(new AllFactors().getFactors(12).toString(),is("[[2, 2, 3], [2, 6], [3, 4]]"));
    }

    @Test
    public void getFactors_01() {
        assertThat(new AllFactors().getFactors(37).toString(),is("[]"));
    }

    @Test
    public void getFactors_18() {
        assertThat(new AllFactors().getFactors(18).toString(),is("[[2, 3, 3], [2, 9], [3, 6]]"));
    }
}