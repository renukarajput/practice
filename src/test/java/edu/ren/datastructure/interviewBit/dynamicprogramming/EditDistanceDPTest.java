package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class EditDistanceDPTest extends EditDistanceAbstractTest{

    @Override
    protected EditDistance getEditDistance() {
        return new EditDistanceDP();
    }
}