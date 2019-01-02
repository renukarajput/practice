package edu.ren.datastructure.stack;

import java.util.*;
import java.util.Stack;

/**
 * Created by rrn3194 on 11/21/18.
 */
public class RedundantBraces extends MathExpression {
    public int isRedundant(String input) {
        Character[] characters = {'+', '-', '*', '/', '{', '[', '('};

        Set<Character> openingCharSet = new HashSet<>();
        openingCharSet.addAll(Arrays.asList(characters));

        for (int i = 0; i < input.length() - 1; ) {
            if (input.charAt(i) == input.charAt(i + 1) && openingCharSet.contains(input.charAt(i))) {
                return 1;
            } else {
                i++;
            }
        }
        return 0;
    }

  /*  public int isRedundant(String input) {
        Stack<Character> stack = new Stack<>();
        Character[] characters = {'+', '-', '*', '/', '{', '[', '('};
        Set<Character> charSet = new HashSet<>();
        charSet.addAll(Arrays.asList(characters));

        int count = 0;
        for (Character ch : input.toCharArray()) {
            if (charSet.contains(ch)) {
                stack.push(ch);
            }

            if (ch == '}' || ch == ')' || ch == ']') {
                if (stack.isEmpty())
                    return 0;
                Character top = stack.peek();
                stack.pop();
                while (top != '(') {
                    if (charSet.contains(top)) {
                        count++;
                        top = stack.peek();
                        stack.pop();
                    }
                }

                if (count <= 1)
                    return 1;
            }
        }
        return 0;
    }*/
}
