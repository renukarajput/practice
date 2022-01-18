package edu.leetcode.misc;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.contains;

public class ElementsSmallerOnLeftTest {
    ElementsSmallerOnLeft elementsSmallerOnLeft = new ElementsSmallerOnLeft();

    @Test
    public void countSmaller() {
        assertThat(elementsSmallerOnLeft.countSmaller(new int[]{5, 2, 6, 1}),
                contains(2, 1, 1, 0));
    }

    @Test
    public void countSmaller01() {
        assertThat(elementsSmallerOnLeft.countSmaller(new int[]{-1,-1}),
                contains(0, 0));
    }
}