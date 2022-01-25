package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MaxValueHorseArrangementTest {
    MaxValueHorseArrangement maxValueHorseArrangement=new MaxValueHorseArrangement();

    @Test
    public void maxValueArrangement() {
        assertThat(maxValueHorseArrangement.get("WWWB",2),is(0));
    }

    @Test
    public void maxValueArrangement_1() {
        assertThat(maxValueHorseArrangement.get("WBWWBW",2),is(3));
    }
}