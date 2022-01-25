package edu.ren.datastructure.interviewBit.backtracking;

import org.junit.Test;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.*;

public abstract class GrayCodeAbstractTest {
    GrayCode grayCode= getGrayCode();

    protected abstract GrayCode getGrayCode();

    @Test
    public void grayCode() {
       assertThat(grayCode.get(3),contains(0, 1, 3, 2, 6, 7, 5, 4));
    }

    @Test
    public void grayCode_1() {
       assertThat(grayCode.get(2),contains(0, 1, 3, 2));
    }
}