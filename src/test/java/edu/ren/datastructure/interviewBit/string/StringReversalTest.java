package edu.ren.datastructure.interviewBit.string;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StringReversalTest {
    @Test
    public void reverse_1() {
        String output = StringReversal.reverse("the sky is blue");
        assertThat(output, is("blue is sky the"));
    }

    @Test
    public void reverse_2() {
        String output = StringReversal.reverse("    the sky is blue    ");
        assertThat(output, is("blue is sky the"));
    }

    @Test
    public void reverse_3() {
        String output = StringReversal.reverse("    the sky      is    blue    ");
        assertThat(output, is("blue is sky the"));
    }

    @Test
    public void reverse_4() {
        String output = StringReversal.reverse("    the sky      is    blue    ");
        assertThat(output, is("blue is sky the"));
    }

    @Test
    public void reverse_5() {
        String output = StringReversal.reverse("hello");
        assertThat(output, is("hello"));
    }

    @Test
    public void reverse_6() {
        String output = StringReversal.reverse("  hello");
        assertThat(output, is("hello"));
    }

    @Test
    public void reverse_7() {
        String output = StringReversal.reverse("ankrqzzcel dyaiug y rkicv t");
        assertThat(output, is("t rkicv y dyaiug ankrqzzcel"));
    }

    @Test
    public void reverse_8() {
        String output = StringReversal.reverse(" a");
        assertThat(output, is("a"));
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