package edu.ren.datastructure.stack;


public class BalancedMathExpressionTest extends MathExpressionTest {

    @Override
    protected MathExpression balancedMathExpression() {
        return new BalancedMathExpression();
    }
}