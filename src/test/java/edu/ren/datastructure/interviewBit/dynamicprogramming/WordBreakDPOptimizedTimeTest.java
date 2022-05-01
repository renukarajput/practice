package edu.ren.datastructure.interviewBit.dynamicprogramming;

import static org.junit.Assert.*;

public class WordBreakDPOptimizedTimeTest extends WordBreakAbstractTest{

    @Override
    protected WordBreak getWordBreak() {
        return new WordBreakDPOptimizedTime();
    }
}