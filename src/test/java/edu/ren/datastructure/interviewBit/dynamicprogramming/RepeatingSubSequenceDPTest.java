package edu.ren.datastructure.interviewBit.dynamicprogramming;

import static org.junit.Assert.*;

public class RepeatingSubSequenceDPTest extends RepeatingSubSequenceAbstractTest{

    @Override
    protected RepeatingSubSequence getRepeatingSubSequence() {
        return new RepeatingSubSequenceDP();
    }
}