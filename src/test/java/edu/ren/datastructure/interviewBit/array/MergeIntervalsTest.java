package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by rrn3194 on 11/20/18.
 */
public class MergeIntervalsTest {

    @Test
    public void mergeInterval_0() {
        ArrayList<Interval> input = new ArrayList<>();
        input.add(new Interval(2, 10));
        input.add(new Interval(5,10));
        input.add(new Interval(10, 15));
        List<Interval> result = new MergeIntervals().merge(input);
        assertThat(result.size(), is(1));
    }


    @Test
    public void mergeInterval_1() {
        ArrayList<Interval> input = new ArrayList<>();
        input.add(new Interval(1, 3));
        input.add(new Interval(2, 6));
        input.add(new Interval(8, 10));
        input.add(new Interval(15, 18));
        List<Interval> result = new MergeIntervals().merge(input);
        assertThat(result.size(), is(3));
        assertThat(result.get(0).end, is(6));
    }

    @Test
    public void mergeInterval_2() {
        ArrayList<Interval> input = new ArrayList<>();
        input.add(new Interval(1, 3));
        input.add(new Interval(4, 8));
        input.add(new Interval(5, 9));
        List<Interval> result = new MergeIntervals().merge(input);
        assertThat(result.size(), is(2));
        assertThat(result.get(0).end, is(3));
    }

    @Test
    public void mergeInterval_3() {
        ArrayList<Interval> input = new ArrayList<>();
        input.add(new Interval(1, 10));
        input.add(new Interval(2, 6));
        input.add(new Interval(3, 8));
        input.add(new Interval(4, 9));
        List<Interval> result = new MergeIntervals().merge(input);
        assertThat(result.size(), is(1));
        assertThat(result.get(0).end, is(10));
    }

    @Test
    public void mergeInterval_4() {
        ArrayList<Interval> input = new ArrayList<>();
        input.add(new Interval(1, 3));
        input.add(new Interval(4, 6));
        input.add(new Interval(5, 10));
        input.add(new Interval(15, 18));
        List<Interval> result = new MergeIntervals().merge(input);
        assertThat(result.size(), is(3));
        assertThat(result.get(1).end, is(10));
        assertThat(result.get(1).start, is(4));
    }
    @Test
    public void mergeInterval_5() {
        ArrayList<Interval> input = new ArrayList<>();
        input.add(new Interval(4, 6));
        input.add(new Interval(5, 8));
        input.add(new Interval(15, 18));
        input.add(new Interval(5, 10));
        List<Interval> result = new MergeIntervals().merge(input);
        assertThat(result.size(), is(2));
        assertThat(result.get(1).end, is(18));
        assertThat(result.get(1).start, is(15));
    }
}