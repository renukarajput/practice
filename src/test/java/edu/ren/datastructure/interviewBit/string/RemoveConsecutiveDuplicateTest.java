package edu.ren.datastructure.interviewBit.string;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RemoveConsecutiveDuplicateTest {
    RemoveConsecutiveDuplicate rm = new RemoveConsecutiveDuplicate();
    @Test
    public void input_1()  {
        String input = "ABCCBACDA";
        String output = rm.removeAllConsecutiveDuplicate(input);
        assertThat(output, is("CDA"));
    }

    @Test
    public void input_2()  {
        String input = "AABBCDEEF";
        String output = rm.removeAllConsecutiveDuplicate(input);
        assertThat(output, is("CDF"));
    }

    @Test
    public void input_3()  {
        String input = "ABCPCBACDA";
        String output = rm.removeAllConsecutiveDuplicate(input);
        assertThat(output, is("PCDA"));
    }

    @Test
    public void input_4()  {
        String input = "geek";
        String output = rm.removeAllConsecutiveDuplicate(input);
        assertThat(output, is("gk"));
    }

}