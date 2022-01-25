package edu.ren.datastructure.interviewBit.string;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LastWordLengthTest {
    @Test
    public void input_1() {
        int output = LastWordLength.lengthOf("the sky is blue  ");
        assertThat(output, is(4));
    }

    @Test
    public void input_2() {
        int output = LastWordLength.lengthOf("Hello World");
        assertThat(output, is(5));
    }

    @Test
    public void input_3() {
        int output = LastWordLength.lengthOf("Hello World ");
        assertThat(output, is(5));
    }

    @Test
    public void input_4() {
        int output = LastWordLength.lengthOf("a");
        assertThat(output, is(1));
    }

}