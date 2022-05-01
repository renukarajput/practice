package edu.ren.datastructure.interviewBit.backtracking;

import org.junit.Test;


import static org.junit.Assert.*;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

public class AllPairParenthesesTest {
    AllPairParentheses allPairParentheses = new AllPairParentheses();

    @Test
    public void generate_1() {
        assertThat(allPairParentheses.generate(1), contains("()"));
    }

    @Test
    public void generate_2() {
        assertThat(allPairParentheses.generate(2), contains("(())", "()()"));
    }

    @Test
    public void generate_3() {
        assertThat(allPairParentheses.generate(3), contains("((()))", "(()())", "(())()", "()(())", "()()()"
        ));
    }
}