package edu.ren.datastructure.interviewBit.array;

public class FlipIntervalForMaxOnesOptimizedTest extends AbstractFlipIntervalForMaxOneTest {
    @Override
    protected FlipIntervalForMaximumOnes getFlipper() {
        return new FlipIntervalForMaxOnesOptimized();
    }
}