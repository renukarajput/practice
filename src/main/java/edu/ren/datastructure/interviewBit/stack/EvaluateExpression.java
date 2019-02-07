package edu.ren.datastructure.interviewBit.stack;

import java.util.*;

public class EvaluateExpression {
    // ["2", "1", "+", "3", "*"]
    //"4", "13", "5", "/", "+"

    Stack<Integer> operandStack = new Stack<>();
    Set<String> operatorSet = new HashSet<>();

    public int result(String[] input) {
        return result(new ArrayList<>(Arrays.asList(input)));
    }

    private int result(ArrayList<String> input) {
        operatorSet.addAll(Arrays.asList("+", "-", "/", "*"));
        for (int i = 0; i < input.size(); i++) {
            if (!operatorSet.contains(input.get(i))) {
                Integer current = Integer.parseInt(input.get(i));
                operandStack.push(current);
            } else {
                Integer op2 = operandStack.pop();
                Integer op1 = operandStack.pop();
                Integer result = processOperation(op1, op2, input.get(i));
                operandStack.push(result);
            }
        }
        return operandStack.peek();
    }

    private Integer processOperation(Integer first, Integer second, String op) {
        Integer result = 0;
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                result = first / second;
                break;
        }
        return result;
    }
}
