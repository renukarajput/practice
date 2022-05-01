package edu.ren.datastructure.interviewBit.queue;


public class MaximumInSlidingWindowUsingDequeTest extends MaximumInSlidingWindowAbstractTest{

    @Override
    protected MaximumInSlidingWindow getMaximumInSlidingWindow() {
        return new MaximumInSlidingWindowUsingDeque();
    }
}