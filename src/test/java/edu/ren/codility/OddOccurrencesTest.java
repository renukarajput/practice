package edu.ren.codility;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class OddOccurrencesTest {

    OddOccurrences oddOccurrences = new OddOccurrences();

    @Test
    public void input_1() {
        assertThat(oddOccurrences.find(new int[]{9, 3, 9, 3, 9, 7, 9}), is(7));
    }

    @Test
    public void input_2() {
        assertThat(oddOccurrences.find(new int[]{9, 3, 9, 3, 9, 9}), is(0));
    }

    @Test
    public void input_3() {
        assertThat(oddOccurrences.find(new int[]{7, 8, 7, 7, 7, 8, 8}), is(8));
    }

    @Test
    public void input_4() {
        assertThat(oddOccurrences.find(new int[]{2,2,2}), is(2));
    }
}