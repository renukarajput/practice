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

}