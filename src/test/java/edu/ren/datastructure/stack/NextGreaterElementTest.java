package edu.ren.datastructure.stack;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NextGreaterElementTest {

    NextGreaterElement nextGreaterElement = new NextGreaterElement();

    @Test
    public void input_1() {
        int[] input = {11, 13, 21, 3};
        int[] expected = {13, 21, -1, -1};
        int[] actual = nextGreaterElement.get(input);
        assertThat(actual, is(expected));
    }

    @Test
    public void input_2() {
        int[] input = {4, 5, 2, 25};
        int[] expected = {5, 25, 25, -1};
        int[] actual = nextGreaterElement.get(input);
        assertThat(actual, is(expected));
    }

    @Test
    public void input_3() {
        int[] input = {5, 3, 2, 7, 6, 9};
        int[] expected = {7, 7, 7, 9, 9, -1};
        int[] actual = nextGreaterElement.get(input);
        assertThat(actual, is(expected));
    }

    @Test
    public void input_4() {
        int[] input = {13, 7, 6, 12};
        int[] expected = {-1, 12, 12, -1};
        int[] actual = nextGreaterElement.get(input);
        assertThat(actual, is(expected));
    }

    @Test
    public void input_5() {
        int[] input = {8, 6, 4, 7, 9, 3};
        int[] expected = {9, 7, 7, 9, -1, -1};
        int[] actual = nextGreaterElement.get(input);
        assertThat(actual, is(expected));
    }

    @Test
    public void input_6() {
        int[] input = {3, 2, 1};
        int[] expected = {-1, -1, -1};
        int[] actual = nextGreaterElement.get(input);
        assertThat(actual, is(expected));
    }
}