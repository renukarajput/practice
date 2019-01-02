package edu.ren.geeks.string;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void reverseStringInput_1() {
        String input = "a$b,c$d#";
        assertThat(ReverseString.reverseStringInput(input), is("d$c,b$a#"));
    }
    @Test
    public void reverseStringInput_2() {
        String input = "#,a$b$,$c$d#";
        assertThat(ReverseString.reverseStringInput(input), is("#,d$c$,$b$a#"));
    }

}