package edu.ren.datastructure.interviewBit.dynamicprogramming;

import edu.ren.datastructure.interviewBit.dynamicprogramming.LongestCommonSubSequence;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class LongestCommonSubSequenceTest {
LongestCommonSubSequence longestCommonSubSequence=new LongestCommonSubSequence();
    @Test
    public void lcsOf() {
       assertThat(longestCommonSubSequence.lcsOf("ABCDGH”","AEDFHR"),is("ADH"));
    }
}