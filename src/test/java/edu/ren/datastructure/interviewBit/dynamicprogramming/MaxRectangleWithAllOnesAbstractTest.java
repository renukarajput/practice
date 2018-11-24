package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public abstract class MaxRectangleWithAllOnesAbstractTest {
    MaxRectangleWithAllOnes maxRectangleWithAllOnes= getMaxRectangleWithAllOnes();

    protected abstract MaxRectangleWithAllOnes getMaxRectangleWithAllOnes();

    @Test
    public void getMaxArea(){
        Integer[][] grid={
                {1,1,1},
                {0,1,1},
                {1,0,0}};
       assertThat(maxRectangleWithAllOnes.max(grid),is(4));
    }

    @Test
    public void getMaxArea_1(){
        Integer[][] grid={
                {1,1,1},
                {0,1,1},
                {1,1,1}};
       assertThat(maxRectangleWithAllOnes.max(grid),is(6));
    }

}