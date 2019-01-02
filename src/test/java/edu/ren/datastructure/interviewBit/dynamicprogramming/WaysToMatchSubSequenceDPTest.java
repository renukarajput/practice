package edu.ren.datastructure.interviewBit.dynamicprogramming;

import static org.junit.Assert.*;

public class WaysToMatchSubSequenceDPTest extends WaysToMatchSubSequenceAbstractTest{

    @Override
    protected WaysToMatchSubSequence getWaysToMatchSubSequence() {
        return new WaysToMatchSubSequenceDP();
    }
}