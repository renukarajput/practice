package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public abstract class MinJumpGameArrayAbstractTest {
    MinJumpGameArray minJumpGameArray = getMinJumpGameArray();

    protected abstract MinJumpGameArray getMinJumpGameArray();

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

    @Test
    public void minJumpsInOne() {
        Integer[] arr={10, 0, 1, 1, 0};
        assertThat(minJumpGameArray.minJumps(arr),is(1));
    }

    @Test
    public void minJumpsInNotFeasible() {
        Integer[] arr={0, 10, 1, 1, 0};
        assertThat(minJumpGameArray.minJumps(arr),is(-1));
    }

}