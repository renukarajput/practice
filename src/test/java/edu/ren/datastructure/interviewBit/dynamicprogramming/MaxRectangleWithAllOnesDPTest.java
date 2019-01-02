package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class MaxRectangleWithAllOnesDPTest extends MaxRectangleWithAllOnesAbstractTest{

    @Override
    protected MaxRectangleWithAllOnes getMaxRectangleWithAllOnes() {
        return new MaxRectangleWithAllOnesDP();
    }
}