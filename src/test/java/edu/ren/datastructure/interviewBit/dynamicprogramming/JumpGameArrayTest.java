package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class JumpGameArrayTest {
JumpGameArray jumpGameArray=new JumpGameArray();

    @Test
    public void isFeasible() {
        Integer[] arr={2,3,1,1,4};
       assertTrue(jumpGameArray.isFeasible(arr));
    }

  @Test
    public void isNotFeasible() {
        Integer[] arr={3,2,1,0,4};
       assertFalse(jumpGameArray.isFeasible(arr));
    }

    @Test
    public void isNFeasible_0() {
        Integer[] arr={0};
       assertTrue(jumpGameArray.isFeasible(arr));
    }

    @Test
    public void isNotFeasible_0() {
        Integer[] arr={1,0,1,1};
        assertFalse(jumpGameArray.isFeasible(arr));
    }

    @Test
    public void isFeasible_2() {
        Integer[] arr={10, 0, 1, 1, 0};
        assertTrue(jumpGameArray.isFeasible(arr));
    }

}