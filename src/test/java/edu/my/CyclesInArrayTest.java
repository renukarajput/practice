package edu.my;

import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CyclesInArrayTest {

    @Test
    public void count() {
        List<Set<Integer>> cycle = new CyclesInArray().count(new int[]{2, 0, 1});
        System.out.println(cycle);
        assertThat(cycle.size(),is(1));
    }
    @Test
    public void count1() {
        List<Set<Integer>> cycle = new CyclesInArray().count(new int[]{2, 0, 1,5,6,4,5});
        System.out.println(cycle);
        assertThat(cycle.size(),is(2));
    }


    @Test
    public void countNoCycle() {
        List<Set<Integer>> cycle = new CyclesInArray().count(new int[]{0, 2, 2});
        assertThat(cycle.size(),is(0));
    }

    @Test
    public void countNoCycle1() {
        List<Set<Integer>> cycle = new CyclesInArray().count(new int[]{0, 2, 1});
        assertThat(cycle.size(),is(1));
    }
}