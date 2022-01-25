package edu.ren.datastructure.interviewBit.dynamicprogramming;

import static org.junit.Assert.*;

public class LongestArithmenticProgressionOptimisedTest extends LongestArithmeticProgressionAbstractTest{

    @Override
    protected LongestArithmeticProgression getLongestArithmeticProgression() {
        return new LongestArithmenticProgressionOptimised();
    }
}