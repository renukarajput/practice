package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MinJumpGameArrayTest {
    MinJumpGameArray minJumpGameArray =new MinJumpGameArray();

    @Test
    public void minJumps() {
        Integer[] arr={2,3,1,1,4};
        assertThat(minJumpGameArray.minJumps(arr),is(2));
    }

    @Test
    public void minJumpsWhenNotFeasible() {
        Integer[] arr = {3, 2, 1, 0, 4};
        assertThat(minJumpGameArray.minJumps(arr),is(-1));
    }
}