package edu.ren.datastructure.interviewBit.queue;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MaximumInSlidingWindowTest extends MaximumInSlidingWindowAbstractTest{
    @Override
    protected MaximumInSlidingWindow getMaximumInSlidingWindow() {
        return new MaximumInSlidingWindow();
    }
}