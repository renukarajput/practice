package edu.ren.datastructure.interviewBit.dynamicprogramming;

import edu.ren.datastructure.interviewBit.dynamicprogramming.MinJumpStepsToEndWithBlockage;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public abstract class MinJumpStepsToEndWithBlockageAbstractTest {
    MinJumpStepsToEndWithBlockage minJumpStepsToEndWithBlockage= getMinJumpStepsToEndWithBlockage();

    protected abstract MinJumpStepsToEndWithBlockage getMinJumpStepsToEndWithBlockage();

    @Test
    public void minSteps() {
        int[] arr={0,1,0,0,0,1,0};
       assertThat(minJumpStepsToEndWithBlockage.min(arr),is(3));
    }

    @Test
    public void minSteps_1() {
        int[] arr={0,1,0,0,1,0,0};
       assertThat(minJumpStepsToEndWithBlockage.min(arr),is(4));
    }

    @Test
    public void minSteps_2() {
        int[] arr={0,0};
       assertThat(minJumpStepsToEndWithBlockage.min(arr),is(1));
    }

    @Test
    public void minSteps_3() {
        int[] arr={0,1,0};
       assertThat(minJumpStepsToEndWithBlockage.min(arr),is(1));
    }

    @Test
    public void minSteps_4() {
        int[] arr={0,1,0};
       assertThat(minJumpStepsToEndWithBlockage.min(arr),is(1));
    }

    @Test
    public void minSteps_5() {
        int[] arr={0,1,0,1,1,0};
       assertThat(minJumpStepsToEndWithBlockage.min(arr),is(-1));
    }
}