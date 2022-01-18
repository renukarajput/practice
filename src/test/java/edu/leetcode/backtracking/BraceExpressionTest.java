package edu.leetcode.backtracking;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BraceExpressionTest {

    @Test
    public void expand() {
        BraceExpression braceExpression=new BraceExpression();
        String[] result = braceExpression.expand("{a,b}c{d,e}f");
        String[] expected={"acdf","acef","bcdf","bcef"};
        assertThat(result,is(expected));
    }

    @Test
    public void expand_1() {
        BraceExpression braceExpression=new BraceExpression();
        String[] result = braceExpression.expand("abcd");
        String[] expected={"abcd"};
        assertThat(result,is(expected));
    }


    @Test
    public void expand_2() {
        BraceExpression braceExpression=new BraceExpression();
        String[] result = braceExpression.expand("");
        String[] expected={""};
        assertThat(result,is(expected));
    }

}