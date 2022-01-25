package edu.leetcode.dp;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MinimumRoundingErrorTest {

    @Test
    public void minimizeError() {
      assertThat(new MinimumRoundingError().minimizeError(new String[]{"0.700","2.800","4.900"},8),is("1.000"));
    }


    @Test
    public void minimizeError_na() {
        assertThat(new MinimumRoundingError().minimizeError(new String[]{"1.500","2.500","3.500"},10),is("-1"));
    }



}