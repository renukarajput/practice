package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MinStepsInGridTest {

    @Test
    public void minStepsInGrid(){
       assertThat(new MinStepsInGrid().getMinSteps(new int[]{0,0},new int[]{1,1},new int[]{1,2}),is(2));
    }

    @Test
    public void minStepsInGrid_1(){
        ArrayList<Integer> xlist=new ArrayList<>(Arrays.asList(0,1,1));
        ArrayList<Integer> ylist=new ArrayList<>(Arrays.asList(0,1,2));
        assertThat(new MinStepsInGrid().getMinSteps(xlist,ylist),is(2));
    }

    @Test
    public void getMinDistanceOnDiagonal() {
      assertThat(new MinStepsInGrid().getMinDistance(0,0,4,4),is(4));
    }
    @Test
    public void getMinDistanceOnDiagonal_rev() {
      assertThat(new MinStepsInGrid().getMinDistance(4,4,0,0),is(4));
    }

    @Test
    public void getMinDistance() {
        assertThat(new MinStepsInGrid().getMinDistance(1,2,4,3),is(3));
    }
    @Test
    public void getMinDistance_rev() {
        assertThat(new MinStepsInGrid().getMinDistance(4,3,1,2),is(3));
    }
    @Test
    public void getMinDistance2() {
        assertThat(new MinStepsInGrid().getMinDistance(1,4,4,2),is(3));
    }
    @Test
    public void getMinDistance2_rev() {
        assertThat(new MinStepsInGrid().getMinDistance(4,2,1,4),is(3));
    }


    @Test
    public void getMinDistance3() {
        assertThat(new MinStepsInGrid().getMinDistance(0,4,4,2),is(4));
    }
    @Test
    public void getMinDistance3_rev() {
        assertThat(new MinStepsInGrid().getMinDistance(4,2,0,4),is(4));
    }
}