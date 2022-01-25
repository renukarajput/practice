package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class MinJumpStepsToEndWithBlockageDPTest extends MinJumpStepsToEndWithBlockageAbstractTest{


    @Override
    protected MinJumpStepsToEndWithBlockage getMinJumpStepsToEndWithBlockage() {
        return new MinJumpStepsToEndWithBlockageDP();
    }
}