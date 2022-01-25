package edu.ren.datastructure.interviewBit.array;

import static org.junit.Assert.*;

public class CountOfArray3Test extends CountOfArrayTest{
    //2, 3, 3, 2, 5
    //1,2,2,1,4
    //
    @Override
    protected void fillCount(int[] arr) {
        new CountOfArray3().count(arr);
    }
}