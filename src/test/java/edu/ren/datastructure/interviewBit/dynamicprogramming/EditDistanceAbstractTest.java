package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public abstract class EditDistanceAbstractTest {
    EditDistance editDistance = getEditDistance();

    protected abstract EditDistance getEditDistance();

    @Test
    public void getDistance() {
        assertThat(editDistance.getDistance("Anshuman", "Antihuman"), is(2));
    }


    @Test
    public void getDistance_1() {
        assertThat(editDistance.getDistance("ABC", "ABD"), is(1));
    }

    @Test
    public void getDistance_2() {
        assertThat(editDistance.getDistance("APPLE", "STAPLE"), is(3));
    }

    @Test
    public void getDistance_4() {
        assertThat(editDistance.getDistance("AA","" ), is(2));
    }
}