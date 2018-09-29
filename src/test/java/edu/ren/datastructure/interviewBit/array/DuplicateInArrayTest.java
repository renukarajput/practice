package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;
//0 0 1
//0 1 0
//0 1 1
public class DuplicateInArrayTest {

    @Test
    public void and() {
        assertThat(new DuplicateInArray().and(new int[]{1,2,3}),is(0));
    }

    @Test
    public void and_1() {
        assertThat(new DuplicateInArray().and(new int[]{1,2,3,4}),is(0));
    }

    @Test
    public void andNotZero() {
        assertThat(new DuplicateInArray().and(new int[]{1,2,3,2}),is(not(0)));
    }

    @Test
    public void andNotZeroAssociative_1() {
        assertThat(new DuplicateInArray().and(new int[]{1,2,3})^2,is(not(0)));
    }

    @Test
    public void andNotZeroAssociative() {
        assertThat(new DuplicateInArray().and(new int[]{1,2,3})^4,is(not(0)));
    }
}