package edu.ren.datastructure.interviewBit.dynamicprogramming;

import static org.junit.Assert.*;

public class RegexMatchDPTest extends RegexMatchAbstractTest{

    @Override
    protected RegexMatch getRegexMatch() {
        return new RegexMatchDP();
    }
}