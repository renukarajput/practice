package edu.ren.misc.problems;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void input_1(){
        assertThat(Factorial.tailRecursionFactorial(5,1), is(120));
    }
}