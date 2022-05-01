package edu.ren.misc.problems;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RemoveDuplicateElementsTest {
    RemoveDuplicateElements removeDuplicateElements = new RemoveDuplicateElements();

    @Test
    public void remove_1() {
        int actual = removeDuplicateElements.remove(new int[]{1,1,2});
        assertThat(actual, is(2));
    }

    @Test
    public void remove_2() {
        int actual = removeDuplicateElements.remove(new int[]{1,2,3,4,5});
        assertThat(actual, is(5));
    }
}