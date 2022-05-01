package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumDistanceOrderedPairOptimizedTest extends MaximumDistanceOrderedPairTest{

    @Override
    protected MaximumDistanceOrderedPair getMaximumDistanceOrderedPair() {
        return new MaximumDistanceOrderedPairOptimized();
    }
}