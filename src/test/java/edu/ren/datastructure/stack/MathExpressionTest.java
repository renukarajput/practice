package edu.ren.datastructure.stack;

import org.junit.Test;
import static org.junit.Assert.*;

public class MathExpressionTest {
    MathExpression expression = balancedMathExpression();

    protected MathExpression balancedMathExpression() {
        return new MathExpression();
    }

    @Test
    public void isValidExpressionInput_1() {
        String input = "{(1*2)+(4/3)}";
        Boolean output = expression.isValidExpression(input);
        assertTrue(output);
    }

    @Test
    public void isValidExpressionInput_2() {
        String input = "{(1)}";
        boolean output = expression.isValidExpression(input);
        assertTrue(output);
    }

    @Test
    public void isValidExpressionInput_3() {
        String input = "{(1*2)+(4/3)}}";
        Boolean output = expression.isValidExpression(input);
        assertFalse(output);
    }

    @Test
    public void isValidExpressionInput_4() {
        String input = "{([2/4])}";
        Boolean output = expression.isValidExpression(input);
        assertTrue(output);
    }

    @Test
    public void isValidExpressionInput_5() {
        String input = "{([2/4])]}";
        Boolean output = expression.isValidExpression(input);
        assertFalse(output);
    }

    @Test
    public void isValidExpressionInput_6() {
        String input = "{}()[]";
        Boolean output = expression.isValidExpression(input);
        assertTrue(output);
    }

    @Test
    public void isValidExpressionInput_7() {
        String input = "{(})";
        Boolean output = expression.isValidExpression(input);
        assertFalse(output);
    }

    @Test
    public void isValidExpressionInput_8() {
        String input = "{()}[]";
        Boolean output = expression.isValidExpression(input);
        assertTrue(output);
    }

}