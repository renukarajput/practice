package edu.ren.hackerrank.dp;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public abstract class StringAbbreviationAbstractTest {
    StringAbbreviation stringAbbreviation= getStringAbbreviation();

    protected abstract StringAbbreviation getStringAbbreviation();

    @Test
    public void isTransformFeasible() {
        assertThat(stringAbbreviation.isFeasible("ABcDE","ABDE"),is(true));
    }

    @Test
    public void isTransformFeasible_1() {
        assertThat(stringAbbreviation.isFeasible("ABcDE","ABFDE"),is(false));
    }

    @Test
    public void isTransformFeasible_2() {
        assertThat(stringAbbreviation.isFeasible("aabbde",""),is(true));
    }

    @Test
    public void isTransformFeasible_3() {
        assertThat(stringAbbreviation.isFeasible("aaAbbBdeC","ABC"),is(true));
    }
}