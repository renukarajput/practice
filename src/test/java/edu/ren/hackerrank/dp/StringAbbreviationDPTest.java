package edu.ren.hackerrank.dp;

import static org.junit.Assert.*;

public class StringAbbreviationDPTest extends StringAbbreviationAbstractTest{

    @Override
    protected StringAbbreviation getStringAbbreviation() {
        return new StringAbbreviationDP();
    }
}