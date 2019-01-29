package edu.ren.datastructure.interviewBit.greedy;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class SeatsTest {
Seats seats=new Seats();
    @Test
    public void minMoves() {
        int result= seats.minMoves(". . . . x . . x x . . . x . .".replaceAll(" ",""));
        assertThat(result,is(5));
    }
}