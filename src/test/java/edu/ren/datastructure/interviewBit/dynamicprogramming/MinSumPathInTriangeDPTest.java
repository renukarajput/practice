package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class MinSumPathInTriangeDPTest extends MinSumPathInTriangleAbstractTest{

    @Override
    protected MinSumPathInTriangle getMinSumPathInTriange() {
        return new MinSumPathInTriangeDP();
    }
}