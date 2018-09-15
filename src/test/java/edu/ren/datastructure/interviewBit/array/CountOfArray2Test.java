package edu.ren.datastructure.interviewBit.array;

import static org.junit.Assert.*;

public class CountOfArray2Test extends CountOfArrayTest {
    @Override
    protected void fillCount(int[] arr) {
        new CountOfArray2().count(arr);
    }
}
