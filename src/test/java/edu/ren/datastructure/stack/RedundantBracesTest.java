package edu.ren.datastructure.stack;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RedundantBracesTest {
    RedundantBraces redundantBraces = new RedundantBraces();

    @Test
    public void input_1() {
        String input = "((a + b))";
        assertThat(redundantBraces.isRedundant(input), is(1));
    }

    @Test
    public void input_2() {
        String input = "(a+(a+b))";
        assertThat(redundantBraces.isRedundant(input), is(0));
    }

    @Test
    public void input_3() {
        String input = "(a+(a+b)*(a-b)/(a*b))";
        assertThat(redundantBraces.isRedundant(input), is(0));
    }

    @Test
    public void input_4() {
        String input = "(a+((a+b))*((a-b))/(a*b))";
        assertThat(redundantBraces.isRedundant(input), is(1));
    }

    @Test
    public void input_5() {
        String input = "(a+((6)*a+b))*((a-b))/(a*b))";
        assertThat(redundantBraces.isRedundant(input), is(1));
    }

//    @Test
//    public void input_6() {
//        String input = "(a+(b)/c)";
//        assertThat(redundantBraces.isRedundant(input), is(1));
//    }

    @Test
    public void input_7() {
        String input = "(a+b*(c-d))";
        assertThat(redundantBraces.isRedundant(input), is(0));
    }

    @Test
    public void input_8() {
        String input = "((a+b))";
        assertThat(redundantBraces.isRedundant(input), is(1));
    }
    @Test
    public void input_9() {
        String input = "(((a+b))+c)";
        assertThat(redundantBraces.isRedundant(input), is(1));
    }

}