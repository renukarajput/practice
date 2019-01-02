package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public  class MinSumPathInTriangleAbstractTest {
    MinSumPathInTriangle minSumPathInTriangle= getMinSumPathInTriange();

    protected  MinSumPathInTriangle getMinSumPathInTriange(){
        return new MinSumPathInTriangeDP();
    };

    @Test
    public void minPathSum() {
        Integer[][] triangle={
                {2},
                {3,4},
                {6,5,7},
                {4,1,8,3}
        };
       assertThat(minSumPathInTriangle.minPath(triangle),is(11));
    }

    @Test
    public void minPathSum_1() {
        Integer[][] triangle={
                {2},
                {3,4},
                {6,5,7},
                {4,1,8,3},
                {100,101,4,5,7}
        };
       assertThat(minSumPathInTriangle.minPath(triangle),is(15));
    }
}