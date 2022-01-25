package edu.ren.datastructure.stack;


import java.util.Stack;

public class BalancedMathExpression extends MathExpression{

    SymbolFactory factory = new SymbolFactory();

    @Override
    public boolean isValidExpression(String input) {
        Stack<Symbol> stack = new Stack();
        for (Character ch : input.toCharArray()) {
            Symbol currSymbol = factory.getSymbol(ch);
            if (currSymbol == null) {
                continue;
            }
            if (currSymbol.isOpening()) {
                stack.push(currSymbol);
            }

            if (!currSymbol.isOpening()) {
                if (stack.isEmpty())
                    return false;
                Symbol top = stack.peek();
                if (top.getPair().equals(ch)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        if (stack.isEmpty()) return true;

        return false;
    }

}
