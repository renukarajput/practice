package edu.ren.misc.problems;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class RemoveDuplicatesTest {
    RemoveDuplicates rm = new RemoveDuplicates();

    @Test
    public void remove() {
        String output = rm.remove("geeksforgeek");
        assertThat(output, is("gksforgk"));
    }

    @Test
    public void remove_1() {
        String output = rm.remove("renuukkaa");
        assertThat(output, is("ren"));
    }

    @Test
    public void remove_2() {
        String output = rm.remove("acaaabbbacddd");
        assertThat(output, is("acac"));
    }

    @Test
    public void remove_3() {
        String output = rm.remove("aaab");
        assertThat(output, is("b"));
    }

    @Test
    public void remove_4() {
        String output = rm.remove("sapient");
        assertThat(output, is("sapient"));
    }

    @Test
    public void remove_5() {
        String output = rm.remove("");
        assertThat(output, is(""));
    }

}