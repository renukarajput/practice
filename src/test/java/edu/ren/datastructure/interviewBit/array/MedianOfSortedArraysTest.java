package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

public class MedianOfSortedArraysTest {

    //1, 3, 4, 2, 6, 5, 8, 7
    //1 2 3 4 5 6 7 8
    @Test
    public void median() {
        int [] one={1,4,6};
        int [] two={2,3,5};
        //1 2 3 4 5 6
        new MedianOfSortedArraysOfEqualSize().median(one,two);
    }
}