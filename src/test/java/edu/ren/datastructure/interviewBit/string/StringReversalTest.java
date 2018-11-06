package edu.ren.datastructure.interviewBit.string;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by kumarrak on 06/11/18.
 */
public class StringReversalTest {
    @Test
    public void reverse() throws Exception {
        String str = "  this is   a new   world  of programming   ";
        final String reversed = new StringReversal().reverse(str);
        assertThat(reversed, is("programming of world new a is this"));
        System.out.println(reversed);

    }
    @Test
    public void reverse_1() throws Exception {
        String str = "  this is   a new   world  of t";
        final String reversed = new StringReversal().reverse(str);
        assertThat(reversed, is("t of world new a is this"));

    }

    @Test
    public void reverse_2() throws Exception {
        String str = "  a";
        final String reversed = new StringReversal().reverse(str);
        assertThat(reversed, is("a"));

    }

}