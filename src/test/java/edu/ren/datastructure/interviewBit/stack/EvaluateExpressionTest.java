package edu.ren.datastructure.interviewBit.stack;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class EvaluateExpressionTest {

    EvaluateExpression evaluateExpression = new EvaluateExpression();

    @Test
    public void input_1() {
        String[] input = {"2", "1", "+", "3", "*"};
        int result = evaluateExpression.result(input);
        assertThat(result, is(9));
    }

    @Test
    public void input_2() {
        String[] input = {"4", "13", "5", "/", "+"};
        int result = evaluateExpression.result(input);
        assertThat(result, is(6));
    }

    @Test
    public void input_3() {
        String[] input = {"2", "3", "1", "*", "+", "9", "-"};
        int result = evaluateExpression.result(input);
        assertThat(result, is(-4));
    }

    @Test
    public void input_4() {
        String[] input = {"4", "5", "13", "/", "+"};
        int result = evaluateExpression.result(input);
        assertThat(result, is(4));
    }
}