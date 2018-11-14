package edu.ren.datastructure.interviewBit.queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumInSlidingWindowUsingDequeTest extends MaximumInSlidingWindowAbstractTest{

    @Override
    protected MaximumInSlidingWindow getMaximumInSlidingWindow() {
        return new MaximumInSlidingWindowUsingDeque();
    }
}